package classe.basica;

public class Item {
	
	private String nome;
	private Integer qtdPorcao;
	private Float valorCalorico;
	private String vitamina; // collection
	
	public Item(){};
	
	public Item(String nome, Integer qtdPorcao, Float valorCalorico,
			String vitamina) {
		super();
		this.nome = nome;
		this.qtdPorcao = qtdPorcao;
		this.valorCalorico = valorCalorico;
		this.vitamina = vitamina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQtdPorcao() {
		return qtdPorcao;
	}
	public void setQtdPorcao(Integer qtdPorcao) {
		this.qtdPorcao = qtdPorcao;
	}
	public Float getValorCalorico() {
		return valorCalorico;
	}
	public void setValorCalorico(Float valorCalorico) {
		this.valorCalorico = valorCalorico;
	}
	public String getVitamina() {
		return vitamina;
	}
	public void setVitamina(String vitamina) {
		this.vitamina = vitamina;
	}
	

}
