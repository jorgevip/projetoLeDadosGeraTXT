package input;

import javax.swing.JOptionPane;

public class ClienteInput {

	// m�todo para ler o id do cliente
	public Integer lerIdCliente() throws Exception {

		String valor = JOptionPane.showInputDialog("Informe o ID do Cliente:");
		return Integer.parseInt(valor);
	}

	// m�todo para ler o nome do cliente
	public String lerNome() throws Exception {
		return JOptionPane.showInputDialog("Informe o NOME do Cliente:");
	}

	// m�todo para ler o email do cliente
	public String lerEmail() throws Exception {
		return JOptionPane.showInputDialog("Informe o EMAIL do Cliente:");
	}

	// m�todo para ler o cpf do cliente
	public String lerCpf() throws Exception {
		return JOptionPane.showInputDialog("Informe o CPF do Cliente:");
	}
}


