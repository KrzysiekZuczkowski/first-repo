
public class Walec {

	public static void main(String[] args) {
		Punkt p1 = new Punkt();
		Punkt p2 = new Punkt(2.0,3.0);
		Punkt p3 = new Punkt(p2 );
		
		System.out.println(p1.getA() + ", " + p1.getB());
		System.out.println(p2.getA() + ", " + p2.getB());
		System.out.println(p3.getA() + ", " + p3.getB());
		
		Ko�o p4 = new Ko�o();
		Ko�o p5 = new Ko�o(2.0);
		Ko�o p6 = new Ko�o(1.0,"km");
		Ko�o p7 = new Ko�o(p6);
		System.out.println(p4.getPromien());
		p4.setPromien(1.0);
		System.out.println(p4.getPromien());
		System.out.println("Obw�d ko�a wynosi " + p4.obliczObwodKola());
		System.out.println("Pole ko�a wynosi " + p4.obliczPoleKola());
		System.out.println(p5.getPromien());
		System.out.println("Obw�d ko�a wynosi " + p5.obliczObwodKola());
		System.out.println("Pole ko�a wynosi " + p5.obliczPoleKola());
		System.out.println(p6.getPromien());
		System.out.println("Obw�d ko�a wynosi " + p6.obliczObwodKola());
		System.out.println("Pole ko�a wynosi " + p6.obliczPoleKola());
		System.out.println(p7.getPromien());
		System.out.println("Obw�d ko�a wynosi " + p7.obliczObwodKola());
		System.out.println("Pole ko�a wynosi " + p7.obliczPoleKola());
	}

}
