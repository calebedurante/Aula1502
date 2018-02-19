import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		Ex02 f1 = new Ex02();
		Ex02 f2 = new Ex02();
		Ex02 f3 = new Ex02();
		
		System.out.println("Insira o nome, horas trabalhadas e valor da hora do 1 funcionário a calcular:");
		f1.nome = sc.next();
		f1.htrab = sc.nextDouble();
		f1.custoh = sc.nextDouble();
		
		System.out.println("Insira o nome, horas trabalhadas e valor da hora do 2 funcionário a calcular:");
		f2.nome = sc.next();
		f2.htrab = sc.nextDouble();
		f2.custoh = sc.nextDouble();
		
		System.out.println("Insira o nome, horas trabalhadas e valor da hora do 3 funcionário a calcular:");
		f3.nome = sc.next();
		f3.htrab = sc.nextDouble();
		f3.custoh = sc.nextDouble();
		
		f1.imprimeNome();
		f2.imprimeNome();
		f3.imprimeNome();
		
		

	}

}
