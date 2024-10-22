package com.app.transpoli.Facade;

import java.util.List;
import com.app.transpoli.Models.Assignment;

public interface IAssignments {

    /**
     * Recupera la lista de todas las asignaciones disponibles.
     *
     * @return una Lista que contiene todas las asignaciones.
     */
    public List<Assignment> assignmentList();

    /**
     * Busca una asignación por su identificador único (ID).
     *
     * @param id El identificador único de la asignación que se desea buscar.
     * @return La asignación encontrada con el ID especificado.
     */
    public Assignment findByAssignment(long id);

    /**
     * Guarda la asignación proporcionada. Si la asignación ya existe, la actualiza.
     *
     * @param assignment La asignación que se va a guardar o actualizar.
     */
    public void saveAssignment(Assignment assignment);

    /**
     * Elimina la asignación proporcionada del sistema.
     *
     * @param assignment La asignación que se va a eliminar.
     */
    public void deleteAssignment(Assignment assignment);

    /**
     * Finaliza una asignación identificada por su ID.
     *
     * @param id El identificador único de la asignación que se va a finalizar.
     * @return true si la asignación se ha finalizado correctamente, false en caso contrario.
     */
    public boolean finishAssignment(long id);

    /**
     * Asigna un conductor a una asignación específica.
     *
     * @param idDriver El identificador único del conductor.
     * @param idAssignment El identificador único de la asignación.
     * @return true si la asignación del conductor a la tarea fue exitosa, false en caso contrario.
     */
    public boolean assignmentDriver(long idDriver, long idAssignment);
}
