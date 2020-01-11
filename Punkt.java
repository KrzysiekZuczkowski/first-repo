
public class Punkt {
	private double a;
	private double b;
	
	public Punkt(){
		a = 0;
		b = 0;
	}
	public Punkt (double x,double y){
		a = x;
		b = y;
	}
	public Punkt (Punkt c){
		a = c.a ;
		b = c.b;
	}
	
	public double getA(){
		return a;
		}
	public double getB(){
		return b;
	}
}
