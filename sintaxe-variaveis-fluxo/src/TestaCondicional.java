
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 15;
		int adultoIdade = 18;
		int quantidadePessoas = 1;
		
		if (idade > 18) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo ");
		} else { 
			if(quantidadePessoas >= 1 && adultoIdade >= 18) {
			System.out.println("Voc� n�o tem mais que 18 anos, mais pode entrar com um respos�vel maior que 18 anos ");
			System.out.println("Seja bem vindo ");
				}
		}
	}

}
