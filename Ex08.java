import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Ex01 c1 = new Ex01();
		Ex01 c2 = new Ex01();
		Ex01 c3 = new Ex01();
		
		System.out.println("Qual os rais: ");
		
		c1.raio = sc.nextInt();
		c2.raio = sc.nextInt();
		c3.raio = sc.nextInt();
		
		System.out.println("Per�metro C1: "+ c1.calcularPerimetro() + " �rea C1: " + c1.calcularArea());
		System.out.println("Per�metro C2: "+ c2.calcularPerimetro() + " �rea C2: " + c2.calcularArea());
		System.out.println("Per�metro C3: "+ c3.calcularPerimetro() + " �rea C3: " + c3.calcularArea());
		

	}

}
