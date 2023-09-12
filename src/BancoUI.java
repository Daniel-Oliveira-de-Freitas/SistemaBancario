import java.util.Scanner;

public class BancoUI {

	private Banco banco;

	public BancoUI(String nome) {
		banco = new Banco(nome);

	}

	public void abrirConta() {
		Scanner tec = new Scanner(System.in);

		String titular;
		long cpf;
		String senha;
		System.out.println("Abrir comta");

		System.out.println("Informe o nome do titular: ");
		titular = tec.nextLine();

		System.out.println("Informe o CPF do titular:");
		cpf = tec.nextLong();
		tec.nextLine();
		System.out.println("Informe o senha do titular:");
		senha = tec.nextLine();

		Conta minhaConta = new Conta(new Cliente(titular, cpf, senha));
		System.out.println("Seu numero da conta: " + minhaConta.getNumero());
		banco.abrirConta(minhaConta);
	}

	public void consultarSaldo() {
		Scanner tec = new Scanner(System.in);
		String titular;
		Conta c = null ;
		String senha;
		System.out.println("###### Saldo #######");
		System.out.println("Informe o titular da conta");
		titular = tec.nextLine();
		if (c.getTitular().equals(titular))
			System.out.println("Informe a senha da conta");
		senha = tec.next();
		if (senha.equals(senha)) {
			System.out.println("-----------------------------");
			System.out.println("           S A L D O         ");
			System.out.println("------------------------------");
			System.out.println("Número: " + c.getNumero());
			System.out.println("Titular: " + c.getTitular());
			System.out.println("Saldo :" + c.getSaldo());
			System.out.println("-----------------------------");
		} else {
			System.out.println("Codigo da conta invalido ou Senha invalida");
		}

	}

	public void saque() {
		Scanner tec = new Scanner(System.in);
		int numero;
		double valor;
		String senha;

		System.out.println("###### S A Q U E #######");
		System.out.println("Informe o númaro da conta: ");
		numero = tec.nextInt();

		System.out.println("Informe o valor do saque:");
		valor = tec.nextDouble();

		System.out.println("Informe sua senha: ");
		senha = tec.nextLine();

		banco.saque(numero, valor, senha);

	}

	public void depositar() {
		Scanner tec = new Scanner(System.in);
		int numero;
		double valor;
		String senha = "";
		System.out.println("###### 	D E P O S I T O  #######");
		System.out.println("Informe o númaro da conta: ");
		numero = tec.nextInt();
		tec.nextLine();

		System.out.println("Informe o valor do deposito:");
		valor = tec.nextDouble();
		tec.nextLine();

		banco.deposita(numero, valor, senha);
		System.out.println("deposito realizado com sucesso");
	}

	public void transfere() {
		Scanner tec = new Scanner(System.in);
		int numero;
		double valor;
		String senha = "";
		System.out.println("###### 	T R A S F E R E N C I A   #######");
		System.out.println("Informe o númaro da conta: ");
		numero = tec.nextInt();
		tec.nextLine();

		System.out.println("Informe o valor da trasferencia:");
		valor = tec.nextDouble();
		tec.nextLine();

		banco.transfere(numero, valor, senha);
		System.out.println("Transferencia realizado com sucesso");
	}

	public void menu() {
		Scanner tec = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\nBanco EC");
			System.out.println("1. Abrir Conta");
			System.out.println("2. Consultar Saldo");
			System.out.println("3. Sacar");
			System.out.println("4. Depositar");
			System.out.println("5. Tranferir");
			System.out.println("6. Listar Todas Contas");
			System.out.println("7. Encerrar Conta");
			System.out.println("0. Sair\n");

			System.out.println("Qual a opcao desejada:");
			opcao = tec.nextInt();

			switch (opcao) {
			case 1: {
				abrirConta();
				break;
			}
			case 2: {
				consultarSaldo();
				break;
			}
			case 3: {
				saque();
				break;
			}
			case 4: {
				depositar();
				break;
			}
			case 5: {
				transfere();

			}

			default:
				System.out.println("Opcao Invalida");
			}
		} while (opcao != 0);

	}

	public static void main(String[] args) {
		BancoUI b = new BancoUI("BancoES");
		b.menu();

	}
}
