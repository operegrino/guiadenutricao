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
import classe.basica.Prato;

public class DBPrato {

	private int tamanho;


	public void cadastrarPrato(Prato prato){


		try {
			//Cria recordStore
			RecordStore rs = SingPrato.getInstancia();

			//Cria objeto de conversão para bytes[]
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			DataOutputStream os = new DataOutputStream(baos);

			//seta o id do item
			prato.setId(rs.getNextRecordID());

			//transforma atributos em bytes[]
			os.writeInt(prato.getId());
			os.writeUTF(prato.getNome());
			//os.writeUTF(prato.getItem());
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

	public Prato buscarPrato(int id){

		Prato prato = new Prato();

		try {
			RecordStore rs = SingPrato.getInstancia();

			byte[] data = rs.getRecord(id);
			DataInputStream is = new DataInputStream(new ByteArrayInputStream(data));

			prato.setId(is.readInt());
			prato.setNome(is.readUTF());
			is.close();

		}  catch (RecordStoreException e) {

			e.printStackTrace();

		}catch (IOException e){

			e.printStackTrace();
		}
		return prato;
	}

	public void excluirPrato(Prato prato){

		RecordStore rs = SingPrato.getInstancia();

		try {
			rs.deleteRecord(prato.getId());

		}  catch (RecordStoreException e) {

			e.printStackTrace();
		}
		System.out.println("excluido id: " + prato.getId());
	}

	public ArrayList consultarTodosOsPrato(){


		RecordStore rs = SingPrato.getInstancia();
		Prato prato = new Prato();
        ArrayList retorno = new ArrayList();
        
		try{
			RecordEnumeration re = rs.enumerateRecords(null, null, false);  
			while (re.hasNextElement()) {  
				prato = this.buscarPrato(re.nextRecordId());
				retorno.add(prato);				
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

			RecordStore.deleteRecordStore("PRATO");
			System.out.println("Excluído");
		} catch (RecordStoreException e) {
			e.printStackTrace();
		}

	}


}
