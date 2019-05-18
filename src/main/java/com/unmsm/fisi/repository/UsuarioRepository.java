package com.unmsm.fisi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unmsm.fisi.entity.SegUsuario;

@Repository
public interface UsuarioRepository extends JpaRepository<SegUsuario, String>{

}
