import javax.swing.JOptionPane;

public class ExemploIf {
    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if(numero > 0){
            JOptionPane.showMessageDialog(null, "o numero " + numero + " é positivo");
        }
        else{
            JOptionPane.showMessageDialog(null, "Você digitou um numero invalido!");
        }
    }
}
