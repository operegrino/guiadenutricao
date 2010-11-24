package negocio;

import java.io.IOException;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

import com.sun.lwuit.Dialog;

import persistencia.BDItem;
import Util.ArrayList;
import classe.basica.Item;


public class ControladorItem {

	private BDItem BDItem;
	
	public ControladorItem(){
		 BDItem = new  BDItem ();
	}

   	public boolean cadastrarItem (Item item){
   		
   		boolean value = false;
   		if((item.getNome() == null) && (item.getNome() == "")){
		
   			Dialog.show("Atenção", "Preencha o Nome", "OK", null);
   			
		}else if (item.getQtdPorcao() <= 0){
			Dialog.show("Atenção", "Qtd Porção inválida", "OK", null);
			
		}else if (item.getValorCalorico() <= 0){
			Dialog.show("Atenção", "Valor calórico inválida", "OK", null);
			
		}else if (item.getCodCategoria() < 0){
			Dialog.show("Atenção", "Preencha categoria", "OK", null);
			
		}else {
			
			value = BDItem.cadastrarItem(item);			
		}
   		return value;
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
    
    
    public String[] consultarPorCatg(int idCatg) throws InvalidRecordIDException, IOException, RecordStoreException{
    	
    	return BDItem.consultarPorCatg(idCatg);   
    }
    
    
    
    
    public ArrayList consultarTodosItens() {
    	
    	return BDItem.consultarTodosItens();
    }
    
}
