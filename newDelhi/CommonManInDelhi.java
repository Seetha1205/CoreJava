package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi implements TrafficRulesDelhi, TrafficRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonManInDelhi ci = new CommonManInDelhi();
		ci.dontGoByDieselVehicle();
		ci.goByBicycle();
		ci.goByDieselVechicle();
		

	}

	@Override
	public void dontGoByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("This is a dontgoByDieselVechicle method");
	}

	@Override
	public void goByBicycle() {
		// TODO Auto-generated method stub
		System.out.println("cycle is a good excerise and good for environment ");
	}

	@Override
	public void goByDieselVechicle() {
		// TODO Auto-generated method stub
		System.out.println("This is a goByDieselVechicle method");
		
	}

}
