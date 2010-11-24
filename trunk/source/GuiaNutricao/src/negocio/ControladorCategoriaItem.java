package negocio;

import com.sun.lwuit.Dialog;

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
	 
	 public String[] consultarTodas(){
		 ArrayList lista = new ArrayList();
			try
			{			
				lista = this.BDCatg.consultarTodasCategoriasItens();		
			}catch(Exception e){
				Dialog.show("Atenção", e.getMessage(), "OK", null);
			}
			
			String[] value = new String[lista.size()];
			for(int i=0; i<lista.size(); i++)
			{
				CategoriaItem item = (CategoriaItem)lista.get(i);
				value[i] = item.getId()+"-"+item.getNome();
			}
			
			System.out.println(value.length);
			
			return value;
	 }

}
