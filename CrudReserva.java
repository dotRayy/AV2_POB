package av2_3pob;

import java.text.*;
import java.util.*;

public class CrudReserva {
	
	private ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    public void crudReserva(ArrayList<Reserva> r) {
        
        reservas = r;
        
        int op = 0;
        while (op != 5) {
            System.out.println("Reserva:\n1 - Incluir\n2 - Alterar\n3 - Excluir\n4 - Listar\n5 - Voltar\nOpção: ");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    if (incluirReserva()) {
                        System.out.println("Reserva Incluída!");
                    } else {
                        System.out.println("Falha na Inclusão!");
                    }
                    break;
                case 2:
                    if (alterarReserva()) {
                        System.out.println("Reserva Alterada!");
                    } else {
                        System.out.println("Falha na Alteração!");
                    }
                    break;
                case 3:
                    if (excluirReserva()) {
                        System.out.println("Reserva Excluída!");
                    } else {
                        System.out.println("Falha na Exclusão!");
                    }
                    break;
                case 4:
                    listarReservas();
            }
        }
    }
    
    private boolean incluirReserva() {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("ID: ");
        int id = sc.nextInt();

        System.out.println("ID Quarto: ");
        int idQuarto = sc.nextInt();

        System.out.println("ID Cama: ");
        int idCama = sc.nextInt();

        System.out.print("ID Cliente: ");
        int idCliente = sc.nextInt();

        sc.nextLine();

        System.out.print("Data de Entrada (DD/MM/AAAA): ");
        String dataEntradaString = sc.nextLine();
        
        System.out.print("Data de Saída (DD/MM/AAAA): ");
        String dataSaidaString = sc.nextLine();

        try {
            Date dataEntrada = sdf.parse(dataEntradaString);
            Date dataSaida = sdf.parse(dataSaidaString);

            Reserva reserva = new Reserva(id, idQuarto, idCama, idCliente, dataEntrada, dataSaida);

            for (Reserva r : reservas) {
                if (r.getId() == id) {
                    return false;
                }
            }

            reservas.add(reserva);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido!");
            return false;
        }

        return true;
    }

    
    private boolean alterarReserva() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Digite o ID da reserva que será alterada: ");
        int alterarId = sc.nextInt();
        
        for (Reserva r : reservas) {
            if (r.getId() == alterarId) {
                Reserva reserva = r;
                
                System.out.print("ID Quarto: ");
                int idQuarto = sc.nextInt();
                
                System.out.print("ID Cama: ");
                int idCama = sc.nextInt();
                
                System.out.print("ID Cliente: ");
                int idCliente = sc.nextInt();
                
                sc.nextLine();
                    
                System.out.println("Data de Entrada (DD/MM/AAAA): ");
                String dataEntradaString = sc.nextLine();
                
                System.out.println("Data de Saída (DD/MM/AAAA): ");
                String dataSaidaString = sc.nextLine();

                try {
                    Date dataEntrada = sdf.parse(dataEntradaString);
                    Date dataSaida = sdf.parse(dataSaidaString);

                    reserva.setIdQuarto(idQuarto);
                    reserva.setIdCama(idCama);
                    reserva.setIdCliente(idCliente);
                    reserva.setDataEntrada(dataEntrada);
                    reserva.setDataSaida(dataSaida);

                } catch (ParseException e) {
                    System.out.println("Formato de data inválido!");
                    return false;
                }
            }
        }   
        
        return true;
    }
    
    private boolean excluirReserva() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Id da reserva a ser removida: ");
        int idExclusao = sc.nextInt();
        
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getId() == idExclusao) {
                reservas.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    private void listarReservas() {
        System.out.println("Lista de Reservas:");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Reserva reserva : reservas) {
            System.out.println(reserva.toString());
            System.out.println("-------------------------");
        }   
    }
}