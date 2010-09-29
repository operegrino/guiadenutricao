package nutricao.classe.basica;

public class Usuario {
	
	private String nome;
	private String sobreNome;
	private char sexo;
	private TipoDieta tipoDieta;
	private Integer idade;
	private Float altura;
	private Float peso;
	private Float pesoEstimado;
	
	public Usuario(){}
	
	public Usuario(String nome, String sobreNome, char sexo,
			TipoDieta tipoDieta, Integer idade, Float altura, Float peso,
			Float pesoEstimado) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.sexo = sexo;
		this.tipoDieta = tipoDieta;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.pesoEstimado = pesoEstimado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public TipoDieta getTipoDieta() {
		return tipoDieta;
	}
	public void setTipoDieta(TipoDieta tipoDieta) {
		this.tipoDieta = tipoDieta;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Float getPesoEstimado() {
		return pesoEstimado;
	}
	public void setPesoEstimado(Float pesoEstimado) {
		this.pesoEstimado = pesoEstimado;
	}

}
