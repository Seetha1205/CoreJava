
public class SQLTrainer extends Trainer {
	
	public SQLTrainer(String dept, String institute) {
		super(dept, institute);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SQLTrainer ram= new SQLTrainer("cs","Payilagam-Java");
          ram.training();
          System.out.println(ram.getSalary());
          System.out.println(ram.dept);
          System.out.println(ram.institute);
          
	}

}
