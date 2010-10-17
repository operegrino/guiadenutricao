/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;
import javax.microedition.midlet.MIDletStateChangeException;

/**
 * @author Jefferson
 */
public class PerfilUsuario extends MainForm {
    
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

    public void startApp() throws MIDletStateChangeException {

        super.startApp();
        f.setTitle("Perfil do Usuário");

        //Adiciona Label e textField
	lNome = new Label("Nome:");
	tfNome = new TextField(15);
	f.addComponent(lNome);
	f.addComponent(tfNome);
        lDtNasc = new Label("Data Nasc:");
        tfDtNasc = new TextField(10);
        f.addComponent(lDtNasc);
        f.addComponent(tfDtNasc);
        
        lAltura = new Label("Altura:");
        tfAltura = new TextField(4);
        f.addComponent(lAltura);
        f.addComponent(tfAltura);
        lPeso = new Label("Peso");
        tfPeso = new TextField(3);
        f.addComponent(lPeso);
        f.addComponent(tfPeso);
        
        lQtdCaloria = new Label("Qtd.Caloria");
        tfQtdCaloria = new TextField(3);
        f.addComponent(lQtdCaloria);
        f.addComponent(tfQtdCaloria);

/*
        lPesoAlcan = new Label("Peso Ideal");
        tfPesoAlcan = new TextField(3);
        f.addComponent(lPeso);
        f.addComponent(tfPesoAlcan);
*/
        //Adiciona Label e Combobox
        lSexo = new Label("Sexo:");
        String[] sx = {"M", "F"};  
        cbSexo = new ComboBox(sx);
        f.addComponent(lSexo);
        f.addComponent(cbSexo);
        lTpDieta = new Label("Tp Dieta");
        String[] tp = {"A","B","C"};
        cbTpDieta = new ComboBox(tp);
        f.addComponent(lTpDieta);
        f.addComponent(cbTpDieta);

        //exibe o form
        f.show();
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
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
