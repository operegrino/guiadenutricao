import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import negocio.ControladorCategoriaItem;
import Util.ArrayList;
import classe.basica.CategoriaItem;


public class TestandoClasseCatgItemMIDlet extends MIDlet {

	public TestandoClasseCatgItemMIDlet() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {

		ControladorCategoriaItem ctrlCatg = new ControladorCategoriaItem();
		
		CategoriaItem catgItem = new CategoriaItem();
		
		catgItem.setNome("Latcinios");
		CategoriaItem catgItem2 = new CategoriaItem();
		catgItem2.setNome("Frios");
		
		
//		ctrlCatg.cadastrarCatgItem(catgItem);
//		ctrlCatg.cadastrarCatgItem(catgItem2);
		
//		ArrayList list = new ArrayList();
//		list = ctrlCatg.consultarTodasCategoriasItens();
//		int tamanho = list.size();
//		System.out.println("tamanho : " + tamanho);
//		int i = 0;
//		
//		while (i < tamanho){
//
//			catgItem = (CategoriaItem)list.get(i);
//			System.out.println(catgItem.getNome());
//			i++;
//		}
	
//		System.out.println("passou2");
		
//		catgItem = ctrlCatg.buscarCategoriaItem(1);
//		System.out.println(catgItem.getId());
//		System.out.println(catgItem.getNome());
		
		//ctrlCatg.excluirCategoriaItem(catgItem);
		
		
		

	}

}
