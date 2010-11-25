package gui;

import java.io.IOException;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;

import negocio.ControladorCategoriaItem;
import negocio.ControladorItem;
import Util.UtilFuncoes;

import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.events.ActionEvent;

public class ConsultarCaloriasItens extends MainForm {

	 private ControladorCategoriaItem ctrlCatg = new ControladorCategoriaItem();
	 private ControladorItem ctrlItem = new ControladorItem();
	 private ComboBox cbTpIngrediente;
	 private Label lbDescricao;
	 private String [] arrayCatg;
	
	

	 
	 public ConsultarCaloriasItens (){}
	 
	 public ConsultarCaloriasItens(String title){
		      super();
		
			 
			 this.lbDescricao = new Label("Informe o Tipo:");
			 this.arrayCatg = this.ctrlCatg.consultarTodas();
			 this.cbTpIngrediente = new ComboBox(arrayCatg);
			 this.addComponent(lbDescricao);
			 this.addComponent(cbTpIngrediente);
			 this.show();
			 this.addCommandListener(this);
	 }
	
	protected void execute(Form f) {
		// TODO Auto-generated method stub

	}

	public void actionPerformed(ActionEvent e) {
		Command cmd = e.getCommand();
		
		switch (cmd.getId()) {
		
		case RUN_COMMAND:{
			try {
				
				//System.out.println("entrou");
				int id = UtilFuncoes.capturarId((String)this.cbTpIngrediente.getSelectedItem());
				System.out.println(id);
				int tamanho = ctrlItem.consultarPorCatg(id).length;
				System.out.println(tamanho);
				String[] itens = new String[tamanho];
				itens = ctrlItem.consultarPorCatg(id);
				
				ResultadoPesquisa rp = new ResultadoPesquisa(itens);
				rp.show();
					
			} catch (InvalidRecordIDException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (RecordStoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		}
		case BACK_COMMAND:{				
			MainForm f = Menu.getSingleton();
			f.show();
			break;
		}
		default:{}
		}
		
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
