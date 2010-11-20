package negocio;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

import persistencia.BDItem;
import Util.ArrayList;
import classe.basica.Item;


public class ControladorItem {

	private BDItem BDItem;
	
	public ControladorItem(){
		 BDItem = new  BDItem ();
	}

   	public void cadastrarItem (Item item){
   		
   		if(item.getNome().equals("")){
		
   			System.out.println("Preencha o Nome!");
   			
		}else if (item.getQtdPorcao() <= 0){
			
			System.out.println(" Qtd Porção inválida!");
			
		}else if (item.getValorCalorico() <= 0){
			
			System.out.println("Valor calórico inválida!");
			
		}else if (item.getCodCategoria() < 0){
			
			System.out.println("Preencha categoria!");
			
		}else {
			
			BDItem.cadastrarItem(item);
			
		}
	}
	
	public void excluirItem (Item item) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException{
		BDItem.excluirItem(item);
	}
	
    public Item buscarItem (int id){
		
		return BDItem.buscarItem(id);
	}
    
    public void excluirRS(){

    	BDItem.excluirRS();
    }
    public void consultarPorCatg(int idCatg){
    	
    	BDItem.consultarPorCatg(idCatg);    
    	}
    
    public ArrayList consultarTodosItens() {
    	
    	return BDItem.consultarTodosItens();
    }
}
