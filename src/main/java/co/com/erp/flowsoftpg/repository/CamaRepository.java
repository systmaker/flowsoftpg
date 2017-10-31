package co.com.erp.flowsoftpg.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.erp.flowsoftpg.entity.Cama;

@Repository
public interface CamaRepository extends JpaRepository<Cama, Serializable> {
	
	@Query("SELECT c FROM Cama c JOIN c.nave n JOIN n.invernadero i WHERE i.id = :idinvernadero")
	public List<Cama> findCamasByInvernadero(@Param("idinvernadero") Integer idinvernadero);
	
}