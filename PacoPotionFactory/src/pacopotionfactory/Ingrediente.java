
package pacopotionfactory;
import java.util.*;
public class Ingrediente {
    //Atributos
    protected String NombreIngr;
    protected String Efecto;
    protected String Tipo;
    protected int Cantidad;
    //Constructor de Atributos
    public Ingrediente(String nombreIngr, String efecto, String tipo, int cant) { //inicializo los atributos
        this.NombreIngr = nombreIngr;
        this.Efecto = efecto ;
        this.Tipo = tipo;
        this.Cantidad = cant;
    }
    public String getNombreIngr() {
        return NombreIngr;
    }
    public String getEfecto() {
        return Efecto;
    }
    public String getTipo() {
        return Tipo;
    }
    public static Ingrediente crearIngr(String nombreIngr, String efecto, String tipo, int cant){
        
        return new Ingrediente(nombreIngr,efecto,tipo,cant);
    }
    public void mostrarInfoIngr(){
        /*int n = 0;
        System.out.println(" ");
        System.out.println((n+1) + ingred );
        System.out.println("Efecto: " + ingred.getEfecto());*/

    }
}
