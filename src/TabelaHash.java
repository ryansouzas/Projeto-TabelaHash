public class TabelaHash {
    private static final int M = 11;
    private final ListaEncadeada[] tabela = new ListaEncadeada[M];

    public TabelaHash() {
        for (int i = 0; i < M; i++) {
            tabela[i] = new ListaEncadeada();
        }
    }

    private int hash(int chave) {
        return chave % M;
    }

    public int endereco(int chave) {
        return hash(chave);
    }

    public boolean inserir(Aluno aluno) {
        int pos = hash(aluno.getMatricula());
        if (tabela[pos].buscar(aluno.getMatricula()) != null) {
            return false;
        }
        tabela[pos].inserirFinal(aluno);
        return true;
    }

    public Aluno buscar(int matricula) {
        return tabela[hash(matricula)].buscar(matricula);
    }

    public boolean remover(int matricula) {
        return tabela[hash(matricula)].remover(matricula);
    }

    public void exibir() {
        for (int i = 0; i < M; i++) {
            System.out.println("[" + i + "] -> " + tabela[i].imprimir());
        }
    }
}
