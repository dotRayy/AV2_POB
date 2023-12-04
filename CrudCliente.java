package av2_3pob;

import java.text.*;
import java.util.*;

	public class CrudCliente {
		
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public void crudCliente(ArrayList<Cliente> c) {
		
		clientes = c;
		
		int op = 0;
		while(op != 5) {
			System.out.println("Cliente:\n1 - Incluir\n2 - Alterar\n3 - Excluir\n4 - Listar\n5 - Voltar\nOpção: ");
			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					if(incluirCliente()) {
						System.out.println("Cliente Incluído!");
					} else {
						System.out.println("Falha na Inclusão!");
					}
					break;
				case 2:
					if(alterarCliente()) {
						System.out.println("Cliente Alterado!");
					} else {
						System.out.println("Falha na Alteração!");
					}
					break;
				case 3:
					if(excluirCliente()) {
						System.out.println("Cliente Excluído!");
					} else {
						System.out.println("Falha na Exclusão!");
					}
					break;
				case 4:
					listarClientes();
			}
		}
	}
	
	private boolean incluirCliente() {
		Cliente cliente;
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
		System.out.print("ID: ");
		int id = sc.nextInt();
		
		sc.nextLine();
			
		System.out.print("Nome: ");
		String nome = sc.nextLine();
			
		System.out.print("Endereço: ");
		String endereco = sc.nextLine();
		
		System.out.print("Código Postal: ");
		String postalCode = sc.nextLine();
		
		System.out.print("País: ");
		String pais = sc.nextLine();
		
		System.out.print("CPF: ");
		String cpf = sc.nextLine();
		
		System.out.print("Passaporte: ");
		String passaporte = sc.nextLine();
		
		System.out.print("Email");
		String email = sc.nextLine();
		
		System.out.print("Data de Nascimento (DD/MM/AAAA): ");
		String data = sc.nextLine();
		
		try {
			Date dataNascimento = sdf.parse(data);
			cliente = new Cliente(id, nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento);
			for(Cliente c: clientes) {
				if(c.getId() == id) {
					return false;
				}
			}
			
			clientes.add(cliente);
		} catch (ParseException e) {
			System.out.println("Formato de data inválido!");
			return false;
		}
		
		return true;
	}
	
	private boolean alterarCliente() {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite o ID do cliente que será alterado: ");
		int alterarId = sc.nextInt();
		
		for (Cliente c : clientes) {
			if (c.getId() == alterarId) {
				Cliente cliente = c;
					
				System.out.print("Nome: ");
				String nome = sc.nextLine();
					
				System.out.print("Endereço: ");
				String endereco = sc.nextLine();
				
				System.out.print("Código Postal: ");
				String postalCode = sc.nextLine();
				
				System.out.print("País: ");
				String pais = sc.nextLine();
				
				System.out.print("CPF: ");
				String cpf = sc.nextLine();
				
				System.out.print("Passaporte: ");
				String passaporte = sc.nextLine();
				
				System.out.print("Email");
				String email = sc.nextLine();
				
				System.out.print("Data de Nascimento (DD/MM/AAAA): ");
				String data = sc.nextLine();
				
				try {
					Date dataNascimento = sdf.parse(data);
					
					cliente.setNome(nome);
					cliente.setEndereco(endereco);
					cliente.setPostalCode(postalCode);
					cliente.setPais(pais);
					cliente.setCpf(cpf);
					cliente.setPassaporte(passaporte);
					cliente.setEmail(email);
					cliente.setDataNascimento(sdf.parse(data));
					
				} catch (ParseException e) {
					System.out.println("Formato de data inválido!");
					return false;
				}
			}
        }	
		
		return true;
	}
	
	private boolean excluirCliente() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Id do cliente a ser removido: ");
		int idExclusao = sc.nextInt();
		
		for(int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getId() == idExclusao) {
				clientes.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	private void listarClientes() {
		
        System.out.println("Lista de Clientes:");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
            System.out.println("-------------------------");
        }	
	}

}
