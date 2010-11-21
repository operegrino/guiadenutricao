package classe.basica;

public class CategoriaItem {

	 String nome;
	 int id;
	 
	 public CategoriaItem(){
		 
	 }
	 
	 public CategoriaItem(String nome){
		 this.nome = nome;
	 }
	 
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
