package in.ashokit.service;



import org.springframework.stereotype.Service;


import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository sturepo;
	
	
		
 public StudentService(StudentRepository sturepo) {
		
		this.sturepo = sturepo;
	}



public void studentrecord() {
	 
	Student stu = new Student();
	
	stu.setStuId(1001);
	stu.setStuDept("MECH");
	stu.setStuFee(30000.00);
	stu.setStuGender("male");
	stu.setStuName("venky");
	
	  sturepo.save(stu);
	}

  public void insertrecord(Integer stuid,String stuname,String studept,double stufee,String stugender) {
   sturepo.insertrecord(stuid, stuname, studept, stufee, stugender);
   }
  public void getAllstuds()
  {
  	Iterable<Student> emps = sturepo.findAll();
  	emps.forEach(System.out::println);
  }
}
