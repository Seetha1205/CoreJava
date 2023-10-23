
public class Trainer {
	String dept = "Java";
	String institute ="Payilagam";
	private int salary=1000;
	
	public void training() {
		System.out.println("training method");
	}
	public void trainerkumar(String dept,String institute) {
		System.out.println(dept);
		System.out.println(institute);
	}
	public Trainer(String dept, String institute) {
		this.dept=dept;
		this.institute=institute;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer T= new Trainer("CSE","Payilagam");
		T.trainerkumar("CSE", "Payilagam");
		T.setSalary(10000);
		System.out.println(T.getSalary());
		T.training();
		
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

}
