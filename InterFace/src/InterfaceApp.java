/*class RealCal{
	public double plus(double v1, double v2, double v3) {
		return v1+v2+v3;
	}
}*/
interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);	
}

interface Printable{
	void print();
}

class RealCal implements Calculable, Printable{

	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is RealCal");
	}
	
}

class DummyCal implements Calculable{
	public int sum(int v1, int v2) {
		return 3;
	}
}

public class InterfaceApp {
	public static void main(String[] args) {
		//불분명한 것을 예방
		RealCal c = new RealCal();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
		
	}
}
