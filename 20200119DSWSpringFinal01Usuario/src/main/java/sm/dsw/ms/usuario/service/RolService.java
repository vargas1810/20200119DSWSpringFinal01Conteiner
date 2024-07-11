package sm.dsw.ms.usuario.service;

import sm.dsw.ms.usuario.entity.Rol;
import sm.dsw.ms.usuario.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    // Otros métodos CRUD
}
