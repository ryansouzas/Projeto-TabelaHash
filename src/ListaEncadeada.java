public class ListaEncadeada {
    private No inicio;

    public void inserirFinal(Aluno aluno) {
        No novo = new No(aluno);
        if (inicio == null) {
            inicio = novo;
            return;
        }
        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novo;
    }

    public Aluno buscar(int matricula) {
        No atual = inicio;
        while (atual != null) {
            if (atual.aluno.getMatricula() == matricula) {
                return atual.aluno;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public boolean remover(int matricula) {
        if (inicio == null) {
            return false;
        }
        if (inicio.aluno.getMatricula() == matricula) {
            inicio = inicio.proximo;
            return true;
        }
        No anterior = inicio;
        while (anterior.proximo != null) {
            if (anterior.proximo.aluno.getMatricula() == matricula) {
                anterior.proximo = anterior.proximo.proximo;
                return true;
            }
            anterior = anterior.proximo;
        }
        return false;
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        No atual = inicio;
        while (atual != null) {
            sb.append(atual.aluno).append(" -> ");
            atual = atual.proximo;
        }
        sb.append("null");
        return sb.toString();
    }
}
