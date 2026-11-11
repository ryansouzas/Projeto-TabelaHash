import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash();
        int opcao;
        do {
            exibirMenu();
            opcao = lerOpcao();
            switch (opcao) {
                case 1: inserir(tabela); break;
                case 2: buscar(tabela); break;
                case 3: remover(tabela); break;
                case 4: tabela.exibir(); break;
                case 5: System.out.println("Sistema encerrado."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    private static void exibirMenu() {
        System.out.println("\n===== TABELA HASH - ALUNOS =====");
        System.out.println("1 - Inserir novo aluno");
        System.out.println("2 - Buscar aluno");
        System.out.println("3 - Remover aluno");
        System.out.println("4 - Exibir tabela hash");
        System.out.println("5 - Encerrar sistema");
    }

    private static int lerOpcao() {
        System.out.print("Opção: ");
        if (!sc.hasNextLine()) return 5;
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void inserir(TabelaHash tabela) {
        int mat = lerInteiro("Matrícula: ", 0);
        if (mat < 0) return;
        System.out.print("Nome: ");
        String nome = sc.hasNextLine() ? sc.nextLine().trim() : "";
        if (nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        int idade = lerInteiro("Idade: ", 1);
        if (idade < 0) return;
        System.out.println("h(" + mat + ") = " + mat + " mod 11 = " + tabela.endereco(mat));
        if (tabela.inserir(new Aluno(mat, nome, idade))) {
            System.out.println("Aluno inserido na posição " + tabela.endereco(mat) + ".");
        } else {
            System.out.println("Matrícula já cadastrada. Inserção recusada.");
        }
    }

    private static void buscar(TabelaHash tabela) {
        int mat = lerInteiro("Matrícula: ", 0);
        if (mat < 0) return;
        System.out.println("h(" + mat + ") = " + mat + " mod 11 = " + tabela.endereco(mat));
        Aluno a = tabela.buscar(mat);
        System.out.println(a != null ? "Encontrado: " + a : "Aluno não encontrado.");
    }

    private static void remover(TabelaHash tabela) {
        int mat = lerInteiro("Matrícula: ", 0);
        if (mat < 0) return;
        System.out.println("h(" + mat + ") = " + mat + " mod 11 = " + tabela.endereco(mat));
        System.out.println(tabela.remover(mat) ? "Aluno removido." : "Aluno não encontrado.");
    }

    private static int lerInteiro(String msg, int minimo) {
        System.out.print(msg);
        try {
            int v = Integer.parseInt(sc.nextLine().trim());
            if (v < minimo) {
                System.out.println("Valor deve ser >= " + minimo + ".");
                return -1;
            }
            return v;
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida: digite um número inteiro.");
            return -1;
        }
    }
}
