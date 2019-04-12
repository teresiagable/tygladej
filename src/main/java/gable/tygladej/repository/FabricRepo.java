package gable.tygladej.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import gable.tygladej.entity.Fabric;

public interface FabricRepo extends CrudRepository<Fabric, Integer> {

	List<Fabric> findByNameIgnoreCase(String name);

	List<Fabric> findByType(String searchType);

	List<Fabric> findByPrint(String string);

	List<Fabric> findByColorway(String string);

	List<Fabric> findByDesigner(String theDesigner);

	List<Fabric> findByDesignerLike(String theDesigner);

}
