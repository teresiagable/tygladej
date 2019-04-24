package gable.tygladej.service_test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import gable.tygladej.entity.Colorways;
import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;
import gable.tygladej.entity.Prints;
import gable.tygladej.repository.FabricRepo;
import gable.tygladej.service.FabricService;
import gable.tygladej.service.FabricServiceImpl;


@RunWith(SpringRunner.class)
public class FabricServiceTest {


	@TestConfiguration
	static class TestConfigurationContex {
		@Bean
		public FabricService fabricService(FabricRepo fabRepo) {
			return new FabricServiceImpl(fabRepo);
		}
	}
	
	@Autowired
	private FabricService fabric_service;
	
	private Fabric f1,f2,f3,f4;
	

	@MockBean
	private FabricRepo fabrepo;
	
	
	@Before
	public void init() {
		
		//this.fab_serv = new FabricServiceImpl();
		this.f1 = new Fabric("Tygnamn1","",FabricType.Jersey.toString(),Prints.Flowers.toString(),Colorways.Blue.toString(),"Tygaffär1");
		this.f2 = new Fabric("Tygnamn1","",FabricType.Jersey.toString(),Prints.Flowers.toString(),Colorways.Pink.toString(),"Tygaffär2");
//
//		this.f1=fabrepo.save(fab1);
//		this.f2=fabrepo.save(fab2);
//		this.f3 = fabrepo.save(new Fabric("Tygnamn1","",FabricType.Jersey.toString(),Prints.Flowers.toString(),Colorways.Blue.toString(),"Tygaffär1"));
//		this.f4 = fabrepo.save(new Fabric("Tygnamn1","",FabricType.Jersey.toString(),Prints.Flowers.toString(),Colorways.Pink.toString(),"Tygaffär2"));
//		

	}
	@Test
	public void findFabricbyId_Test() {
		System.out.println(f2.getId());

		when(fabrepo.findById(anyInt())).thenReturn(Optional.of(f1));
		
		assertEquals(f1, fabric_service.findById(1));
	}

}
