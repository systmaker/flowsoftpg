package co.com.erp.flowsoftpg.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.erp.flowsoftpg.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable> {
	
	@Query("SELECT u FROM Usuario u WHERE u.codigo = :codigo AND u.clave = :clave")
	public Usuario findUsuarioByCodigoAndClave (@Param("codigo") String codigo, @Param("clave") String clave);

}