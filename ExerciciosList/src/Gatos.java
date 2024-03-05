public class Gatos implements Comparable<Gatos> {
    private String nome;
    private Integer Idade;
    private String cor;

    public Gatos(String nome, Integer idade, String cor) {
        this.nome = nome;
        Idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gatos{" +
                "nome='" + nome + '\'' +
                ", Idade=" + Idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gatos gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
