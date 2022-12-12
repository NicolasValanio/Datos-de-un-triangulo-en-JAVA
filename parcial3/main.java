package parcial3;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
    
        //Declaramos las variables que vamos a requerir para llamar a la clase triangulorectangulo
        String nombrefig= JOptionPane.showInputDialog("Digite el nombre de la figura: ");
        byte cantladosfig = Byte.parseByte(JOptionPane.showInputDialog("Cuantos lados tiene la figura? "));
        float base = Float.parseFloat(JOptionPane.showInputDialog("Cual es la base de la figura?"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Cual es la altura de la figura?"));

        // Creamos el objeto nuevafig y para ello llamaremos a la clase triangulorectangulo

        triangulorectangulo nuevafig = new triangulorectangulo(nombrefig, cantladosfig, base, altura);
        // Una vez creado el objeto llamamos a la funcion de mostrarInformacion
        nuevafig.mostrarInformacion();
    }
}
