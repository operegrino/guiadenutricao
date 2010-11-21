package gui;

import java.io.IOException;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;

import negocio.ControladorCategoriaItem;
import negocio.ControladorItem;
import Util.UtilFuncoes;

import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextArea;

public class ConsultarCaloriasItens extends MainForm {

	 private ControladorCategoriaItem ctrlCatg = new ControladorCategoriaItem();
	 private ControladorItem ctrlItem = new ControladorItem();
	 private ComboBox cbTpIngrediente;
	 private Label lbDescricao;
	 private String [] arrayCatg;
	 private String [] arrayItensCtag;
	 private UtilFuncoes util = new UtilFuncoes();
	 private Label lbTeste;
	 private TextArea txtarea;
	 
	 public ConsultarCaloriasItens (){}
	 
	 public ConsultarCaloriasItens(String title){
		
		 try {
			 
			 this.lbDescricao = new Label("Informe o Tipo:");
			 this.arrayCatg = this.ctrlCatg.consultarTodasCategoriasItens();
			 this.cbTpIngrediente = new ComboBox(arrayCatg);
			 arrayItensCtag = this.ctrlItem.consultarPorCatg(5);
			
			
			 this.addComponent(lbDescricao);
			 this.addComponent(cbTpIngrediente);
			 this.show();
				
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
	 }
	
	protected void execute(Form f) {
		// TODO Auto-generated method stub

	}

}
