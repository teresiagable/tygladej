package gable.tygladej.service_test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import gable.tygladej.tygladejJpaConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(  classes = { tygladejJpaConfig.class })
@Transactional
public class FabricServiceTest {

	

	public class InMemoryDBTest {
	     
//	    @Resource
//	    private FabricRepo studentRepository;
//	     
//	    @Test
//	    public void givenStudent_whenSave_thenGetOk() {
//	        Fabric thefabric = new Fabric();
//	        studentRepository.save(student);
//	         
//	        Student student2 = studentRepository.findOne(1);
//	        assertEquals("john", student2.getName());
//	    }
	}
}
