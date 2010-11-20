package classe.basica;

public class Item {
	
	private String nome;
	private int qtdPorcao;
	private double valorCalorico;
	private int id;
	private int codCategoria;
	private String vitamina; // collection
	
	public Item(){};
	
	public Item(String nome, int qtdPorcao, double valorCalorico,
			String vitamina, int categoria) {
		super();
		this.nome = nome;
		this.qtdPorcao = qtdPorcao;
		this.valorCalorico = valorCalorico;
		this.vitamina = vitamina;
		this.codCategoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdPorcao() {
		return qtdPorcao;
	}
	public void setQtdPorcao(int qtdPorcao) {
		this.qtdPorcao = qtdPorcao;
	}
	public double getValorCalorico() {
		return valorCalorico;
	}
	public void setValorCalorico(double valorCalorico) {
		this.valorCalorico = valorCalorico;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}
	public String getVitamina() {
		return vitamina;
	}
	public void setVitamina(String vitamina) {
		this.vitamina = vitamina;
	}
	

}
