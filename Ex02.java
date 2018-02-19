
public class Ex02 {
	
	String nome;
	double htrab;
	double custoh;
	
	double calcularSalario() {
		return htrab*custoh;
	}
	
	void imprimeNome() {
		System.out.println("Funcionário: "+ this.nome);
		System.out.println("Salário: %.2f"+ this.calcularSalario());
	}
	
}
