/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import com.sun.lwuit.Calendar;
import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.layouts.BoxLayout;
import classe.basica.Usuario;
import negocio.ControladorUsuario;

/**
 * @author Jefferson
 */
public class PerfilUsuario extends MainForm{
    
    Label lNome;
    Label lSobreNome;
    Label lSexo;
    Label lDtNasc;
    Label lAltura;
    Label lPeso;
    Label lTpDieta;
    Label lQtdCaloria;
    Label lPesoAlcan;
    TextField tfNome;
    TextField tfSobreNome;    
    Calendar tfDtNasc;    
    TextField tfAltura;
    
    TextField tfPeso;
    
    TextField tfQtdCaloria;
    TextField tfPesoAlcan;
    ComboBox cbSexo;
    ComboBox cbTpDieta;
    private ControladorUsuario controlador;

	public String getName() {
		// TODO Auto-generated method stub
		return "Perfil Usuário";
	}

	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}
    

    public PerfilUsuario()
    {
    	super();

    	controlador = new ControladorUsuario();
    	
        this.setTitle(this.getName());
        this.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        this.setScrollableX(true);
        //Adiciona Label e textField
        lNome = new Label("Nome:");
        tfNome = new TextField(15);
        lSobreNome = new Label("SobreNome");
        tfSobreNome = new TextField(15);
        lDtNasc = new Label("Data Nascimento:");
        tfDtNasc = new Calendar();
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
        lTpDieta = new Label("Tipo de Dieta");
        String[] tp = {"A","B","C"};
        cbTpDieta = new ComboBox(tp);

        
        this.addComponent(lNome);
        this.addComponent(tfNome);
        this.addComponent(lSobreNome);
        this.addComponent(tfSobreNome);
        this.addComponent(lDtNasc);
        this.addComponent(tfDtNasc);
        this.addComponent(lAltura);
        this.addComponent(tfAltura);
        this.addComponent(lPeso);
        this.addComponent(tfPeso);
        this.addComponent(lQtdCaloria);
        this.addComponent(tfQtdCaloria);
        this.addComponent(lPesoAlcan);
        this.addComponent(tfPesoAlcan);        
        this.addComponent(lSexo);
        this.addComponent(cbSexo);
        this.addComponent(lTpDieta);
        this.addComponent(cbTpDieta);

        this.addCommandListener(this);
        //exibe o form
        this.show();
       
    }

	public void actionPerformed(ActionEvent e) {
		Command cmd = e.getCommand();
		switch (cmd.getId()) {
		case RUN_COMMAND:{
			cadastrarPerfil();
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
	
	public void cadastrarPerfil()
	{	
		
		if(validarCadastroUsuario())
		{
			Usuario usuario = new Usuario();
			usuario.setNome(this.tfNome.getText());
			usuario.setSobreNome(this.tfSobreNome.getText());
			usuario.setDtNascimento(this.tfDtNasc.getDate());
			usuario.setAltura(Float.parseFloat(this.tfAltura.getText()));
			usuario.setPeso(Float.parseFloat(this.tfPeso.getText()));
			usuario.setQtdCaloria(Integer.parseInt(this.tfQtdCaloria.getText()));
			usuario.setPesoEstimado(Float.parseFloat(this.tfPesoAlcan.getText()));
			usuario.setSexo(this.cbSexo.getSelectedIndex());
			//usuario.setTipoDieta();
			
			boolean resp =  this.controlador.cadastrarUsuario(usuario);	
			if(resp)
			{
				Dialog.show("Atenção", "Usuário "+usuario.getNome()+" salvo com sucesso.", "OK", null);	
				//voltar
				MainForm f = Menu.getSingleton();
				f.show();
			}
			
		}
		
		
	}
	
	public boolean validarCadastroUsuario()
	{
		boolean resp = true;
		if((this.tfNome.getText() == null) || (this.tfNome.getText() == ""))
   		{   
   			Dialog.show("Atenção", "Preencha o Nome", "OK", null);
   			resp = false;
   		}else if((this.tfSobreNome.getText() == null) || (this.tfSobreNome.getText() == "")){	
   			Dialog.show("Atenção", "Preencha o SobreNome", "OK", null);
   			resp = false;
   		}else if(this.tfDtNasc.getDate() == null){
   			Dialog.show("Atenção", "Preencha a Data de Nascimento", "OK", null);
   			resp = false;
   		}else if((this.tfAltura.getText() == null) || (this.tfAltura.getText() == "")){
   			Dialog.show("Atenção", "Preencha a Altura", "OK", null);
   			resp = false;
   		}else if((this.tfPeso.getText() == null) || (this.tfPeso.getText() == ""))
   		{
   			Dialog.show("Atenção", "Preencha o Peso", "OK", null);
   			resp = false;
   		}else if((this.tfQtdCaloria.getText() == null) || (this.tfQtdCaloria.getText() == "")){
   			Dialog.show("Atenção", "Preencha a Qtd. de Calorias", "OK", null);
   			resp = false;
   		}else if((this.tfPesoAlcan.getText() == null) || (this.tfPesoAlcan.getText() == "")){
   			Dialog.show("Atenção", "Preencha o Peso Estimado", "OK", null);
   			resp = false;
   		}
		
		return resp;
	}

  

}
