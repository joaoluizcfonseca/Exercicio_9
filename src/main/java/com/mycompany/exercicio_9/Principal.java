import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        int peso;
        double altura, imc;
        peso = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);
        
    }
}   