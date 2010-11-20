package persistencia;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public class SingItem {
	
	
	private static RecordStore rsItens;

	private SingItem() {
		
	}

	public static RecordStore getInstancia() {
		
			
		if (rsItens == null) {
			try {
				rsItens = RecordStore.openRecordStore("ITENS", true);
			} catch (RecordStoreException e) {
				e.printStackTrace();
			}
		
		}
	
		return rsItens;
		}

}
