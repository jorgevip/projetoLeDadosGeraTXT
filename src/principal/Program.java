package principal;

import entities.Cliente;
import input.ClienteInput;
import repositories.ClienteRepository;

public class Program {

	public static void main(String[] args) {
		
		
		try {
			
			Cliente cliente = new Cliente();
			ClienteInput input = new ClienteInput();
			
			cliente.setIdCliente(input.lerIdCliente());
			cliente.setNome(input.lerNome());
			cliente.setCpf(input.lerCpf());
			cliente.setEmail(input.lerEmail());
			
			ClienteRepository clienteRepository = new ClienteRepository();
			
			clienteRepository.exportarDados(cliente, "c:\\temp\\cliente.txt");
			
			System.out.println("Arquivo Gerado com Sucesso!!!");
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

}
