package sm.dsw.ms.usuario.controller;

import sm.dsw.ms.usuario.entity.Usuario;
import sm.dsw.ms.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        logger.info("Received request to fetch all users.");
        List<Usuario> usuarios = usuarioService.findAll();
        logger.info("Returning {} users", usuarios.size());
        return usuarios;
    }
    
    @GetMapping("/rol/{nombreRol}")
    public List<Usuario> getUsuariosByRol(@PathVariable String nombreRol) {
        return usuarioService.findByRolNombre(nombreRol);
    }

    // Otros endpoints CRUD
}
