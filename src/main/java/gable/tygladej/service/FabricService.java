package gable.tygladej.service;

import java.util.List;

import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;

public interface FabricService {

	/**
	 * 
	private int id;
	private String name;
	private String pictureUrl;
	private String type;
	
	private String print;
	private String colorway;
	private String designer;
	 */
	Fabric findById(int id);

	List<Fabric> findByName(String searchName);

	List<Fabric> findByType(FabricType searchType);

}