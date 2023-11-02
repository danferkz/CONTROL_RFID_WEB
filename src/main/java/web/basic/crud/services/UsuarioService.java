package web.basic.crud.services;

import java.util.List;

import web.basic.crud.entities.Usuario;

public interface UsuarioService {
    List<Usuario> listarUsuarios();

    Usuario obtenerUsuarioPorId(Long id);

    void guardarUsuario(Usuario usuario);

    void eliminarUsuario(Long id);
}
