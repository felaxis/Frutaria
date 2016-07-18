import java.util.Scanner;

public class controleDeEstoqueParaFrutaria {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		mensagensIniciais();

		int opcaoEscolhidaPeloCliente = entrada.nextInt();

		definirEscolhaDoUsuario(opcaoEscolhidaPeloCliente);

	}

	private static void mensagensIniciais() {
		System.out.println("                    CONTROLE DE ESTOQUE FRUTARIA DO SEU ZÉ");
		System.out.println("-------------------------------------------------------------------------------\n");
		System.out.println("INSIRA A AÇÃO DESEJADA:");
		System.out.print("Para INSERIR algum item, digite 1 / Para RETIRADA, digite 2: ");
	}

	public static void definirEscolhaDoUsuario(int opcaoEscolhidaPeloCliente) {
		switch (opcaoEscolhidaPeloCliente) {
		case 1:
			inserirProdutoNoEstoque();
			break;
		case 2:
			retirarProdutoDoEstoque();
			break;
		default:
			System.out.println("Opcao Invalida, digite novamente a opcao desejada:");
			int novaOpcaoEscolhidaPeloCliente = entrada.nextInt();
			definirEscolhaDoUsuario(novaOpcaoEscolhidaPeloCliente);
			break;
		}
	}

	private static void inserirProdutoNoEstoque() {
		
		System.out.print("Insira o Código do Produto:  ");
		int codigoDoProduto = entrada.nextInt();
		bancoDeDados(codigoDoProduto);
		int quantidadeAtual = quantidadeEmBanco(codigoDoProduto);
		System.out.println("Produto Definido: " + bancoDeDados(codigoDoProduto) + ".");
		System.out.println("Quantidade em Estoque: " + quantidadeEmBanco(codigoDoProduto)+".");
		System.out.print("Insira a quantidade adicionada: ");
		int quantidadeAdicionada = entrada.nextInt();
		int novoTotalDeItens = quantidadeAtual + quantidadeAdicionada;
		System.out.println("CONFIRMARDO, Seu novo total é de "+novoTotalDeItens+" itens em estoque.\n");
		System.out.println("Digite 0 para voltar ao menu princial, ou 1 para encerrar o programa.");
		retornarAoMenuOuEncerrar();
	}

		private static void retornarAoMenuOuEncerrar(){
			int retornarOuEncerrar = entrada.nextInt();
			if (retornarOuEncerrar == 0){
				mensagensIniciais();
			}
			else {
				System.out.println("Programa Encerrado.");
			}
		}
	private static void retirarProdutoDoEstoque() {
		System.out.print("Insira o Código do Produto:  ");
		int codigoDoProduto = entrada.nextInt();
		bancoDeDados(codigoDoProduto);
		int quantidadeAtual = quantidadeEmBanco(codigoDoProduto);
		System.out.println("Produto Definido: " + bancoDeDados(codigoDoProduto) + ".");
		System.out.println("Quantidade em Estoque: " + quantidadeEmBanco(codigoDoProduto)+".");
		System.out.print("Insira a quantidade a ser retirada: ");
		int quantidadeRetirada = entrada.nextInt();
		int novoTotalDeItens = quantidadeAtual - quantidadeRetirada;
		System.out.println("CONFIRMARDO, Seu novo total é de "+novoTotalDeItens+" itens em estoque.\n");
		System.out.println("Digite 0 para voltar ao menu princial, ou 1 para encerrar o programa.");
		retornarAoMenuOuEncerrar();
	}

	private static String bancoDeDados(int codigoDoProduto) {

		switch (codigoDoProduto) {
		case 1001:
			return "Batata-Doce";
		case 1002:
			return "Abóbora Galinho";

		case 1003:
			return "Abacaxi da Serra";

		case 1004:
			return "Melancia Vivacia";

		case 1005:
			return "Manga da Malásia";

		}
		return null;
	}

	private static int quantidadeEmBanco(int codigoDoProduto) {
		
		switch(codigoDoProduto) {
		case 1001:
			return 42;
		case 1002:
			return 102;

		case 1003:
			return 70;

		case 1004:
			return 18;

		case 1005:
			return 6;
		}
		return codigoDoProduto;
		
	}
}
