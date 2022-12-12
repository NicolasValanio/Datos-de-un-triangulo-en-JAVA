package parcial3;
import java.util.Scanner;
import javax.swing.JOptionPane;

// Creamos la clase:

public class triangulorectangulo {
    
    // Creamos las variables:

    public String nombrefig;
    public byte Cantladosfig;
    private float base;
    private float altura;
    private float hipotenusa;
    private float area;
    private float perimetro;

    // Creamos el constructor:

    public triangulorectangulo(String nombrefig, byte cantladosfig, float base, float altura) {
        this.nombrefig = nombrefig;
        Cantladosfig = cantladosfig;
        this.base = base;
        this.altura = altura;
    }

    // Creamos los getter and seller:
    public String getNombrefig() {
        return nombrefig;
    }

    public void setNombrefig(String nombrefig) {
        this.nombrefig = nombrefig;
    }

    public byte getCantladosfig() {
        return Cantladosfig;
    }

    public void setCantladosfig(byte cantladosfig) {
        Cantladosfig = cantladosfig;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(float hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    // Funcion que recibe los datos de altura y base y retorna el hipotenusa del triangulo:
    public float hipotenusafig(float altura, Float base){
        float hipotenusa;
        double raiz;
        hipotenusa = ((altura*altura)+(base*base));
        raiz =Math.sqrt(hipotenusa);
        return (float)raiz;
    }

    // Funcion que recibe los datos de los lados de la figura y retorna la sumatoria de estos (perimetro)
    public float perimetrofigura(float altura, Float base, float hipotenusa){
        float perimetro = altura+base+hipotenusafig(altura, base);
        return perimetro;
    }

    // Funcion que recibe los datos de la base y la altura y retorna el area de la figura
    public float areaFigura(float base, float altura){
        float area= ((base*altura)/2);
        return area;
    }

    // Funcion que no recibe datos de entrada y concatena la informacion de la figura en un cuadro de texto

    public void mostrarInformacion(){
        JOptionPane.showMessageDialog(null, "Informacion de la figura: \n"+"Nombre :"+nombrefig+"\n"+"Cant lados: "+Cantladosfig+"\n"+"Base: "+base+"\n"+"Altura :"+altura+"\n"+"Hipotenusa: "+hipotenusafig(altura, base)+"\n"+"Perimetro: "+perimetrofigura(altura, base, hipotenusa)+"\n"+"Area :"+areaFigura(base, altura));
    }

    }

   





