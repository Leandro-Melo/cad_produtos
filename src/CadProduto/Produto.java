package CadProduto;

import java.util.ArrayList;

//Classe do produto
public class Produto {

	private ArrayList<Integer> nfs = new ArrayList();
	private String nome;
	private ArrayList<Integer> codigosDeBarras = new ArrayList();
	private double precoProduto;
	private String descricao;
	private int classificacaoMedia;
	private int quantidadeAvaliacoes;
	
	
	//metodo construtor da classe
	public Produto(int nf, String nome, int codigoDeBarra, double precoProduto, String descricao, int classificacaoMedia, int quantidadeAvaliacoes) {
		nfs.add(nf);
		this.nome=nome;
		codigosDeBarras.add(codigoDeBarra);
		this.precoProduto=precoProduto;
		this.descricao=descricao;
		this.classificacaoMedia=classificacaoMedia;
		this.quantidadeAvaliacoes=quantidadeAvaliacoes;
	}
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	//metodo para atualizar um item ja cadastrado em Produto
	public void ProdutoAtt(int nf, int codigoDeBarra, double precoProduto, int classificacaoMedia, int quantidadeAvaliacoes) {
		nfs.add(nf);
		codigosDeBarras.add(codigoDeBarra);
		this.precoProduto=precoProduto;
		this.classificacaoMedia=classificacaoMedia;
		this.quantidadeAvaliacoes=quantidadeAvaliacoes;
	}
	
	//metodo para retornar um print do Produto identada no console 
	public void getProduto() {
		System.out.println("Notas Fiscais:");
		for(int i=0; nfs.size()>i;i++) {
    		System.out.print(nfs.get(i) + " - ");
    	}
		System.out.println("");
		System.out.println("Produto: " + nome);
    	System.out.println("Codigos de barras: ");
    	for(int i=0; codigosDeBarras.size()>i;i++) {
    		System.out.print(codigosDeBarras.get(i) + " - ");
    	}
    	System.out.println("");
    	System.out.println("Preço do produto: " + precoProduto);
    	System.out.println("Descrção do produto: " + descricao);
    	System.out.println("Classificação média: " + classificacaoMedia);
    	System.out.println("Número de avaliações: " + quantidadeAvaliacoes);
    	
	}
	
	//retorna o array de nf
	public ArrayList<Integer> getProdutoNf() {
		return nfs;
	}
	
	//retorna o produto
	public String getProdutoNome() {
		return nome;
	}
	
}
