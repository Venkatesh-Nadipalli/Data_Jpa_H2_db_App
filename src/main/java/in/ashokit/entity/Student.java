package in.ashokit.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private Integer stuId;
	
	private String stuName;
	private String stuDept;
	private double stuFee;
	private String stuGender;
	
	public Student(Integer stuId, String stuName, String stuDept, double stuFee, String stuGender) {
	
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuDept = stuDept;
		this.stuFee = stuFee;
		this.stuGender = stuGender;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuDept() {
		return stuDept;
	}

	public void setStuDept(String stuDept) {
		this.stuDept = stuDept;
	}

	public double getStuFee() {
		return stuFee;
	}

	public void setStuFee(double stuFee) {
		this.stuFee = stuFee;
	}

	public String getStuGender() {
		return stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuDept=" + stuDept + ", stuFee=" + stuFee
				+ ", stuGender=" + stuGender + "]";
	}

	public Student() {
		
	}
	
	
	
}
