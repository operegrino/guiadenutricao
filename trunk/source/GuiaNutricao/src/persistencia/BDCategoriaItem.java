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


public class BDCategoriaItem {

	private int tamanho;
	
	
  public void cadastrarCatgItem (CategoriaItem catgItem){
 
		
		try {
			//Cria recordStore
			RecordStore rs = SingCatgItem.getInstancia();
			
			//Cria objeto de conversão para bytes[]
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				DataOutputStream os = new DataOutputStream(baos);
				
			//seta o id do item
				catgItem.setId(rs.getNextRecordID());
				System.out.println(catgItem.getId());
			
			
			//transforma atributos em bytes[]
				os.writeInt(catgItem.getId());
				os.writeUTF(catgItem.getNome());
				os.close( );
			
			byte[] data = baos.toByteArray( );
			
			//Salva objeto
			rs.addRecord(data, 0, data.length);
			System.out.println("Catg Salva!");
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}catch (RecordStoreException e){
			
			e.printStackTrace();
		}

	}

  public CategoriaItem buscarCategoriaItem (int id){
	
	  CategoriaItem catgItem = new CategoriaItem();
	
	try {
		RecordStore rs = SingCatgItem.getInstancia();

		byte[] data = rs.getRecord(id);
		DataInputStream is = new DataInputStream(new ByteArrayInputStream(data));
		
		catgItem.setId(is.readInt());
		catgItem.setNome(is.readUTF());
		is.close();

	}  catch (RecordStoreException e) {
		
		e.printStackTrace();
		
	}catch (IOException e){
		
		e.printStackTrace();
	}
		return catgItem;
	}

  public void excluirCategoriaItem (CategoriaItem catgItem){
		
		RecordStore rs = SingCatgItem.getInstancia();
		
		try {
			rs.deleteRecord(catgItem.getId());
			
		}  catch (RecordStoreException e) {
			
			e.printStackTrace();
		}
		System.out.println("excluido id: " + catgItem.getId());
	}

  public String[] consultarTodasCategoriasItens() {
		
		
		RecordStore rs = SingCatgItem.getInstancia();
		 CategoriaItem catgItem = new CategoriaItem();
		
		  try {
			tamanho = rs.getNumRecords();
		} catch (RecordStoreNotOpenException e1) {
			e1.printStackTrace();
		}
		
		 String[] retorno = new String[tamanho];
		 int i = 0;
		
		 
				try{
						RecordEnumeration re = rs.enumerateRecords(null, null, false);  
				         while (re.hasNextElement()) {  
				        	 catgItem = this.buscarCategoriaItem(re.nextRecordId());
				        	 retorno[i] = catgItem.getId()+"- " + catgItem.getNome();
				        	 
								i++;
				         }
				         
							} catch (InvalidRecordIDException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (RecordStoreException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}  
		return retorno;
   }

  public void  excluirRS (){
		try {
		
			RecordStore.deleteRecordStore("CATEGORIA_ITENS");
			System.out.println("Excluído");
			
		} catch (RecordStoreException e) {
			
			e.printStackTrace();
		}
		
	}
  
  
  
}
