package mn.icode.model;


import jakarta.persistence.*;


@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	private int age;
	
	private String major;
	
	//Анхны constructor
	public Student() {}
	
	//Бүх утгатай ocnstructor
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
		
	
}