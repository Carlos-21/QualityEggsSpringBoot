package com.unmsm.fisi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unmsm.fisi.entity.ManProveedor;
import com.unmsm.fisi.entity.ManProveedorId;

@Repository
public interface ProveedorRepository extends JpaRepository<ManProveedor, ManProveedorId>{

}
