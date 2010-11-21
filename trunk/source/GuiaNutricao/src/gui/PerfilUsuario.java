/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.layouts.BoxLayout;

/**
 * @author Jefferson
 */
public class PerfilUsuario extends MainForm{
    
    Label lNome;
    Label lSexo;
    Label lDtNasc;
    Label lAltura;
    Label lPeso;
    Label lTpDieta;
    Label lQtdCaloria;
    Label lPesoAlcan;
    TextField tfNome;
    TextField tfDtNasc;
    TextField tfAltura;
    TextField tfPeso;
    TextField tfQtdCaloria;
    TextField tfPesoAlcan;
    ComboBox cbSexo;
    ComboBox cbTpDieta;
    
    public PerfilUsuario()
    {
    	super();
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}
    

    public PerfilUsuario(String name)
    {
    	super();

        this.setTitle(name);
        this.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        this.setScrollableX(true);
        //Adiciona Label e textField
        lNome = new Label("Nome:");
        tfNome = new TextField(15);
        lDtNasc = new Label("Data Nasc:");
        tfDtNasc = new TextField(10);
        lAltura = new Label("Altura:");
        tfAltura = new TextField(4);
        lPeso = new Label("Peso");
        tfPeso = new TextField(3);
        lQtdCaloria = new Label("Qtd.Caloria");
        tfQtdCaloria = new TextField(3);
        lPesoAlcan = new Label("Peso Ideal");
        tfPesoAlcan = new TextField(3);
        lSexo = new Label("Sexo:");
        String[] sx = {"M", "F"};
        cbSexo = new ComboBox(sx);
        lTpDieta = new Label("Tp Dieta");
        String[] tp = {"A","B","C"};
        cbTpDieta = new ComboBox(tp);
        
        
        this.addComponent(lNome);
        this.addComponent(tfNome);
        this.addComponent(lDtNasc);
        this.addComponent(tfDtNasc);
        this.addComponent(lAltura);
        this.addComponent(tfAltura);
        this.addComponent(lPeso);
        this.addComponent(tfPeso);
        this.addComponent(lQtdCaloria);
        this.addComponent(tfQtdCaloria);

        //this.addComponent(lPeso);
        this.addComponent(tfPesoAlcan);        
        this.addComponent(lSexo);
        this.addComponent(cbSexo);
        this.addComponent(lTpDieta);
        this.addComponent(cbTpDieta);

        //exibe o form
        this.show();
       
    }

/*
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitCommand){
	  notifyDestroyed(); //notifica a destru���o da aplica��o ao gerenciador
	  try {
	    destroyApp(true);
	  } catch (Exception e1) {
	    e1.printStackTrace();
          }  //destro� a aplica��o
	}
    }
*/
    

}
