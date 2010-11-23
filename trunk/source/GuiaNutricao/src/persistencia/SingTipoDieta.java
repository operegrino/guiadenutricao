package persistencia;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public class SingTipoDieta {

	private static RecordStore rsTpDieta;

	private SingTipoDieta() {
		
	}

	public static RecordStore getInstancia() {
		
			
		if (rsTpDieta == null) {
			try {
				rsTpDieta = RecordStore.openRecordStore("TPDIETA", true);
			} catch (RecordStoreException e) {
				e.printStackTrace();
			}
		
		}
	
		return rsTpDieta;
	}

	
}
