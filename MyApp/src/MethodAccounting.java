
public class MethodAccounting {
	
	public static double valueOfSupply = 10000.0;
	public static double vatRate = 0.1;
	
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	public static void main(String[] args) {
		
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
	}

}
