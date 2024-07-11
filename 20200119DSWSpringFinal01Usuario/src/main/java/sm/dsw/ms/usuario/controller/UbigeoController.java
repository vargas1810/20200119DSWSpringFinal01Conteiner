package sm.dsw.ms.usuario.controller;

import sm.dsw.ms.usuario.entity.Ubigeo;
import sm.dsw.ms.usuario.service.UbigeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ubigeos")
public class UbigeoController {

    @Autowired
    private UbigeoService ubigeoService;

    @GetMapping
    public List<Ubigeo> getAllUbigeos() {
        return ubigeoService.findAll();
    }

    // Otros endpoints CRUD
}

