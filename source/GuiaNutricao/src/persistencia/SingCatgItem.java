package persistencia;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public class SingCatgItem {

	private static RecordStore rsCatgItens;

	private SingCatgItem() {
		
	}

	public static RecordStore getInstancia() {
		
			
		if (rsCatgItens == null) {
			try {
				rsCatgItens = RecordStore.openRecordStore("CATEGORIA_ITENS", true);
			} catch (RecordStoreException e) {
				e.printStackTrace();
			}

		}
	
		return rsCatgItens;
		}
}
