package persistencia;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

import classe.basica.Item;



public class BDItem {
	
	public void cadastrarItem (Item item){
 
		
		try {
			//Cria recordStore
			RecordStore rs = SingItem.getInstancia();
			
			//Cria objeto de conversão para bytes[]
			ByteArrayOutputStream baos = new ByteArrayOutputStream( );
			DataOutputStream os = new DataOutputStream(baos);
			
			//seta o id do item
			item.setId(rs.getNextRecordID());
			System.out.println(item.getId());
			//transforma atributos em bytes[]
			os.writeUTF(item.getNome());
			os.writeInt(item.getCodCategoria());
			os.writeUTF(item.getVitamina());
			os.writeInt(item.getQtdPorcao());
			os.writeDouble(item.getValorCalorico());
			os.writeInt(item.getId());
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
	
	public void excluirItem (Item item) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException{
		
		RecordStore rs = SingItem.getInstancia();
		rs.deleteRecord(item.getId());
		System.out.println("excluido id: " + item.getId());
	}
	
	public Item buscarItem (int id){
		
		Item item = new Item();
		
		try {
			RecordStore rs = SingItem.getInstancia();

			byte[] data = rs.getRecord(id);
			DataInputStream is = new DataInputStream(new ByteArrayInputStream(data));
			
			item.setNome(is.readUTF());
			item.setCodCategoria(is.readInt());
			item.setVitamina(is.readUTF());
			item.setQtdPorcao(is.readInt());
			item.setValorCalorico(is.readDouble());
			item.setId(is.readInt());
			is.close();

		}  catch (RecordStoreException e) {
			
			e.printStackTrace();
			
		}catch (IOException e){
			
			e.printStackTrace();
		}
			return item;
	
		}
		
	
	public void consultarTodosItens() {
		

		RecordStore rs = SingItem.getInstancia();
		Item item = new Item();
		 
				try{
						RecordEnumeration re = rs.enumerateRecords(null, null, false);  
				         while (re.hasNextElement()) {  
				        	 item = this.buscarItem(re.nextRecordId());
								System.out.println(item.getNome());
				         }
				         
							} catch (InvalidRecordIDException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (RecordStoreException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} 
		
	}
	
	public void  excluirRS (){
		try {
		
			RecordStore.deleteRecordStore("ITENS");
			System.out.println("Excluído");
			
		} catch (RecordStoreException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void consultarPorCatg(final int idCatg){
		
		RecordStore rs = SingItem.getInstancia();
		
	//criando filtro	
	RecordFilter filter = new RecordFilter( ) {
			    public boolean matches(byte[] data) {
			        try {
						DataInputStream is = new DataInputStream(new ByteArrayInputStream(data));
						Item item = new Item();
						
						item.setNome(is.readUTF());
						item.setCodCategoria(is.readInt());
			            return item.getCodCategoria() == idCatg;
			        } catch (IOException ex) {
			           
			            return false;
			        }
			    }
			};
			try {
				
				RecordEnumeration enum = rs.enumerateRecords(filter, null, false);
				
				while (enum.hasNextElement( )) {
					
				    byte[] record = enum.nextRecord( );
				    ByteArrayInputStream bais = new ByteArrayInputStream(record);
				    DataInputStream is = new DataInputStream(bais);
				    System.out.println("Name: <" + is.readUTF( ) + ">");
				    is.close( );
				}
				enum.destroy( );
			} catch (Exception e) {	
			}		
	}
	
	
}
