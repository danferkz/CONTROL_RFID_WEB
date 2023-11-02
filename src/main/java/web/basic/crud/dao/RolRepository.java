package web.basic.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.basic.crud.entities.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    // Métodos específicos si los hay
}
