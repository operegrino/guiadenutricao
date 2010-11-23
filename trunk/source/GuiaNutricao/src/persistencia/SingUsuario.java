package persistencia;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public class SingUsuario {

	private static RecordStore rsUsuario;

	private SingUsuario() {
		
	}

	public static RecordStore getInstancia() {		
			
		if (rsUsuario == null) {
			try {
				rsUsuario = RecordStore.openRecordStore("USUARIO", true);
			} catch (RecordStoreException e) {
				e.printStackTrace();
			}		
		}	
		return rsUsuario;
	}

	
}
