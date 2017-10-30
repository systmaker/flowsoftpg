package co.com.erp.flowsoftpg.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.erp.flowsoftpg.entity.Localizacion;

@Repository
public interface LocalizacionRepository extends JpaRepository<Localizacion, Serializable> {
	
	@Query("SELECT l FROM Localizacion l JOIN l.compania c WHERE c.id = :idcompania")
    public List<Localizacion> findLocalizacionesByCompania(@Param("idcompania") Integer idcompania);

}