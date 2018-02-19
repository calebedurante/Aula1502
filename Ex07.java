
public class Ex07 {

	public static void main(String[] args) {
		
		Ex01 c1 = new Ex01();
		c1.raio = 3;
		Ex01 c2 = new Ex01();
		c2.raio = 4;
		Ex01 c3 = new Ex01();
		c3.raio = 7;
		
		System.out.println("Perímetro C1: "+ c1.calcularPerimetro() + " Área C1: " + c1.calcularArea());
		System.out.println("Perímetro C2: "+ c2.calcularPerimetro() + " Área C2: " + c2.calcularArea());
		System.out.println("Perímetro C3: "+ c3.calcularPerimetro() + " Área C3: " + c3.calcularArea());
		
		

	}

}
