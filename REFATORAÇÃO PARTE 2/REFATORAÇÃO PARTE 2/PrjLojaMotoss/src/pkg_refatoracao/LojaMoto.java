package pkg_refatoracao;
import javax.swing.*;
public class LojaMoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			try {
				String nome = JOptionPane.showInputDialog(
						"Informe a marca \n(acione [CANCELAR] para sair!)");
			fabricaMoto(nome);
				
			}catch (Exception e){
				break;
			}
		}
		System.out.println("\nPROGRAMA FINALIZADO");
	}

	private static void fabricaMoto(String nome) {
		if(nome.equalsIgnoreCase("Honda")) {
			Moto moto = new Honda();
			mostrarDadosMoto(moto);
		}else if(nome.equalsIgnoreCase("Yamaha")){
			Moto moto = new Yamaha();
			mostrarDadosMoto(moto);
		}else if(nome.equalsIgnoreCase("Suzuki")) {
			Moto moto = new Suzuki();
			mostrarDadosMoto(moto);
		}else {
		JOptionPane.showMessageDialog(null,
				"Somente disponíveis na loja: Honda, Yamaha e Suzuki",
				"Mensagem do programa",
				JOptionPane.CANCEL_OPTION);
		}
	}

	private static void mostrarDadosMoto(Moto moto) {
		JOptionPane.showMessageDialog(null, 
		"\nNome: "+moto.nome+
		"\nCilindrada: "+moto.cilindrada+
		"\nCor: "+moto.cor, "Dados da moto",
		JOptionPane.CLOSED_OPTION);
	}

}
