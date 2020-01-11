
public class Walec {

	public static void main(String[] args) {
		Punkt p1 = new Punkt();
		Punkt p2 = new Punkt(2.0,3.0);
		Punkt p3 = new Punkt(p2 );
		
		System.out.println(p1.getA() + ", " + p1.getB());
		System.out.println(p2.getA() + ", " + p2.getB());
		System.out.println(p3.getA() + ", " + p3.getB());
		
		Ko³o p4 = new Ko³o();
		Ko³o p5 = new Ko³o(2.0);
		Ko³o p6 = new Ko³o(1.0,"km");
		Ko³o p7 = new Ko³o(p6);
		System.out.println(p4.getPromien());
		p4.setPromien(1.0);
		System.out.println(p4.getPromien());
		System.out.println("Obwód ko³a wynosi " + p4.obliczObwodKola());
		System.out.println("Pole ko³a wynosi " + p4.obliczPoleKola());
		System.out.println(p5.getPromien());
		System.out.println("Obwód ko³a wynosi " + p5.obliczObwodKola());
		System.out.println("Pole ko³a wynosi " + p5.obliczPoleKola());
		System.out.println(p6.getPromien());
		System.out.println("Obwód ko³a wynosi " + p6.obliczObwodKola());
		System.out.println("Pole ko³a wynosi " + p6.obliczPoleKola());
		System.out.println(p7.getPromien());
		System.out.println("Obwód ko³a wynosi " + p7.obliczObwodKola());
		System.out.println("Pole ko³a wynosi " + p7.obliczPoleKola());
	}

}
