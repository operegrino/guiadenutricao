package negocio;

import java.io.IOException;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

import persistencia.DBPrato;
import Util.ArrayList;
import classe.basica.Prato;

public class ControladorPrato {
	
	private DBPrato DBPrato;
	
	public ControladorPrato(){
		 DBPrato = new  DBPrato();
	}

   	public void cadastrarPrato(Prato prato){
   		
   		if(prato.getNome().equals("")){
		
   			System.out.println("Preencha o Nome!");
   			
		}else if (prato.getItem().isEmpty()){
			
			System.out.println("Selecione o(s) Iten(s) do Prato.");
			
		}else {
			
			DBPrato.cadastrarPrato(prato);
			
		}
	}
	
	public void excluirPrato(Prato prato) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException{
		DBPrato.excluirPrato(prato);
	}
	
    public Prato buscarPrato(int id){
		
		return DBPrato.buscarPrato(id);
	}
    
    public void excluirRS(){

    	DBPrato.excluirRS();
    }
    
    public ArrayList consultarTodosItens() {
    	
    	return DBPrato.consultarTodosOsPrato();
    }
    

}
