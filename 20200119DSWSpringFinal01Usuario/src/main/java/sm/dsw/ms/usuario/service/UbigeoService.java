package sm.dsw.ms.usuario.service;

import sm.dsw.ms.usuario.entity.Ubigeo;
import sm.dsw.ms.usuario.repository.UbigeoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbigeoService {

    @Autowired
    private UbigeoRepository ubigeoRepository;

    public List<Ubigeo> findAll() {
        return ubigeoRepository.findAll();
    }

    // Otros métodos CRUD
}
