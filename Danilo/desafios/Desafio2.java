package desafios;
import java.util.Scanner;

public class Desafio2{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira um Numero: ");
        int numeroUsuario = sc.nextInt();
        int contador;

        
        for (contador = 1; contador<=10 ; contador++){
            System.out.println(numeroUsuario * contador);
        }
    }
}

