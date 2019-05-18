package com.unmsm.fisi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unmsm.fisi.entity.ManProducto;

@Repository
public interface ProductoRepository extends JpaRepository<ManProducto, Integer>{

}
