
public class ActorSivakumar implements Actor{
	
	static String address="Coimbatore";

	public ActorSivakumar(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public ActorSivakumar() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorSivakumar as = new ActorSivakumar(65,"Audi Car");
		as.act();
		as.dance();
		as.sing();
		as.speaking();
		System.out.println("current class instance");
		Actor ac = new ActorSivakumar();
	    ac.act();
	    ac.dance();
	    ac.sing();
	   // ac.speaking();
	    System.out.println("Dynamic method so we are not able to call Present class method");
		
		
		System.out.println(address);
		

	}
	public void speaking() {
		System.out.println("I speak with confident");
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("I like to act in movies");
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("I like to dance");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("I like to Sing");
	}

}
