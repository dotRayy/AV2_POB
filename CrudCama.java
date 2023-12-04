package av2_3pob;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudCama {

    private ArrayList<Cama> camas = new ArrayList<>();

    public void crudCama(ArrayList<Cama> c) {
        camas = c;

        int op = 0;
        while (op != 5) {
            System.out.println("Cama:\n1 - Incluir\n2 - Alterar\n3 - Excluir\n4 - Listar\n5 - Voltar\nOpção: ");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();

            switch (op) {
                case 1:
                    if (incluirCama()) {
                        System.out.println("Cama Incluída!");
                    } else {
                        System.out.println("Falha na Inclusão!");
                    }
                    break;
                case 2:
                    if (alterarCama()) {
                        System.out.println("Cama Alterada!");
                    } else {
                        System.out.println("Falha na Alteração!");
                    }
                    break;
                case 3:
                    if (excluirCama()) {
                        System.out.println("Cama Excluída!");
                    } else {
                        System.out.println("Falha na Exclusão!");
                    }
                    break;
                case 4:
                    listarCamas();
            }
        }
    }

    private boolean incluirCama() {
        Cama cama;

        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        int id = sc.nextInt();

        System.out.print("Código de Cama: ");
        int codigoCama = sc.nextInt();

        System.out.print("É Beliche (true/false): ");
        boolean ehBeliche = sc.nextBoolean();

        sc.nextLine();

        System.out.print("Posição: ");
        String posicao = sc.nextLine();

        System.out.print("Descrição: ");
        String descricao = sc.nextLine();

        cama = new Cama(id, codigoCama, ehBeliche, posicao, descricao);

        for (Cama c : camas) {
            if (c.getId() == id) {
                return false;
            }
        }

        camas.add(cama);
        return true;
    }

    private boolean alterarCama() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID da cama que será alterada: ");
        int alterarId = sc.nextInt();

        for (Cama c : camas) {
            if (c.getId() == alterarId) {
                Cama cama = c;

                System.out.print("Código de Cama: ");
                int codigoCama = sc.nextInt();

                System.out.print("É Beliche (true/false): ");
                boolean ehBeliche = sc.nextBoolean();

                sc.nextLine();

                System.out.print("Posição: ");
                String posicao = sc.nextLine();

                System.out.print("Descrição: ");
                String descricao = sc.nextLine();

                cama.setCodigoCama(codigoCama);
                cama.setEhBeliche(ehBeliche);
                cama.setPosicao(posicao);
                cama.setDescricao(descricao);
            }
        }

        return true;
    }

    private boolean excluirCama() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Id da cama a ser removida: ");
        int idExclusao = sc.nextInt();

        for (int i = 0; i < camas.size(); i++) {
            if (camas.get(i).getId() == idExclusao) {
                camas.remove(i);
                return true;
            }
        }

        return false;
    }

    private void listarCamas() {
        System.out.println("Lista de Camas:");

        for (Cama cama : camas) {
            System.out.println(cama.toString());
            System.out.println("-------------------------");
        }
    }
}
