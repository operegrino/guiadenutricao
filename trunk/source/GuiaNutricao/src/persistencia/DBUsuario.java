package persistencia;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

import Util.ArrayList;

import classe.basica.CategoriaItem;
import classe.basica.Usuario;

public class DBUsuario {

	private int tamanho;


	public void cadastrarUsuario(Usuario usuario){


		try {
			//Cria recordStore
			RecordStore rs = SingUsuario.getInstancia();

			//Cria objeto de conversão para bytes[]
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			DataOutputStream os = new DataOutputStream(baos);

			//seta o id do item
			usuario.setId(rs.getNextRecordID());

			//transforma atributos em bytes[]
			os.writeInt(usuario.getId());
			os.writeUTF(usuario.getNome());
			os.writeUTF(usuario.getSobreNome());
			os.writeChar(usuario.getSexo());
			//usuario.getTipoDieta();
			os.writeInt(usuario.getIdade());
			os.writeFloat(usuario.getAltura());
			os.writeFloat(usuario.getPeso());
			os.writeFloat(usuario.getPesoEstimado());
			os.close( );

			byte[] data = baos.toByteArray( );

			//Salva objeto
			rs.addRecord(data, 0, data.length);			

		} catch (IOException e) {
			e.printStackTrace();
		}catch (RecordStoreException e){
			e.printStackTrace();
		}

	}

	public Usuario buscarUsuario(int id){

		Usuario usuario = new Usuario();

		try {
			RecordStore rs = SingUsuario.getInstancia();

			byte[] data = rs.getRecord(id);
			DataInputStream is = new DataInputStream(new ByteArrayInputStream(data));

			usuario.setId(is.readInt());
			usuario.setNome(is.readUTF());
			is.close();

		}  catch (RecordStoreException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		return usuario;
	}

	public void excluirUsuario(Usuario usuario){

		RecordStore rs = SingUsuario.getInstancia();
		
		try {
			rs.deleteRecord(usuario.getId());
			
		}  catch (RecordStoreException e) {

			e.printStackTrace();
		}
		System.out.println("excluido id: " + usuario.getId());
	}

	public ArrayList consultarTodosOsUsuarios() {


		RecordStore rs = SingUsuario.getInstancia();
		Usuario usuario = new Usuario();
		ArrayList retorno = new ArrayList();

		try{
			RecordEnumeration re = rs.enumerateRecords(null, null, false);  
			while (re.hasNextElement()) {  
				usuario = this.buscarUsuario(re.nextRecordId());
				retorno.add(usuario);
			}

		} catch (InvalidRecordIDException e) {
			
			e.printStackTrace();
		} catch (RecordStoreException e) {
			
			e.printStackTrace();
		}  
		return retorno;
	}

	public void  excluirRS (){
		try {

			RecordStore.deleteRecordStore("USUARIO");
			System.out.println("Excluído");

		} catch (RecordStoreException e) {

			e.printStackTrace();
		}

	}

	
}
