package CadProduto;

import java.util.ArrayList;

//Classe do estoque
public class Estoque {

	private ArrayList<Integer> nfs = new ArrayList();
	private String produto;
	private String status;
	private ArrayList<Integer> codigosDeBarras = new ArrayList();
	private int qtdEstoque;
	private ArrayList<String> locaisArmazenados = new ArrayList();
    private double valorProduto;
	private String dataUltimaAtualizacao;
    
    public Estoque() {
    	
    }
	
    //metodo construtor da classe    public Estoque(int nf, String produto, String status, int codigoDeBarra, int qtdEstoque, String localArmazenado, double valorProduto, String dataUltimaAtualizacao){
	    	nfs.add(nf);
    	this.produto=produto;    	this.status=status;
    	codigosDeBarras.add(codigoDeBarra);    	this.qtdEstoque= qtdEstoque;    	locaisArmazenados.add(localArmazenado);
    	this.valorProduto=valorProduto;
    	this.dataUltimaAtualizacao=dataUltimaAtualizacao;
	    }
    
    //metodo para atualizar informações de um produto quando ja cadastrado no estoque
    public void EstoqueAtt(int nf, String status, int codigoDeBarra, int qtdEstoque, String localArmazenado, double valorProduto, String dataUltimaAtualizacao){
    	nfs.add(nf);
    	this.status=status;
    	codigosDeBarras.add(codigoDeBarra);
    	this.qtdEstoque= this.qtdEstoque+qtdEstoque;
    	locaisArmazenados.add(localArmazenado);
    	this.valorProduto=valorProduto;
    	this.dataUltimaAtualizacao=dataUltimaAtualizacao;
	
    }

  //metodo para retornar um print do Estoque identada no console 
    public void getEstoque() {
    	System.out.println("Notas fiscais: ");
    	for(int i=0; nfs.size()>i;i++) {
    		System.out.print(nfs.get(i) + " - ");
    	}
    	System.out.println("");
    	System.out.println("Produto: " + produto);
    	System.out.println("Status do produto: " + status);
    	System.out.println("Lotes: ");
    	for(int i=0; codigosDeBarras.size()>i;i++) {
    		System.out.print(codigosDeBarras.get(i) + " - ");
    	}
    	System.out.println("");
    	System.out.println("Quantidade de produto em estoque: " + qtdEstoque);
    	System.out.println("Local armazenado: ");
    	for(int i=0; locaisArmazenados.size()>i;i++) {
    		System.out.print(locaisArmazenados.get(i) + " - ");
    	}
    	System.out.println("");
    	System.out.println("Valor do produto: " + valorProduto);
    	System.out.println("Data da ultima atualização: " + dataUltimaAtualizacao);
    }
    
    //retorna o preço do produto
    public double getValorProduto() {
    	return valorProduto;
    }
    
    //retorna o array de notas fiscais
    public ArrayList<Integer> getArrayNf() {
    	return nfs;
    }
    
    //retorna o produto
    public String getProduto() {
    	return produto;
    }
    
    //retorna quantos produtos tem no estoque
    public int getQtdEstoque() {
    	return qtdEstoque;
    }

    
}
