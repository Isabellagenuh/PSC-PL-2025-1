import javax.swing.JOptionPane;
public class Switch {
    /**
     * @param args
     */
    public static void main(String[] args){
        int dia;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        switch (dia) {
           
            case 1:
            JOptionPane.showMessageDialog(null, "Domingo!");
            
            break;

            case 2:
            JOptionPane.showMessageDialog(null, "Segunda!");
            break;
            
            case 3:
            JOptionPane.showMessageDialog(null, "Terça!");
            break;

            case 4:
            System.out.println("Quarta!");
            break;

            case 5:
            System.out.println("Quinta!");
            break;

            case 6:
            System.out.println("Sexta!");
            break;

            case 7:
            System.out.println("Sabado!");
            break;
            default: JOptionPane.showMessageDialog(null, "Digite um numero de 1 - 7");
            
            }
        
    }
}