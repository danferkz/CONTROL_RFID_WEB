package web.basic.crud.services;

import java.util.List;

import web.basic.crud.entities.Estudiante;

public interface EstudianteService {
    List<Estudiante> listarEstudiantes();

    Estudiante obtenerEstudiantePorId(Long id);

    void guardarEstudiante(Estudiante estudiante);

    void eliminarEstudiante(Long id);
}