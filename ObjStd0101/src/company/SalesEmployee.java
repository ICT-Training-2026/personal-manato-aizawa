package company;

public class SalesEmployee {
	
	private static final String COMOANY_NAME = "師匠軒";
	private static final int  DEFAULT_SALES_AMT = 150000;
	
	private String name;
	private int salesAmt;
	
	//constractor
	public SalesEmployee(String name, int salesAmt) {
		this.name = name;
		this.salesAmt = salesAmt;
	}
	
	public SalesEmployee(String name) {
		this(name, 0);
	}
	
	//method
	public static void displayCompany() {
		System.out.println("■会社名：" + COMOANY_NAME);
	}
	
	public int sell(int amt) {
		return salesAmt += amt;
	}
	
	public int sell() {
		return this.sell(DEFAULT_SALES_AMT);
	}
	
	public int refund(int amt) {
		return salesAmt -= amt;
	}
	
	
	public void displayInfo() {
		System.out.println("名前：" + name);
		System.out.println("売上：" + salesAmt + "円");
	}
		
}
