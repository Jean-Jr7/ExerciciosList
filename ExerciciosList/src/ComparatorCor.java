import java.util.Comparator;

public class ComparatorCor implements Comparator<Gatos>{

    @Override
    public int compare(Gatos g1, Gatos g2) {
        return g1.getCor().compareToIgnoreCase(g2.getNome());
    }
}
