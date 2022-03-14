package com.restaurante.pekin.repository;

import com.restaurante.pekin.model.DetalleProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hernan
 */
@Repository
public interface DetalleMenuRepository extends JpaRepository<DetalleProducto, Integer> {

}
