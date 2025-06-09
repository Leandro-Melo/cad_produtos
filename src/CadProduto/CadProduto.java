package CadProduto;

import java.util.ArrayList;
import java.util.Scanner;

//Classe para cadastro de Produtos
public class CadProduto {
    
    private int nf;
	private String fornecedor;
	private String dataDeEmissao;
	private String dataDeRecebimento;
	private double valorDaNf;
    private ArrayList<NotaFiscal> cadNf = new ArrayList();
    private String nome;
	private int codigoDeBarra;
	private double precoProduto;
	private String descricao;
	private int classificacaoMedia;
	private int quantidadeAvaliacoes;
    private ArrayList<Produto> produtos = new ArrayList();
    private String status;
	private int addEstoque;
	private String localArmazenado;
	private String dataUltimaAtualizacao;
    private ArrayList<Estoque> estoqueArray = new ArrayList(); 
    
	Scanner scanner = new Scanner(System.in);//instanciando um scanner para ler entrada de dados dos usuarios
	private ArrayList<CadProduto> cadastro= new ArrayList();
    
	
	public CadProduto() {
		
	}

	
	//metodo construtor da classe
    public CadProduto(int nf, String fornecedor, String dataDeEmissao, String dataDeRecebimento, double valorDaNf,
    		String nome, int codigoDeBarra, double precoProduto, String descricao,  int classificacaoMedia, int quantidadeAvaliacoes, 
    		String status, int addEstoque, String localArmazenado, String dataUltimaAtualizacao){
    	this.nf=nf;
    	this.fornecedor=fornecedor;
    	this.dataDeEmissao=dataDeEmissao;
    	this.dataDeRecebimento=dataDeRecebimento;
    	this.valorDaNf=valorDaNf;
    	this.nome=nome;
    	this.codigoDeBarra=codigoDeBarra;
    	this.precoProduto=precoProduto;
    	this.descricao=descricao;
    	this.classificacaoMedia=classificacaoMedia;
    	this.quantidadeAvaliacoes=quantidadeAvaliacoes;
    	this.status=status;
    	this.addEstoque=addEstoque;
    	this.localArmazenado=localArmazenado;
    	this.dataUltimaAtualizacao=dataUltimaAtualizacao;
        
    }
    

    
    //metodo para cadastrar itens
    public void cadastro() {
    	//cadastro de item em NotaFiscal no array do tipo NotaFiscal
    	cadNf.add(new NotaFiscal(nf, fornecedor, dataDeEmissao, dataDeRecebimento, nome, codigoDeBarra, addEstoque, valorDaNf));
        
    	//cadastro de item em Produto no array do tipo Produto
    	if(produtos.size()>0) {//verifica se ja foi cadastrado algum item em Produto
        	for(int i=0; produtos.size()>i;i++) {//percorre o array
        		Produto produtoAtt = produtos.get(i);
        		if(nome.equalsIgnoreCase(produtoAtt.getProdutoNome())) {//se o item no array for o mesmo que esta sendo adicionado ele so atualiza as informações
        			produtoAtt.ProdutoAtt(nf, codigoDeBarra, precoProduto, classificacaoMedia, quantidadeAvaliacoes);
        		}
        	}
        }else {//se não tiver cadastrado ele cadastra
        	produtos.add(new Produto(nf, nome, codigoDeBarra, precoProduto, descricao, classificacaoMedia, quantidadeAvaliacoes));
        }
    	
    	//cadastro de item em Estoque no array do tipo Estoque
        if(estoqueArray.size()>0) {//verifica se ja foi cadastrado algum item em Estoque
        	for(int i=0; estoqueArray.size()>i;i++) {//percorre o array
        		Estoque estoqueAtt = estoqueArray.get(i);
        		if(nome.equalsIgnoreCase(estoqueAtt.getProduto())) {//se o item no array for o mesmo que esta sendo adicionado ele so atualiza as informações
        			estoqueAtt.EstoqueAtt(nf, status, codigoDeBarra, addEstoque, localArmazenado, precoProduto, dataUltimaAtualizacao);
        		}
        	}
        }else {//se não tiver cadastrado ele cadastra
        	estoqueArray.add(new Estoque(nf, nome, status, codigoDeBarra, addEstoque, localArmazenado, precoProduto, dataUltimaAtualizacao));
        }
       
    }
    
  
    
    //metodo para receber os valores de entrada do item a ser cadastrado
    public void entradaProduto() {
    	String continuar = "yes";
    	while(continuar.equalsIgnoreCase("yes")) {
			System.out.println("Digite a nota fiscal:");
			nf = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Digite o fornecedor:");
			fornecedor = scanner.nextLine();
			
			System.out.println("Digite a data de emissão:");
			dataDeEmissao = scanner.nextLine();
			
			System.out.println("Digite a data de recebimento: ");
			dataDeRecebimento = scanner.nextLine();
			
			System.out.println("Digite qual o produto:");
			nome = scanner.nextLine();
			
			System.out.println("Digite o lote:");
			codigoDeBarra = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Digite a quantidade de produtos:");
			addEstoque = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Digite o valor da nota fiscal: ");
			valorDaNf =  Double.parseDouble(scanner.nextLine());
			
			System.out.println("Digite o preço do produto: ");
			precoProduto =  Double.parseDouble(scanner.nextLine());
			
			System.out.println("Digite a descrição do produto:");
			descricao = scanner.nextLine();
			
			System.out.println("Digite a classificação média do produto:");
			classificacaoMedia = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Digite a quantidade de avaliações do produto:");
			quantidadeAvaliacoes = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Digite o status do produto:");
			status = scanner.nextLine();
			
			System.out.println("Digite local de armazenamento:");
			localArmazenado = scanner.nextLine();
			
			System.out.println("Digite a ultima data de atualização: ");
			dataUltimaAtualizacao = scanner.nextLine();
			
			cadastro.add(new CadProduto(nf, fornecedor, dataDeEmissao, dataDeRecebimento, valorDaNf,
		    		 nome, codigoDeBarra, precoProduto, descricao,  classificacaoMedia, quantidadeAvaliacoes, 
		    		 status, addEstoque, localArmazenado, dataUltimaAtualizacao));
			cadastro();
			
			
			System.out.println("");
			System.out.println("Quer adicionar outro produto?[yes/no]");
			continuar = scanner.nextLine();
			System.out.println("");
		}
    	
    	
    }
    
  //------------------------------------------------------------------///---------------------------------------------------
    //Seção de get de itens NotaFiscal
    
    //imprime todos os itens do array NotaFiscal
    public void getNotaFiscal(){
        for(int i=0; i<cadNf.size();i++) {
        	NotaFiscal nota = cadNf.get(i);
        	nota.getNotaFiscal();
        	System.out.println("");

        }
    }
    
    //metodo para retornar e imprimir a NotaFiscal com o valaor passado (nf)
    public void searchNotaFiscalNota(int nf){
        for(int i=0; i<cadNf.size();i++) {
        	NotaFiscal nota = cadNf.get(i);
        	if(nota.getNf() == nf ) {
        		nota.getNotaFiscal();
            	System.out.println("");
        	}
        }
    }
    
  //metodo para retornar e imprimir a NotaFiscal com o valaor passado (produto)
    public void searchNotaFiscalNome(String produto){
        for(int i=0; i<cadNf.size();i++) {
        	NotaFiscal nota = cadNf.get(i);
        	if(nota.getNfNome().equalsIgnoreCase(produto)) {
        		nota.getNotaFiscal();
            	System.out.println("");
        	}
        }
    }
    
  //metodo para retornar e imprimir a NotaFiscal com o valaor passado (lote)
    public void searchNotaFiscalLote(int lote){
        for(int i=0; i<cadNf.size();i++) {
        	NotaFiscal nota = cadNf.get(i);
        	if(nota.getNf() == lote ) {
        		nota.getNotaFiscal();
            	System.out.println("");
        	}
        }
    }
    
    //retorna o array de NotaFiscal
    public ArrayList<NotaFiscal> getArrayCadNf() {
    	return cadNf;
    	}

  //------------------------------------------------------------------///---------------------------------------------------
    //Seção de get de itens Produto
    
    //imprime todos os itens do array Produto
    public void getProdutos(){
        for(int i=0; i<produtos.size();i++) {
        	Produto prod = produtos.get(i);
        	prod.getProduto();
        	System.out.println("");

        }
    }
    
  //metodo para retornar e imprimir a Produto com o valaor passado (nf)
    public void searchProdutosNf(int nf){
    	 for(int i=0; i<produtos.size();i++) {
         	Produto prod = produtos.get(i);
         	for(int j=0; prod.getProdutoNf().size()>j;j++) {
         		int com = prod.getProdutoNf().get(j);
         		if(com == nf) {
         			prod.getProduto();
                 	System.out.println("");
         		}
         	}
         }
    }
    
  //metodo para retornar e imprimir a Produto com o valaor passado (produto)
    public void searchProdutosNome(String produto){
        for(int i=0; i<produtos.size();i++) {
        	Produto prod = produtos.get(i);
        	String com = prod.getProdutoNome();
        	if(com.equalsIgnoreCase(produto)) {
        		prod.getProduto();
            	System.out.println("");
        	}
        }
    }
    
  //metodo para retornar e imprimir a Produto com o valaor passado (lote)
    public void searchProdutosLote(int lote){
   	 for(int i=0; i<produtos.size();i++) {
        	Produto prod = produtos.get(i);
        	for(int j=0; prod.getProdutoNf().size()>j;j++) {
        		int com = prod.getProdutoNf().get(j);
        		if(com == lote) {
        			prod.getProduto();
                	System.out.println("");
        		}
        	}
        }
   }
    
    //retorna o array de Produto
    public ArrayList<Produto> getArrayProdutos() {
    	return produtos;
    	}
    
  //------------------------------------------------------------------///---------------------------------------------------    
    //Seção de get de itens Estoque
    
    //imprime todos os itens do array Estoque
    public void getEstoque(){
        for(int i=0; i<estoqueArray.size();i++) {
        	Estoque estoque = estoqueArray.get(i);
        	estoque.getEstoque();
        	System.out.println("");

        }
    }
    
  //metodo para retornar e imprimir a Estoque com o valaor passado (nf)
    public void searchEstoqueNf(int nf){
        for(int i=0; i<estoqueArray.size();i++) {
        	Estoque estoque = estoqueArray.get(i);
        	for(int j=0; estoque.getArrayNf().size()>j;j++) {
        		int comparador = estoque.getArrayNf().get(j);
        		if(comparador==nf) {
            		estoque.getEstoque();
                	System.out.println("");
            	}
        	}
        }
    }
    
  //metodo para retornar e imprimir a Estoque com o valaor passado (produto)
    public void searchEstoqueNome(String produto){
        for(int i=0; i<estoqueArray.size();i++) {
        	Estoque estoque = estoqueArray.get(i);
        	String com = estoque.getProduto();
        	if(com.equalsIgnoreCase(produto)) {
        		estoque.getEstoque();;
            	System.out.println("");
        	}
        }
    }
    
  //metodo para retornar e imprimir a Estoque com o valaor passado (lote)
    public void searchEstoqueLote(int lote){
        for(int i=0; i<estoqueArray.size();i++) {
        	Estoque estoque = estoqueArray.get(i);
        	for(int j=0; estoque.getArrayNf().size()>j;j++) {
        		int comparador = estoque.getArrayNf().get(j);
        		if(comparador==lote) {
            		estoque.getEstoque();
                	System.out.println("");
            	}
        	}
        }
    }

    //retorna o array de Estoque
    public ArrayList<Estoque> getArrayEstoque() {
    	return estoqueArray;
    	}
    
}
