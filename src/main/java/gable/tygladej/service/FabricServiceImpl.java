package gable.tygladej.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gable.tygladej.entity.Colorways;
import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;
import gable.tygladej.entity.Prints;
import gable.tygladej.repository.FabricRepo;

@Service
@Transactional
public class FabricServiceImpl {
	private FabricRepo fabricRepo;

	
	/** Fabric class:
	 * @param name
	 * @param pictureUrl
	 * @param type use Enum FabricType
	 * @param print use Enum Prints
	 * @param colorway use Enum Colorways
	 * @param designer 
	 */
	
	public Fabric findById(int id) {
		
		Optional<Fabric> result = fabricRepo.findById(id);
		return result.orElseThrow(IllegalArgumentException::new);		
	}

	public List<Fabric> findFabricByFabricName(String searchName){
		return fabricRepo.findByNameIgnoreCase(searchName);
	}
	
	
	public List<Fabric> findFabricByFabricType(FabricType searchType){
		return fabricRepo.findByType(searchType.toString());
	}
	
	public List<Fabric> findFabricByPrint(Prints thePrint){
		return fabricRepo.findByPrint(thePrint.toString());
	}
	
	public List<Fabric> findFabricByColorway(Colorways theColor){
		return fabricRepo.findByColorway(theColor.toString());
	}
	
	public List<Fabric> findFabricByDesignerLike(String theDesigner){
		return fabricRepo.findByDesignerLike(theDesigner);
	}
	
//	public void deleteFabric(int id){
//		Fabric result = this.findById(id);
//		result.setDeleted(true);
//	}
}
