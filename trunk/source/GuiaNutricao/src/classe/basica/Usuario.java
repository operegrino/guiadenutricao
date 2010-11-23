package classe.basica;

public class Usuario {
	
	private int Id;
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	private String nome;
	private String sobreNome;
	private char sexo;
	private TipoDieta tipoDieta;
	private int idade;
	private float altura;
	private float peso;
	private float pesoEstimado;
	
	public Usuario(){}
	
	public Usuario(String nome, String sobreNome, char sexo,
			TipoDieta tipoDieta, int idade, float altura, float peso,
			float pesoEstimado) {
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPesoEstimado() {
		return pesoEstimado;
	}
	public void setPesoEstimado(float pesoEstimado) {
		this.pesoEstimado = pesoEstimado;
	}

}
