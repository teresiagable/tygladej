package gable.tygladej.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;
import gable.tygladej.repository.FabricRepo;

@Service
@Transactional
public class FabricServiceImpl implements FabricService {

	private FabricRepo fabricRepo;

	@Override
	public Fabric findById(int id) {
		
		Optional<Fabric> result = fabricRepo.findById(id);
		return result.orElseThrow(IllegalArgumentException::new);		
		
	}
	
	@Override
	public List<Fabric> findByName(String searchName){
		List <Fabric> result = fabricRepo.findByNameIgnoreCase(searchName);
		return result;
	}
	
	
	@Override
	public List<Fabric> findByType(FabricType searchType){
		List <Fabric> result = fabricRepo.findByFabricType(searchType);
		return result;
		
	}
}
