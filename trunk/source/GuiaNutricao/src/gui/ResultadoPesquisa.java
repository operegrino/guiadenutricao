package gui;


import negocio.ControladorItem;
import Util.UtilFuncoes;
import classe.basica.Item;

import com.sun.lwuit.ButtonGroup;
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.RadioButton;
import com.sun.lwuit.events.ActionEvent;

public class ResultadoPesquisa extends MainForm {

	private ControladorItem ctrlItem = new ControladorItem();
	private final ButtonGroup btGroup = new ButtonGroup();
	
	public ResultadoPesquisa(String[] itens){
		
		super();
		

		int tamanho =  itens.length;
		int i = 0;
		while (i < tamanho){
			
			RadioButton b = new RadioButton();
			b.setText(itens[i]);
			btGroup.add(b);
			this.addComponent(b);
			i++;
		}
		
		Command back = new Command("Voltar") {
            public void actionPerformed(ActionEvent evt) {
            	
            	MainForm f = Menu.getSingleton();
    			f.show();
            }
        };
        
    	Command ok = new Command("Detalhar/Excluir") {
            public void actionPerformed(ActionEvent evt) {
            	
            	int cod = UtilFuncoes.capturarId(btGroup.getRadioButton(btGroup.getSelectedIndex()).getText());
            	Item item = ctrlItem.buscarItem(cod);
            	
            	DetalharAlterarItem form = new DetalharAlterarItem(item);
            	form.show();
            }
        };
        this.addCommand(back);
        this.addCommand(ok);
        this.addCommandListener(this);
	}
	

	public void actionPerformed(ActionEvent e) {
       
	}

	protected void execute(Form f) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
