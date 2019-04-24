package gable.tygladej.repository_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import gable.tygladej.entity.Colorways;
import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;
import gable.tygladej.entity.Prints;
import gable.tygladej.repository.FabricRepo;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class FabricRepoTest {
	
	@Autowired 
	private FabricRepo testRepo;
	private Fabric testFabric;
	
	
	@Before
	public void init() {
		Fabric fab1 = new Fabric("Tygnamn1","",FabricType.Jersey.toString(),Prints.Flowers.toString(),Colorways.Blue.toString(),"Tygaffär1");
		Fabric fab2 = new Fabric("Tygnamn2","",FabricType.Lace.toString(),Prints.Dots.toString(),Colorways.Pink.toString(),"Tygaffär2");
		testFabric = testRepo.save(fab1);
		testRepo.save(fab2);
	}
	
	@Test
	public void test_findByNameIgnoreCase() {
		List<Fabric> expected = Arrays.asList(testFabric);
		List<Fabric> actual = testRepo.findByNameIgnoreCase("tygnamn1");
		assertEquals(expected, actual);		
	}
	
	@Test
	public void test_findByColorway() {
		List<Fabric> expected = Arrays.asList(testFabric);
		List<Fabric> actual = testRepo.findByColorway(Colorways.Blue.toString());		
		assertEquals(expected, actual);
	}
}

