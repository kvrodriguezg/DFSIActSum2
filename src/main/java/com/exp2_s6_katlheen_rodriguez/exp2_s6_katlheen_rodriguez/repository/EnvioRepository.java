package com.exp2_s6_katlheen_rodriguez.exp2_s6_katlheen_rodriguez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exp2_s6_katlheen_rodriguez.exp2_s6_katlheen_rodriguez.model.Envio;

//Repositorio que hereda desde JPA para manejar operaciones CRUD
@Repository
public interface EnvioRepository extends JpaRepository<Envio, Long> {

}
