package driver;

import company.SalesEmployee;

public class Driver {

	public static void main(String[] args) {
		
		SalesEmployee yamada = new SalesEmployee("山田", 100000);
		System.out.println();
		yamada.displayInfo();
		
		SalesEmployee saho = new SalesEmployee("佐保");
		System.out.println();
		saho.displayInfo();

	}

}
