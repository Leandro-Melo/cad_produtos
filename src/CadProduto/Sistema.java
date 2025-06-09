package CadProduto;

import java.util.Scanner;
import java.util.ArrayList;

//Classe Sistema para ter a represeentação no console e tratar as entradas de dados do usuario
public class Sistema {
	Scanner scanner = new Scanner(System.in);//instanciando um scanner para ler entrada de dados dos usuarios
	CadProduto cadastro = new CadProduto();//instanciando CadProduto dentro do Sistema para usar os metodos do CadProduto
	
	
	
	//metodo principal que inicia o programa e determina a proxima ação do programa 
    public void Start() {
    	System.out.println("Qual atividade sera feita");
    	System.out.println("");
    	System.out.println("1- Entrada de Produto");
    	System.out.println("2- Verificar itens cadastrados");
    	System.out.println("3- Procurar itens cadastrados");
    	System.out.println("4- Sair");
    	int respostaSt=Integer.parseInt(scanner.nextLine());
    	
    	//um switch para tratar qual ação fazer
    	switch(respostaSt) {
    	case 1://chamada do metodo para cadastrar produto
    		cadastro.entradaProduto();
    		Start();
    		break;
    		
    	case 2:
    		VerificarItens();
    		Start();
    		break;
    	
    	case 3:
    		ProcurarItens();
    		Start();
    		break;
    		
    	case 4:
    		System.exit(0);//encerra o programa
    		break;
    	}
    	
    }
    
 

    //metodo para mostrar todos os itens em determinada seção
    public void VerificarItens() {
    	System.out.println("Qual seção deseja");
    	System.out.println("");
    	System.out.println("1- Notas fiscais dos produtos");
    	System.out.println("2- Produtos");
    	System.out.println("3- Estoque dos produtos");
    	System.out.println("4- Sair");
    	int respostaVi=Integer.parseInt(scanner.nextLine());
    	
    	switch(respostaVi) {
    	case 1://imprime todos os itens de NotaFiscal
    		cadastro.getNotaFiscal();
    		Start();
    		break;
    		
    	case 2://imprime todos os itens de Produto
    		cadastro.getProdutos();
    		Start();
    		break;
    		
    	case 3://imprime todos os itens de Estoque
    		cadastro.getEstoque();
    		Start();
    		break;
    	
    	case 4://volta ao metodo Start
    		Start();
    		break;
    	}
    }
    
  
    
    //metodo para escolher em uma determinada seção fazer uma busca especifica de um item
    public void ProcurarItens() {
    	System.out.println("Qual seção deseja");
    	System.out.println("");
    	System.out.println("1- Notas fiscais dos produtos");
    	System.out.println("2- Produtos");
    	System.out.println("3- Estoque dos produtos");
    	System.out.println("4- Sair");
    	int respostaPi=Integer.parseInt(scanner.nextLine());
    	
    	switch(respostaPi) {
    	case 1:
    		MetodoProcurarItensNF();
    		break;
    		
    	case 2:
    		MetodoProcurarItensP();
    		break;
    		
    	case 3:
    		MetodoProcurarItensE();
    		break;
    	
    	case 4:
    		Start();
    		break;
    	}
    }
    
 
    
    //metodo para fazer uma busca de um item especifico em NotaFiscal
    public void MetodoProcurarItensNF() {
    	System.out.println("Qual modo quer fazer a busca");
    	System.out.println("");
    	System.out.println("1- Pela nota fiscal");
    	System.out.println("2- Pelo nome do produto");
    	System.out.println("3- Pelo lote do produto");
    	System.out.println("4- Sair");
    	int resposta=Integer.parseInt(scanner.nextLine());
    	switch(resposta) {
    	
    	case 1://faz uma busca pela nota fiscal do produto
    		System.out.println("Qual a nota fiscal do produto:");
    		int buscaNf = Integer.parseInt(scanner.nextLine());
    		cadastro.searchNotaFiscalNota(buscaNf);
    		break;
    		
    	case 2://faz uma busca pelo nome do produto
    		System.out.println("Qual o nome do produto:");
    		String buscaNm = scanner.nextLine();
    		cadastro.searchNotaFiscalNome(buscaNm);
    		break;
    		
    	case 3://faz uma busca pelo lote do produto
    		System.out.println("Qual o lote do produto:");
    		int buscaLt = Integer.parseInt(scanner.nextLine());
    		cadastro.searchNotaFiscalLote(buscaLt);
    		
    	case 4://volta a seção de escolha anterior
    		ProcurarItens();
    		break;
    	}
    }
    
 
    
    //metodo para fazer uma busca de um item especifico em Produto
    public void MetodoProcurarItensP() {
    	System.out.println("Qual modo quer fazer a busca");
    	System.out.println("");
    	System.out.println("1- Pela nota fiscal");
    	System.out.println("2- Pelo nome do produto");
    	System.out.println("3- Pelo nome do produto");
    	System.out.println("4- Sair");
    	int resposta=Integer.parseInt(scanner.nextLine());
    	switch(resposta) {
    	
    	case 1://faz uma busca pela nota fiscal do produto
    		System.out.println("Qual a nota fiscal do produto:");
    		int buscaNf = Integer.parseInt(scanner.nextLine());
    		cadastro.searchProdutosNf(buscaNf);
    		break;
    		
    	case 2://faz uma busca pelo nome do produto
    		System.out.println("Qual o nome do produto:");
    		String buscaNm = scanner.nextLine();
    		cadastro.searchProdutosNome(buscaNm);
    		break;
    		
    	case 3://faz uma busca pelo lote do produto
    		System.out.println("Qual o lote do produto:");
    		int buscaLt = Integer.parseInt(scanner.nextLine()) ;
    		cadastro.searchProdutosLote(buscaLt);
    		break;
    		
    	case 4://volta a seção de escolha anterior
    		ProcurarItens();
    		break;
    	}
    }
    
 
    
    //metodo para fazer uma busca especifica de um item em Estoque
    public void MetodoProcurarItensE() {
    	System.out.println("Qual modo quer fazer a busca");
    	System.out.println("");
    	System.out.println("1- Pela nota fiscal");
    	System.out.println("2- Pelo nome do produto");
    	System.out.println("3- Pelo lote do produto");
    	System.out.println("4- Sair");
    	int resposta=Integer.parseInt(scanner.nextLine());
    	switch(resposta) {
    	
    	case 1://faz uma busca pela nota fiscal do produto
    		System.out.println("Qual a nota fiscal do produto:");
    		int buscaNf = Integer.parseInt(scanner.nextLine());
    		cadastro.searchEstoqueNf(buscaNf);
    		break;
    		
    	case 2://faz uma busca pelo nome do produto
    		System.out.println("Qual o nome do produto:");
    		String buscaNm = scanner.nextLine();
    		cadastro.searchEstoqueNome(buscaNm);
    		break;
    		
    	case 3://faz uma busca pelo lote do produto
    		System.out.println("Qual o nome do produto:");
    		int buscaLt = Integer.parseInt(scanner.nextLine());
    		cadastro.searchEstoqueLote(buscaLt);
    		break;
    		
    	case 4://volta a seção de escolha anterior
    		ProcurarItens();
    		break;
    	}
    }
    
    
}
