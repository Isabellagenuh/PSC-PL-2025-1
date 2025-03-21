public class IfEncadeado {
    public static void main(String[] args){
        double a1;
        double a2;
        double a3;
        double soma;
        a1 = 0;
        a2 = 5;
        a3 = 1;
        soma = a1+ a2+ a3;

        if (soma >= 70){
            System.out.println("Aprovado!");
        }
        else if (soma>= 60){
            System.out.println("Está de recuperação");
        }
        else {
            System.out.println("Reprovado!");
        }

    }
}
