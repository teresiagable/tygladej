package gable.tygladej;

import java.time.LocalDateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import gable.tygladej.entity.Colorways;
import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;
import gable.tygladej.entity.Prints;
import gable.tygladej.entity.User;
import gable.tygladej.entity.UserFabric;
import gable.tygladej.repository.FabricRepo;
import gable.tygladej.repository.UserFabricRepo;
import gable.tygladej.repository.UserRepo;


@Component
@Transactional(rollbackFor = Exception.class)
public class TestCommandLine implements CommandLineRunner{
	
	private FabricRepo fabricRepo;
	private UserFabricRepo userFabricRepo;	
	private UserRepo userRepo;

	public TestCommandLine(FabricRepo fabricRepo, UserFabricRepo userFabricRepo, UserRepo userRepo) {
		super();
		this.fabricRepo = fabricRepo;
		this.userFabricRepo = userFabricRepo;
		this.userRepo = userRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		
		User theUser = userRepo.save(new User("Teresia","","teresia@home.se","password",LocalDateTime.now(), LocalDateTime.now()));
		Fabric fabric1 = fabricRepo.save(new Fabric("Mini Ella","",FabricType.Jersey.toString(),Prints.Flowers.toString(),Colorways.Blue.toString(),"Tyglycka"));
		Fabric fabric2 = fabricRepo.save(new Fabric("Ella","",FabricType.Jersey.toString(),Prints.Flowers.toString(),Colorways.Pink.toString(),"Tyglycka"));
		
		UserFabric uf1= userFabricRepo.save(new UserFabric(fabric1.getId(),theUser.getId(),120,LocalDateTime.now().minusDays(100),"Gittes Tygkälla",true,false,false));
		UserFabric uf2= userFabricRepo.save(new UserFabric(fabric2.getId(),theUser.getId(),80,LocalDateTime.now().minusDays(100),"Gittes Tygkälla",true,false,false));
		
		//userFabricRepo.save(uf1);
		//userFabricRepo.save(uf2);
		
		System.out.println(userFabricRepo.findAll());
		

		
		
	}

}
