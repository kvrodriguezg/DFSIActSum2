package com.exp2_s6_katlheen_rodriguez.exp2_s6_katlheen_rodriguez.service;
import java.util.List;
import java.util.Optional;
import com.exp2_s6_katlheen_rodriguez.exp2_s6_katlheen_rodriguez.model.Envio;

public interface EnvioService {

    //Metodos a utilizar
    List<Envio> getAllEnvios();
    Optional<Envio> getEnvioById(Long id);
    Envio createEnvio(Envio envio);
    Envio updateEnvio(Long id,Envio envio);
    void deleteEnvio(Long id);
}