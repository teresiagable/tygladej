package gable.tygladej.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gable.tygladej.entity.Colorways;
import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;
import gable.tygladej.entity.Prints;
import gable.tygladej.repository.FabricRepo;

@Service
@Transactional
public class FabricServiceImpl implements FabricService {
	
	private FabricRepo fabricRepo;
	
	@Autowired	
	public FabricServiceImpl(FabricRepo fabricRepo) {
		this.fabricRepo = fabricRepo;
	}

	/** Fabric class:
	 * @param name
	 * @param pictureUrl
	 * @param type use Enum FabricType
	 * @param print use Enum Prints
	 * @param colorway use Enum Colorways
	 * @param designer 
	 */
	
	@Override
	public Fabric findById(int id) {
		
		Optional<Fabric> result = fabricRepo.findById(id);
		return result.orElseThrow(IllegalArgumentException::new);		
	}

	@Override
	public List<Fabric> findFabricByFabricName(String searchName){
		return fabricRepo.findByNameIgnoreCase(searchName);
	}
		
	@Override
	public List<Fabric> findFabricByFabricType(FabricType searchType){
		return fabricRepo.findByType(searchType.toString());
	}
	
	@Override
	public List<Fabric> findFabricByPrint(Prints thePrint){
		return fabricRepo.findByPrint(thePrint.toString());
	}
	
	@Override
	public List<Fabric> findFabricByColorway(Colorways theColor){
		return fabricRepo.findByColorway(theColor.toString());
	}
	
	@Override
	public List<Fabric> findFabricByDesignerLike(String theDesigner){
		return fabricRepo.findByDesignerLike(theDesigner);
	}
	
//	public void deleteFabric(int id){
//		Fabric result = this.findById(id);
//		result.setDeleted(true);
//	}
}
