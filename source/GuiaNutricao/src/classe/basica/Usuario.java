package classe.basica;

import java.util.Date;

public class Usuario {
	
	private int Id;
	private String nome;
	private String sobreNome;
	private int sexo;
	private TipoDieta tipoDieta;
	private int idade;
	private float altura;
	private float peso;
	private float pesoEstimado;
	private Date dtNascimento;
	private int qtdCaloria;
	
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
	
	
	
	public int getQtdCaloria() {
		return qtdCaloria;
	}

	public void setQtdCaloria(int qtdCaloria) {
		this.qtdCaloria = qtdCaloria;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
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
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
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
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	

}
