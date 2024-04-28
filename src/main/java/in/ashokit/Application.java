package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext	context=SpringApplication.run(Application.class, args);
	
	 StudentService service = context.getBean(StudentService.class);
	 
	 System.out.println(service.getClass().getName());
	 
//	service.studentrecord();
	 
	//service.insertrecord(1002,"murty","cse",40000.00,"male");
	 
//	service.insertrecord(1003,"ramesh","ece",50000.00,"male");
	 
//	 service.insertrecord(1004,"raju","eee",60000.00,"male");
	 
//	 service.insertrecord(1005,"rani","it",70000.00,"fe-male");
	 
	service.getAllstuds();
	}

}