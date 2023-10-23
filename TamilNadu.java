
public class TamilNadu extends SouthIndia{

	public TamilNadu(String primeMinister) {
		super(primeMinister);
		// TODO Auto-generated constructor stub
	}
	
	static String capital ="Chennai";
	public void livingStyle() {
		System.out.println("Above Average Development");
	}
	public void cultivate() {
		System.out.println("Rice and Sugar cane cultivation");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(India.capital);
		System.out.println(TamilNadu.capital);
		SouthIndia si = new TamilNadu("Narendra Modi");
		si.dress();
		si.eat();
		si.speakLanguauge();
		si.cultivate();
		si.livingStyle();

	}

	@Override
	public void speakLanguauge() {
		// TODO Auto-generated method stub
		System.out.println("We speak Tamil");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Rice and Grains");
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		System.out.println("Women wear Sarees");
		System.out.println("Men wear Veshti");
		
	}

}
