package gable.tygladej;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.UserFabric;
import gable.tygladej.repository.FabricRepo;
import gable.tygladej.repository.UserFabricRepo;
import gable.tygladej.repository.UserRepo;
import gable.tygladej.service.UserFabricService;


@Component
@Transactional(rollbackFor = Exception.class)
public class TestCommandLine implements CommandLineRunner{
	
	private FabricRepo fabricRepo;
	private UserFabricRepo userFabricRepo;	
	private UserRepo userRepo;
	private UserFabricService userFabricService;

	public TestCommandLine(FabricRepo fabricRepo, UserFabricRepo userFabricRepo, UserRepo userRepo) {
		super();
		this.fabricRepo = fabricRepo;
		this.userFabricRepo = userFabricRepo;
		this.userRepo = userRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		
/*		User theUser = userRepo.save(new User("Teresia","","teresia@home.se","password",LocalDateTime.now(), LocalDateTime.now()));
		Fabric fabric1 = fabricRepo.save(new Fabric("Mini Ella","",FabricType.Jersey.toString(),Prints.Flowers.toString(),Colorways.Blue.toString(),"Tyglycka"));
		Fabric fabric2 = fabricRepo.save(new Fabric("Ella","",FabricType.Jersey.toString(),Prints.Flowers.toString(),Colorways.Pink.toString(),"Tyglycka"));
		System.out.println(fabric1);
		System.out.println(fabric2);
		UserFabric uf1= userFabricRepo.save(new UserFabric(fabric1.getId(),theUser.getId(),120,LocalDateTime.now().minusDays(100),"Gittes Tygkälla",true,false,false));
		//uf1= userFabricRepo.save(new UserFabric(fabric2.getId(),theUser.getId(),80,LocalDateTime.now().minusDays(100),"Gittes Tygkälla",true,false,false));
		*/
/*		System.out.println(userRepo.findById(2));
		Optional<User> me =  userRepo.findById(2);

		System.out.println(me.get().printMyFabrics());*/
		Optional<UserFabric> userfab =  userFabricRepo.findById(2);
		System.out.println("Userfabric found by id 2 "+userfab.get().toString());
		Optional<Fabric> fabr = fabricRepo.findById(4);
		System.out.println("Fabric found by id 3 ");
		System.out.println(fabr.get().toString());
		List<UserFabric> fab2 =  userFabricRepo.findByFabric(fabr.get());
		
		for (UserFabric userFabric : fab2) {
			System.out.println(userFabric.getUser().getName());
		}
	

	}

}
