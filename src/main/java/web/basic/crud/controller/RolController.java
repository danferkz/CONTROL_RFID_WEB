package web.basic.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import web.basic.crud.entities.Rol;
import web.basic.crud.services.RolService;



@RestController
@RequestMapping("/roles")
public class RolController {

    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping
    public List<Rol> listarRoles() {
        return rolService.listarRoles();
    }

    @GetMapping("/{id}")
    public Rol obtenerRol(@PathVariable Long id) {
        return rolService.obtenerRolPorId(id);
    }

    @PostMapping
    public void crearRol(@RequestBody Rol rol) {
        rolService.guardarRol(rol);
    }

    @DeleteMapping("/{id}")
    public void eliminarRol(@PathVariable Long id) {
        rolService.eliminarRol(id);
    }
}