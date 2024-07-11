package sm.dsw.ms.usuario.service;

import sm.dsw.ms.usuario.entity.Usuario;
import sm.dsw.ms.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class UsuarioService {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioService.class);

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        logger.info("Fetching all users from the database.");
        List<Usuario> usuarios = usuarioRepository.findAll();
        logger.info("Found {} users", usuarios.size());
        return usuarios;
    }
    
    public List<Usuario> findByRolNombre(String nombreRol) {
        return usuarioRepository.findByRolNombre(nombreRol);
    }

    // Otros métodos CRUD
}
