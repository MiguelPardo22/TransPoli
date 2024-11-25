package com.app.transpoli.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.app.transpoli.Facade.IUser;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfiguration {

	private final IUser iUser;

	// Constructor con la inyección de la interfaz IUser para usar un
	// UserDetailsService personalizado
	public SecurityConfiguration(IUser iUser) {
		this.iUser = iUser;
	}

	// Bean para la encriptación de contraseñas usando BCryptPasswordEncoder
	@Bean
	@Lazy
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// Bean para el provider de autenticación usando DaoAuthenticationProvider
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(iUser); // Usamos el servicio de usuarios personalizado
		auth.setPasswordEncoder(passwordEncoder()); // Establecemos el encoder de contraseñas
		return auth;
	}

	// Configuración del filtro de seguridad
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
				// Definición de las reglas de autorización para las URLs
				.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(authorize -> authorize
						.requestMatchers("/register/**", "/bookstores/**", "/Layout/*").permitAll() // Rutas
						// públicas
						.requestMatchers("/admin/**").hasRole("ADMIN") // Solo accesible por usuarios con rol
																		// ADMIN
						.requestMatchers("/user/**").hasAnyRole("USER", "ADMIN") // Accesible para USER y ADMIN
						.anyRequest().authenticated() // Otras rutas requieren autenticación
				)
				// Configuración del login
				.formLogin(form -> form.loginPage("/login").defaultSuccessUrl("/", true) // Redirigir a /index
																							// después del login
																							// exitoso
						.permitAll())
				// Configuración del logout
				.logout(logout -> logout.invalidateHttpSession(true) // Invalida la sesión
						.clearAuthentication(true) // Limpia la autenticación
						.logoutRequestMatcher(new AntPathRequestMatcher("/logout")) // Ruta de logout
						.logoutSuccessUrl("/login?logout") // Redirige a la página de login con un mensaje de logout
															// exitoso
						.permitAll() // Permite que todos accedan al logout
				// Configuración de página de error
				// 403
				);
		;

		return http.build();
	}
}