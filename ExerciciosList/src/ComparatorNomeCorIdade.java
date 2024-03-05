import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gatos> {
    @Override
    public int compare(Gatos g1, Gatos g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
