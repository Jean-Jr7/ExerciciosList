import java.util.Comparator;

public class ComparatorIdade implements Comparator<Gatos> {
    @Override
    public int compare(Gatos G1, Gatos G2) {
        return Integer.compare(G1.getIdade(), G2.getIdade());
    }
}
