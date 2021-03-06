package gable.tygladej.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import gable.tygladej.entity.Colorways;
import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;
import gable.tygladej.entity.Prints;
import gable.tygladej.forms_and_views.FabricForm;

public interface FabricService {

	/** Fabric class:
	 * @param name
	 * @param pictureUrl
	 * @param type use Enum FabricType
	 * @param print use Enum Prints
	 * @param colorway use Enum Colorways
	 * @param designer 
	 */

	Fabric findById(int id);

	List<Fabric> getAllFabric();
	
	List<Fabric> findFabricByFabricName(String searchName);

	List<Fabric> findFabricByFabricType(FabricType searchType);

	List<Fabric> findFabricByPrint(Prints thePrint);

	List<Fabric> findFabricByColorway(Colorways theColor);

	List<Fabric> findFabricByDesignerLike(String theDesigner);

	Fabric save(Fabric newfabric);

	Fabric update(String fabricId, FabricForm updated) throws IllegalArgumentException, EntityNotFoundException;
	

}
