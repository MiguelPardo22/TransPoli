package com.app.transpoli.Facade;

import java.util.List;
import com.app.transpoli.Models.People;

public interface IPeople {

    /**
     * Recupera la lista de todos los usuarios disponibles.
     *
     * @return una Lista que contiene todos los usuarios.
     */
    public List<People> ListPeopleUser();

    /**
     * Busca un usuario por su identificador único (ID).
     *
     * @param id El identificador único del usuario que se desea buscar.
     * @return El usuario encontrado con el ID especificado.
     */
    public People findByIdUser(long id);

    /**
     * Guarda el usuario proporcionado. Si el usuario ya existe, lo actualiza.
     *
     * @param people El usuario que se va a guardar o actualizar.
     */
    public void savePeopleUser(People people);

    /**
     * Elimina el usuario proporcionado del sistema.
     *
     * @param people El usuario que se va a eliminar.
     */
    public void deletePeopleUser(People people);

    /**
     * Inactiva el usuario identificado por el ID proporcionado.
     *
     * @param id El identificador único del usuario que se va a inactivar.
     */
    public void InactivateUsers(long id);
}
