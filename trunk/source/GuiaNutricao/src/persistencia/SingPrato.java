package persistencia;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public class SingPrato {

	private static RecordStore rsPrato;

	private SingPrato() {
		
	}

	public static RecordStore getInstancia() {
		
			
		if (rsPrato == null) {
			try {
				rsPrato = RecordStore.openRecordStore("PRATO", true);
			} catch (RecordStoreException e) {
				e.printStackTrace();
			}
		
		}
	
		return rsPrato;
	}

	
}
