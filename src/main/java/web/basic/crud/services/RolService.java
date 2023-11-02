package web.basic.crud.services;

import java.util.List;

import web.basic.crud.entities.Rol;

public interface RolService {
    List<Rol> listarRoles();

    Rol obtenerRolPorId(Long id);

    void guardarRol(Rol rol);

    void eliminarRol(Long id);

	Rol obtenerRolPorId(String id);
}
