package co.com.erp.flowsoftpg.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.erp.flowsoftpg.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Serializable> {

}