package negocio;

import persistencia.BDCategoriaItem;
import Util.ArrayList;
import classe.basica.CategoriaItem;

public class ControladorCategoriaItem {
	
	private BDCategoriaItem BDCatg = new BDCategoriaItem();
	
	
	public void cadastrarCatgItem(CategoriaItem catgItem){
		
		if(catgItem.getNome()==null){
			System.out.println("Preencha Nome da Categoria!");
		}else{
		BDCatg.cadastrarCatgItem(catgItem);
		}
	}
	
	public CategoriaItem buscarCategoriaItem(int id){
		
		CategoriaItem catgItem = new CategoriaItem();
		
		if(id == 0){
			System.out.println("Preencha um id válido!");	
		}else{
			catgItem = BDCatg.buscarCategoriaItem(id);
		}
		return catgItem;
	}

	public void excluirCategoriaItem(CategoriaItem catgItem){
		
		if(catgItem.getId()==0){
			System.out.println("Categoria com id inválido!");
		}else{
			BDCatg.excluirCategoriaItem(catgItem);
		}
		
		
	}

	 public ArrayList consultarTodasCategoriasItens() {
		 
		return  BDCatg.consultarTodasCategoriasItens();
	 }

}
