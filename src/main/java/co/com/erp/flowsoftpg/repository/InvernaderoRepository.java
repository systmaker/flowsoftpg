package co.com.erp.flowsoftpg.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.erp.flowsoftpg.entity.Invernadero;

@Repository
public interface InvernaderoRepository extends JpaRepository<Invernadero, Serializable> {
	
	@Query("SELECT i FROM Invernadero i JOIN i.localizacion l WHERE l.id = :idlocalizacion")
	public List<Invernadero> findInvernaderosByLocalizacion(@Param("idlocalizacion") Integer idlocalizacion);

}