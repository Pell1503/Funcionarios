package Emploi;

public class Funcionario {
	private Double salary;
	private String name ;
	private Integer id ;
	public Funcionario () {
		
	}
	public Funcionario (Double salary, String name , Integer id ) {
		this.salary = salary ;
		this.name = name ;
		this.id = id ;
		
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void increasySalary (double percenter ) {
		salary +=salary * percenter /100.0;
		
		
	
	}
	public String toString () {
		return id + "," + name + "," + String.format("%.2f", salary);
	}
	

}
