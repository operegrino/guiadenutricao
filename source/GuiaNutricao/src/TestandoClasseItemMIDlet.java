import java.io.IOException;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

import negocio.ControladorItem;
import classe.basica.Item;



public class TestandoClasseItemMIDlet extends MIDlet {

	public TestandoClasseItemMIDlet() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean unconditional)
			throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
			// TODO Auto-generated method stub
			ControladorItem ctrlItem = new ControladorItem();
			//ctrlItem.excluirRS();	 

/*		
 * TESTE CADASTRO DE ITENS	
 */
    Item it2 = new Item ("arroz", 300, 700, "Ferro", 5);
    Item it3 = new Item ("Feijao", 300, 700, "Ferro", 5);
    Item it4 = new Item ("Macarrao", 300, 700, "Ferro", 6);
	ctrlItem.cadastrarItem(it2);
	ctrlItem.cadastrarItem(it3);
	ctrlItem.cadastrarItem(it4);
////
			
	// ctrlItem.consultarTodosItens();
	
//	 try {
//		 
		String[] itens;
		try {
			itens = ctrlItem.consultarPorCatg(5);
			System.out.println(itens[0]);
			System.out.println(itens[1]);
			
			
		} catch (InvalidRecordIDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecordStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		
//	} catch (InvalidRecordIDException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (RecordStoreException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		    
//		  
//			Item item1 = ctrlItem.buscarItem(3);
//		    try {
//		    	
//				ctrlItem.excluirItem(item1);
//				
//			} catch (RecordStoreNotOpenException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (InvalidRecordIDException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (RecordStoreException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
//            Item item1 = ctrlItem.buscarItem(2);
//			
//		    System.out.println(item1.getNome());
//		    System.out.println(item1.getQtdPorcao());
//		    System.out.println(item1.getCodCategoria());
//		    System.out.println(item1.getValorCalorico());
//		    System.out.println(item1.getVitamina());
//		    System.out.println(item1.getId());		    

	}
}
