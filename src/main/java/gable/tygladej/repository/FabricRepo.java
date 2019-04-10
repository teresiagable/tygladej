package gable.tygladej.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;

public interface FabricRepo extends CrudRepository<Fabric, Integer> {

	List<Fabric> findByNameIgnoreCase(String name);

	List<Fabric> findByFabricType(FabricType searchType);

}
