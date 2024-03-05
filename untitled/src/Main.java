import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************** Exercicios 1 ************************");
        int i = 13, soma = 0, k = 0;
        while (k < i) {
            k += 1;
            soma += k;
        }
        System.out.println(soma);
        //Soma igual a 91
        System.out.println("*********************** Exercicios 2 ************************");
        /*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
        // anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
        // escreva um programa na linguagem que desejar onde, informado um número,
        // ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se
        // o número informado pertence ou não a sequência.
        */
        System.out.print("digite um numero: ");
        int numero = scanner.nextInt();

        if (checaFibonacci(numero)) {
            System.out.println("o numero " + numero +  " pertence a sequencia  fibonacci");
        } else {
            System.out.println("o numero " + numero +  " nao pertence a sequencia  fibonacci");
        }
        scanner.close();
    }

    public static boolean checaFibonacci(int numero) {
        int a = 0,  b = 1;

        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return false;
    }

    //3) Descubra a lógica e complete o próximo elemento:

    //a) 1, 3, 5, 7, "9"  LOGICA DE NUMEROS IMPARES
    //
    //b) 2, 4, 8, 16, 32, 64, "128"  LOGICA DE NUMEROS SOMADOS POR ELES MESMO  E O RESULTADO DO PROXIMO ELEMENTO
    //
    //c) 0, 1, 4, 9, 16, 25, 36, "49" LOGICA DE QUADRADOS DE NUMEROS NATURAIS
    //
    //d) 4, 16, 36, 64, "100" LOGICA DE QUADRADOS DE NUMEROS PARES
    //
    //e) 1, 1, 2, 3, 5, 8, "13" SEQUENCIA DE FIBONACcI
    //
    //f) 2,10, 12, 16, 17, 18, 19,___ ESSA NAO CONSEGUI RESOLVER

    //Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente.
    // Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.
    // Seu objetivo é descobrir qual interruptor controla qual lâmpada.
    //
    //Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

    //RESPOSTA : Ligava o primeiro interruptor e esperaria  a lampada da sala esquentar e desligaria ele,
    // depois ligaria  o segundo interruptor e iria para umas das sala, se a sala tivesse com a luz ligada, o segundo interruptor
    //corresponde a ela, se tivesse desligada e fria, o terceiro interruptor corresponde a ela, e se tiver quente e desligada
    //o primeiro interruptor corresponde a ela. Eu teria so mais uma entrada em outra sala, e faria o mesmo teste, que dai ja teria
    // como saber qual dos interruptores corresponde as lampadas, sendo que ja descobri o da primeira sala, e o da segunda,
    // e a que faltar e do interruptor que sobrou

}

