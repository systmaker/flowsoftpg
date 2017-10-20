package co.com.erp.flowsoftpg.repository;

import java.io.Serializable;
/*import java.util.List;*/

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;*/
import org.springframework.stereotype.Repository;

import co.com.erp.flowsoftpg.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Serializable> {
	
	/*
	@Query("FROM Producto m WHERE m.distribuidor = :distribuidor Order By Id Desc")
    public List<Producto> buscar(@Param("distribuidor") String distribuidor);
	
	@Procedure(name = "in_and_out_test")
    String inAndOutTest(@Param("inParam1") String inParam1);
    */

}