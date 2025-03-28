public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Isabella";
        p1.idade = 18;
        p1.apresentar();
        


        ContaBancaria cb = new ContaBancaria();
        cb.setSaldo(1222222);

        Calculadora calc = new Calculadora();
        calc.somar(45, 55);
        int res = calc.multiplicar(78, 987);
        ;


    }
}
