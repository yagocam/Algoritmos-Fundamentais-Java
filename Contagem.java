import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        int n ;
        Scanner dado;
        dado = new Scanner (System.in);
        System.out.println("Informe a quantidade de notas");
        n = dado.nextInt();
        int nota ;
        int contador = 0;
        int i = 0;

        while (i<n) {
        System.out.println("Informe uma nota ");
        nota = dado.nextInt();
            if (nota>=50) {
                contador ++;
            }
                i++;
        }
            System.out.println("Número de alunos que passaram no exame : " + contador );


    }
}
