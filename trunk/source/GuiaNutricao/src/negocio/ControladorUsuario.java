package negocio;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

import persistencia.DBUsuario;
import Util.ArrayList;
import classe.basica.Usuario;

public class ControladorUsuario {

	private DBUsuario DBUsuario;
	
	public ControladorUsuario(){
		 DBUsuario = new  DBUsuario();
	}

   	public void cadastrarUsuario(Usuario usuario){
   		
   		if(usuario.getNome().equals("")){
		
   			System.out.println("Preencha o Nome!");
   			
		}else if (usuario.getSobreNome().equals("")){
			
			System.out.println("Preencha o SobreNome!");
			
		}else {			
			this.DBUsuario.cadastrarUsuario(usuario);
			
		}
	}
	
	public void excluirItem (Usuario usuario) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException{
		DBUsuario.excluirUsuario(usuario);
	}
	
    public Usuario buscarUsuario(int id){
		
		return DBUsuario.buscarUsuario(id);
	}
    
    public void excluirRS(){

    	DBUsuario.excluirRS();
    }
    
    public ArrayList consultarTodosItens() {
    	
    	return DBUsuario.consultarTodosOsUsuarios();
    }
    
	
}
