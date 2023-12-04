package av2_3pob;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudQuarto {

    private ArrayList<Quarto> quartos = new ArrayList<Quarto>();

    public void crudQuarto(ArrayList<Quarto> q) {
        quartos = q;

        int op = 0;
        while (op != 5) {
            System.out.println("Quarto:\n1 - Incluir\n2 - Alterar\n3 - Excluir\n4 - Listar\n5 - Voltar\nOpção: ");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();

            switch (op) {
                case 1:
                    if (incluirQuarto()) {
                        System.out.println("Quarto Incluído!");
                    } else {
                        System.out.println("Falha na Inclusão!");
                    }
                    break;
                case 2:
                    if (alterarQuarto()) {
                        System.out.println("Quarto Alterado!");
                    } else {
                        System.out.println("Falha na Alteração!");
                    }
                    break;
                case 3:
                    if (excluirQuarto()) {
                        System.out.println("Quarto Excluído!");
                    } else {
                        System.out.println("Falha na Exclusão!");
                    }
                    break;
                case 4:
                    listarQuartos();
            }
        }
    }

    private boolean incluirQuarto() {
        Quarto quarto;

        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Nome do Quarto: ");
        String nomeQuarto = sc.nextLine();

        System.out.print("Quantidade de Camas (4/8/12): ");
        int qtdeCamas = sc.nextInt();
        
        boolean temBanheiro = false;
        if(!verificaCamas(qtdeCamas, temBanheiro)) {
        	return false;
        }

        sc.nextLine();

        System.out.print("Descrição: ");
        String descricao = sc.nextLine();

        quarto = new Quarto(id, nomeQuarto, qtdeCamas, temBanheiro, descricao);

        for (Quarto q : quartos) {
            if (q.getId() == id) {
                return false;
            }
        }

        quartos.add(quarto);
        return true;
    }

    private boolean alterarQuarto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID do quarto que será alterado: ");
        int alterarId = sc.nextInt();

        for (Quarto q : quartos) {
            if (q.getId() == alterarId) {
                Quarto quarto = q;

                sc.nextLine();

                System.out.print("Nome do Quarto: ");
                String nomeQuarto = sc.nextLine();

                System.out.print("Quantidade de Camas (4/8/12): ");
                int qtdeCamas = sc.nextInt();
                
                boolean temBanheiro = false;
                if(!verificaCamas(qtdeCamas, temBanheiro)) {
                	return false;
                }
                
                sc.nextLine();

                System.out.print("Descrição: ");
                String descricao = sc.nextLine();

                quarto.setNomeQuarto(nomeQuarto);
                quarto.setQtdeCamas(qtdeCamas);
                quarto.setTemBanheiro(temBanheiro);
                quarto.setDescricao(descricao);
            }
        }

        return true;
    }

    private boolean excluirQuarto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Id do quarto a ser removido: ");
        int idExclusao = sc.nextInt();

        for (int i = 0; i < quartos.size(); i++) {
            if (quartos.get(i).getId() == idExclusao) {
                quartos.remove(i);
                return true;
            }
        }

        return false;
    }

    private void listarQuartos() {
        System.out.println("Lista de Quartos:");

        for (Quarto quarto : quartos) {
            System.out.println(quarto.toString());
            System.out.println("-------------------------");
        }
    }
    
    private boolean verificaCamas(int qtCamas, boolean temBanheiro) {
    	
    	if(qtCamas != 4 && qtCamas != 8 && qtCamas != 12) {
    		return false;
    	} else {
    		
    		if(qtCamas == 8) {
            	temBanheiro = false;
            } else {
            	temBanheiro = true;
            }
    	}
    	
    	return true;
    }
}
