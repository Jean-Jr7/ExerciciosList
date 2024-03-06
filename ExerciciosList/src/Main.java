import java.util.*;


public class Main {
    public static void main(String[] args) {
        //crie uma lista e add 7 notas
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(1.0);
        notas.add(2.0);
        notas.add(3.0);
        notas.add(4.0);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(7.0);

        // Imprima a lista com as notas
        System.out.println(notas);

        // Exibar a posicao da nota 5.0
        System.out.println("Nota 5.0 na posicao: " + notas.indexOf(5d));

        // Add na lista a nota 8.0 na posicao 4
        notas.add(4, 8.0);
        System.out.println(notas);

        // troque a nota 5 pela 6
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        // Confira se a nota 5 esta na lista
        System.out.println(notas.contains(5d));

        //Exibar as notas de acordo que foram inseridas
        for (Double nota : notas) System.out.println(nota);

        // Exiba a nota na posicao 3
        System.out.println("Nota na pisicao 3: " + notas.get(2));

        // Exiba a menor nota e a maior
        //Nao Existe um metodo do list porem tem da classe colection e nossa list e uma colection
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        // Exibar a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        //Exiba a media das notas
        System.out.println("Medias das notas: " + soma / notas.size());

        // Removar a nota 0
        notas.remove(1.0);
        System.out.println(notas);

        //Removar as notas menores que 7 e exiba na list
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            double next = iterator1.next();
            if (next <= 7) iterator1.remove();
        }
        System.out.println(notas);

        //Passe os elementos de uma lista para outra lista
        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.addAll(notas);
        System.out.println(notas2);


        List<Gatos> meusGatos = new ArrayList<>(){{
            add(new Gatos("joao",10,"preto"));
            add(new Gatos("lucas",12,"branco"));
            add(new Gatos("joao",20,"amarelo"));
        }};
        System.out.println("\n********** ordem por insercao **********");
        System.out.println(meusGatos);

        System.out.println("\n********** Ordem aleatoria **********");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n********** Ordem Natural Por nome **********");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n********** Ordem Por idade **********");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n********** Ordem por cor **********");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\n********** Ordem Por Nome Cor e idade **********");
        Collections.sort(meusGatos,new ComparatorNomeCorIdade());
        System.out.println(meusGatos);


    }



}


