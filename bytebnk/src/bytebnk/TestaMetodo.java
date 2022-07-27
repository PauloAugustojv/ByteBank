package bytebnk;

public class TestaMetodo { 
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(300);
		System.out.println(contaDoPaulo.saldo);
		// metodo contaDoPaulo est� retornando true ou false para vari�vel conseguiuRetirar.
		boolean conseguiuRetirar = contaDoPaulo.saca(100);
		System.out.println(contaDoPaulo.saldo);
		// print o retorno do m�todo.
		System.out.println(conseguiuRetirar);
		
		Conta  contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(1001,contaDoPaulo);
		
		if(sucessoTransferencia) {
			System.out.println("Transfer�ncia foi feita com sucesso");
		}else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "paulo silveira";
	}

}
