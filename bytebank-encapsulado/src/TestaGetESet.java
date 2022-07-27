
public class TestaGetESet { 
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero=1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Augusto");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		conta.setAgencia(100);
		System.out.println(conta.getAgencia());
		
		System.out.println(titularDaConta.getProfissao());
		
	}

	
}
