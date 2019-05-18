package com.unmsm.fisi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unmsm.fisi.entity.SegPerfil;

@Repository
public interface PerfilRepository extends JpaRepository<SegPerfil, Integer>{

}
