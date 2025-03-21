package desafios;

import java.util.Scanner;

public class Desafio{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira um Numero: ");
        int contador;

        int numeroUsuario = sc.nextInt();
        for (contador = 1; contador <= numeroUsuario; contador++){
            System.out.println(contador);
        }
        
    }
}
