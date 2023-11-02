package web.basic.crud.services.exception;



public class EstudianteNotFoundException extends RuntimeException {
    public EstudianteNotFoundException(Long id) {
        super("No se encontró ningún estudiante con id: " + id);
    }
}