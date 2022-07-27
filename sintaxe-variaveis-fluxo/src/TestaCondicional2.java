
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 15;
		
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 || acompanhado) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("Seja bem vindo ");
		} else {
			System.out.println("Infelizmente você não pode entrar");
	}

}
}
