
package principal;
import model.Circulo;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Circulo cir1 = new Circulo();
        
        cir1.setRaio(Double.parseDouble(JOptionPane.showInputDialog("raio: ")));
        JOptionPane.showMessageDialog(null, cir1.getArea());
    }
}
