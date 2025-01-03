
package pacopotionfactory;
import java.util.*;
public class Pocion {

    //Atributos
    protected String Nombre;
    protected Ingrediente Ingrediente1;
    protected Ingrediente Ingrediente2;
    protected Ingrediente Ingrediente3;
    protected String Efectos;
    protected String Tamaño;
    //Constructor de Atributos
    public Pocion(String nombre, Ingrediente ingr1, Ingrediente ingr2, Ingrediente ingr3, String efectos, String tamaño) { //inicializo los atributos
        this.Nombre = nombre;
        this.Ingrediente1 = ingr1 ;
        this.Ingrediente2 = ingr2;
        this.Ingrediente3 = ingr3;
        this.Efectos = efectos;
        this.Tamaño = tamaño; 
    }
    //Getters
    public String getNombrePocion() {
        return Nombre;
    }
    public String getIngr1() {
        return Ingrediente1.getNombreIngr();
    }
    public String getIngr2() {
        return Ingrediente2.getNombreIngr();
    }
    public String getIngr3() {
        return Ingrediente3.getNombreIngr();
    }
    public String getEfectos() {
        return Efectos;
    }
    public String getTamaño() {
        return Tamaño;
    }

    public static Pocion crearPocion(Ingrediente ingr1, Ingrediente ingr2, Ingrediente ingr3){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la poción");
        String nombrePocion = s1.nextLine();
        String efectos = ingr1.getEfecto() + ", " + ingr2.getEfecto() + ", " + ingr3.getEfecto();
        return new Pocion(nombrePocion,ingr1,ingr2,ingr3,efectos,"Estandar");
    }
    public void mostrarInfo(String nombrePocion, Ingrediente ingr1, Ingrediente ingr2, Ingrediente ingr3, String efectos, String tamaño){
        System.out.println(" ");
        System.out.println("Nombre: " + nombrePocion);
        System.out.println("Ingrediente 1: " + ingr1.getNombreIngr() + " Tipo: " + ingr1.getTipo());
        System.out.println("Ingrediente 2: " + ingr2.getNombreIngr() + " Tipo: " + ingr2.getTipo());
        System.out.println("Ingrediente 3: " + ingr3.getNombreIngr()+ " Tipo: " + ingr3.getTipo());
        System.out.println("Efectos de la pocion: " + ingr1.getEfecto() + ", " + ingr2.getEfecto() + ", " + ingr3.getEfecto());
        System.out.println("Tamaño de la Pocion: " + tamaño);
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------");
    }
}
