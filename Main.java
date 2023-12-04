package av2_3pob;
import java.util.*;


public class Main {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	private static ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	private static ArrayList<Cama> camas = new ArrayList<Cama>();

	public static void main(String[] args) {
		
		int op = 0;
		Scanner sc = new Scanner(System.in);
		
		while(op != 5) {
			System.out.println("Menu:\n1 - Cliente\n2 - Reserva\n3 - Quarto\n4 - Cama\n5 - Sair\nOpção: ");
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					CrudCliente cliente = new CrudCliente();
					cliente.crudCliente(clientes);
					break;
				case 2:
					CrudReserva reserva = new CrudReserva();
					reserva.crudReserva(reservas);
					break;
				case 3:
					CrudQuarto quarto = new CrudQuarto();
					quarto.crudQuarto(quartos);
					break;
				case 4:
					CrudCama cama = new CrudCama();
					cama.crudCama(camas);
					break;
				case 5:
					System.out.println("Saindo do Programa...");
					break;
				default:
					System.out.println("Opção inválida!\n");
			}
		}
		
		sc.close();
	}
	

	
	
	
	
}

