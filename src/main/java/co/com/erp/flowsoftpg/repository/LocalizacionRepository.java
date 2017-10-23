package co.com.erp.flowsoftpg.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.erp.flowsoftpg.entity.Localizacion;

@Repository
public interface LocalizacionRepository extends JpaRepository<Localizacion, Serializable> {

}