package com.grupo4.demo.models.entity.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.grupo4.demo.models.entity.Articulo;

public interface IArticuloDAO extends CrudRepository<Articulo,Long>{

	/*@Query("select a from Articulo a where a.nombre like %?1% and a.idproveedor=?2 and a.idcategoria=?3 and a.stock>0")
	public List<Articulo> findbyNombre(String term,Long prov, Long cate);*/
	
	@Query(value="select * from articulo u where u.nombre like %?1% and u.idproveedor=?2 and u.idcategoria=?3 and stock>0"
			,nativeQuery = true)
	public List<Articulo> findbyNombre(String term,Long prov,Long cate);
	
	Optional<Articulo> findByCodigoArticulo(String CodigoArticulo);
	
	@Query(value = "select * from articulo where idproveedor=?1",nativeQuery = true)
	List<Articulo> findByprovedor(Long idproveedores);
	
	@Query(value = "select * from articulo where idcategoria=?1",nativeQuery = true)
	List<Articulo> findBycate(Long idcategoria);
	
	
	
	

}
