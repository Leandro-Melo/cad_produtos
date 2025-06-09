package CadProduto;

//Classe de notas fiscais
public class NotaFiscal {

	private int nf;
	private String fornecedor;
	private String dataDeEmissao;
	private String dataDeRecebimento;
	private String produtoDaNf;
	private int lote;
	private int qtdProdutos;
	private double valorDaNf;
	
	//Metodo construtor da classe
	public NotaFiscal(int nf, String fornecedor,String dataDeEmissao, String dataDeRecebimento, String produtoDaNf, int lote, int qtdProdutos, double valorDaNf) {
		this.nf=nf;
		this.fornecedor=fornecedor;
		this.dataDeEmissao=dataDeEmissao;
		this.dataDeRecebimento=dataDeRecebimento;
		this.produtoDaNf=produtoDaNf;
		this.lote=lote;
		this.qtdProdutos=qtdProdutos;
		this.valorDaNf=valorDaNf;
	}
	
	public NotaFiscal() {
		// TODO Auto-generated constructor stub
	}

	//retorna a nf
	public int getNf() {
		return nf;
	}
	
	//retorna o produto
	public String getNfNome() {
		return produtoDaNf;
	}
	
	//Metodo para retornar um print da NotaFiscal identada no console
	public void getNotaFiscal(){
		System.out.println("Nota fiscal: " + nf);
		System.out.println("Fornecedor: " + fornecedor);
    	System.out.println("Data de lançamento da nota: " + dataDeEmissao);
    	System.out.println("Data de recebimento da nota: " + dataDeRecebimento);
    	System.out.println("Produto: " + produtoDaNf);
    	System.out.println("Lote: " + lote);
    	System.out.println("Quantidade de produtos: " + qtdProdutos);
    	System.out.println("Preço por unidade: " + valorDaNf/qtdProdutos);
    	System.out.println("Valor da nota: " + valorDaNf);
	}
}
