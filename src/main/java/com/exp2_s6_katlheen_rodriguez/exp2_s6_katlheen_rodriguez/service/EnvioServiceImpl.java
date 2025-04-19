package com.exp2_s6_katlheen_rodriguez.exp2_s6_katlheen_rodriguez.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp2_s6_katlheen_rodriguez.exp2_s6_katlheen_rodriguez.model.Envio;
import com.exp2_s6_katlheen_rodriguez.exp2_s6_katlheen_rodriguez.repository.EnvioRepository;

//Implementación de los metodos del servicio
@Service
public class EnvioServiceImpl implements EnvioService {

    @Autowired
    private EnvioRepository envioRepository;

    //Obtener todos los envios
    @Override
    public List<Envio> getAllEnvios() {
        List<Envio> envios = envioRepository.findAll();
        System.out.println("Consultando envios: " + envios);
        return envios;
    }

    //Obtener un envio por id
    @Override
    public Optional<Envio> getEnvioById(Long id) {
        return envioRepository.findById(id);
    }

    //Crear un nuevo envio
    @Override
    public Envio createEnvio(Envio envio) {
        return envioRepository.save(envio);
    }

    //Actualizar un envio
    @Override
    public Envio updateEnvio(Long id, Envio envio) {
        if (envioRepository.existsById(id)) {
            envio.setId(id);
            return envioRepository.save(envio);
        } else {
            return null;
        }
    }

    //Eliminar un envio
    @Override
    public void deleteEnvio(Long id) {
        envioRepository.deleteById(id);
    }
}