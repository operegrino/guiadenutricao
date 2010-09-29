package nutricao.classe.basica;

import java.util.Vector;

public class Prato {
	
	private Vector item;
	private String nome;
	
	public Prato(){};
	
	public Prato(Vector item, String nome) {
		super();
		this.item = item;
		this.nome = nome;
	}
	public Vector getItem() {
		return item;
	}
	public void setItem(Vector item) {
		this.item = item;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
