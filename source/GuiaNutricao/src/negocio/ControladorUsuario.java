package negocio;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

import com.sun.lwuit.Dialog;

import persistencia.DBUsuario;
import Util.ArrayList;
import classe.basica.Usuario;

public class ControladorUsuario {

	private DBUsuario DBUsuario;
	
	public ControladorUsuario(){
		 DBUsuario = new  DBUsuario();
	}
	
	public boolean validarCadastroUsuario(Usuario usuario)
	{
		boolean resp = true;
		if((usuario.getNome() == null) || (usuario.getNome() == ""))
   		{   
   			Dialog.show("Atenção", "Preencha o Nome", "OK", null);
   			resp = false;
   		}else if((usuario.getSobreNome() == null) || (usuario.getSobreNome() == "")){	
   			Dialog.show("Atenção", "Preencha o SobreNome", "OK", null);
   			resp = false;
   		}else if(usuario.getDtNascimento() == null){
   			Dialog.show("Atenção", "Preencha a Data de Nascimento", "OK", null);
   			resp = false;
   		}else if(usuario.getAltura() == 0){
   			Dialog.show("Atenção", "Preencha a Altura", "OK", null);
   			resp = false;
   		}else if(usuario.getPeso() == 0)
   		{
   			Dialog.show("Atenção", "Preencha o Peso", "OK", null);
   			resp = false;
   		}else if(usuario.getQtdCaloria() == 0){
   			Dialog.show("Atenção", "Preencha a Qtd. de Calorias", "OK", null);
   			resp = false;
   		}else if(usuario.getPesoEstimado() == 0){
   			Dialog.show("Atenção", "Preencha o Peso Estimado", "OK", null);
   			resp = false;
   		}else if(usuario.getSexo() == 0){
   			Dialog.show("Atenção", "Preencha o Sexo", "OK", null);
   			resp = false;
   		}
		
		return resp;
	}

   	public boolean cadastrarUsuario(Usuario usuario){
   		
   		return this.DBUsuario.cadastrarUsuario(usuario);
   		
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
