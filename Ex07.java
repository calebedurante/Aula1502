
public class Ex07 {

	public static void main(String[] args) {
		
		Ex01 c1 = new Ex01();
		c1.raio = 3;
		Ex01 c2 = new Ex01();
		c2.raio = 4;
		Ex01 c3 = new Ex01();
		c3.raio = 7;
		
		System.out.println("Per�metro C1: "+ c1.calcularPerimetro() + " �rea C1: " + c1.calcularArea());
		System.out.println("Per�metro C2: "+ c2.calcularPerimetro() + " �rea C2: " + c2.calcularArea());
		System.out.println("Per�metro C3: "+ c3.calcularPerimetro() + " �rea C3: " + c3.calcularArea());
		
		

	}

}
