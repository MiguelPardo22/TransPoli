$(document).ready(function() {
	$('#vehiculeTable').DataTable({
		ajax: {
			url: 'http://localhost:8080/admin/vehiclesList',
			type: "GET",
		},
		columns: [
			{ data: "id" },
			{ data: "plate" },
			{ data: "mileage" },
			{ data: "model" },
			{ data: "type_vehicule" },
			{ data: "load_capacity" },
			{
				data: function(row) {
					return (row.person_id.names + " " + row.person_id.last_names).replace(/\n/g, '').trim();
				}
			},
			{ data: "state" },
			{ data: null, defaultContent: '<button class="btn btn-warning"><i class="fas fa-edit"></i></button>' },
			{ data: null, defaultContent: '<button class="btn btn-info"><i class="fas fa-ban"></i></button>' },
			{ data: null, defaultContent: '<button class="btn btn-danger"><i class="fas fa-trash"></i></button>' } 
		],
		language: {
			"lengthMenu": "Mostrar _MENU_ registros",
			"zeroRecords": "No se encontraron resultados",
			"info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
			"infoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
			"infoFiltered": "(filtrado de un total de _MAX_ registros)",
			"sSearch": "Buscar:",
			"sProcessing": "Procesando..."
		},
		responsive: true
	});
	
	$('#vehicleForm').submit(function(event) {
        event.preventDefault();
       
        var formData = $(this).serialize();

        $.ajax({
            url: 'http://localhost:8080/admin/vehicle/save', 
            type: 'POST',
            data: formData, 
            success: function(response) {
                alert('Vehículo registrado exitosamente!');
                window.location.href = '/admin/vehicles'; 
            },
            error: function(xhr, status, error) {
                alert('¡Algo salió mal! Intenta de nuevo. ' + error);
            }
        });
    });
	
});
