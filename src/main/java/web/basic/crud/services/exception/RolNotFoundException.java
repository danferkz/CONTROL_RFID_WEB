package web.basic.crud.services.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class RolNotFoundException extends RuntimeException {
    public RolNotFoundException(Long id) {
        super("Rol not found with id: " + id);
    }
}