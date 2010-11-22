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
import com.sun.lwuit.events.ActionEvent;

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
			 int i = 0;
			while (i < arrayItensCtag.length){
				
				System.out.println(arrayItensCtag[i]);
				i++;
			}
			
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

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
