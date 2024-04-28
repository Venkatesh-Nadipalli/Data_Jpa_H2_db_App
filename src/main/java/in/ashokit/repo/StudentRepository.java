package in.ashokit.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{

	@Transactional
	@Modifying
	@Query("insert into Student(stuId,stuName,stuDept,stuFee,stuGender) values(:stuid,:stuname,:studept,:stufee,:stugender)")
	public void insertrecord(@Param("stuid")Integer stuid,@Param("stuname")String stuname,@Param("studept")String studept,@Param("stufee")double stufee,@Param("stugender")String stugender);
}
