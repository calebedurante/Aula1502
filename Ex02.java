
public class Ex02 {
	
	String nome;
	double htrab;
	double custoh;
	
	double calcularSalario() {
		return htrab*custoh;
	}
	
	void imprimeNome() {
		System.out.println("Funcion�rio: "+ this.nome);
		System.out.println("Sal�rio: %.2f"+ this.calcularSalario());
	}
	
}
