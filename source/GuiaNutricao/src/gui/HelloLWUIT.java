package gui;

import java.io.IOException;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;


import com.sun.lwuit.Button;
import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Component;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.FlowLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;


//public class HelloLWUIT extends MIDlet implements ActionListener{
public class HelloLWUIT {

	Form f;  
	Image image, imagem;  
	Label label, pictureLabel, lNome;  
	Button button;  
	Command exitCommand;  
	Button pictureButton;  
	TextField tfNome;  
	ComboBox cbDia;
	
	public HelloLWUIT() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
		
		//Display.init(this);
		   
		     // TEMA  
		     try {  
		         Resources r = Resources.open("/tema/javaTheme.res");  
		         UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));  
		     } catch (IOException ioe) {  
		         System.out.println("N�o foi poss�vel carregar o tema.");  
		     }  
		   
		     //cria um form  
		     f = new Form("Testando Componentes");  
		     f.setLayout(new FlowLayout());
                     f.getStyle().setBgColor(0xd5fff9);
                     
		     //comando sair  
		     exitCommand = new Command("Sair");  
		     f.addCommand(exitCommand);  
//		     f.setCommandListener(this);
		   
		     // TEXTO  
		     label = new Label("Texto");  
		     f.addComponent(label);  
		   
		     try {  
		         // IMAGEM  
		         image = Image.createImage("/imagens/calculadora.png");  
		         pictureLabel = new Label(image);  
		         f.addComponent(pictureLabel);  
		   
		         // TEXTO EM BAIXO DA IMAGEM  
		         Label textBaixo = new Label(image);  
		         textBaixo.setText("Texto");  
		         textBaixo.setTextPosition(Component.BOTTOM);  
		         f.addComponent(textBaixo);  
		   
		     } catch (IOException ex) {  
		         ex.printStackTrace();  
		     }  
		   
		     // BOT�O COM TEXTO  
		     button = new Button("Botao");  
		     f.addComponent(button);  
		     try {  
		         // BOT�O COM IMAGEM  
		         imagem = Image.createImage("/imagens/musica.png");  
		         pictureButton = new Button(imagem);  
		         f.addComponent(pictureButton);  
//		         pictureButton.addActionListener(this);  
		     } catch (IOException ex) {  
		         ex.printStackTrace();  
		     }  
		   
		     //Label e textField  
		     lNome = new Label("Nome:");  
		     tfNome = new TextField(15);  
		     f.addComponent(lNome);  
		     f.addComponent(tfNome);  
		   
		     //ComboBox  
		     String[] dias = new String[7];  
		     dias[0] = "Domingo";  
		     dias[1] = "Segunda";  
		     dias[2] = "Terca";  
		     dias[3] = "Quarta";  
		     dias[4] = "Quinta";  
		     dias[5] = "Sexta";  
		     dias[6] = "Sabado";  
		     cbDia = new ComboBox(dias);  
		     f.addComponent(cbDia);  
		   
		     //mostra o form  
		     f.show();  
			}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource() == exitCommand){  
//			        notifyDestroyed(); //notifica a destru���o da aplica��o ao gerenciador  
			        try {
						destroyApp(true);
					} catch (MIDletStateChangeException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}  //destro� a aplica��o  
			    }
		
	}


}
