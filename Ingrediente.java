
package pacopotionfactory;

public class Ingrediente {
    //Atributos
    protected String NombreIngr;
    protected String Efecto;
    protected String Tipo;
    //Constructor de Atributos
    public Ingrediente(String nombreingr, String efecto, String tipo) { //inicializo los atributos
        this.NombreIngr = nombreingr;
        this.Efecto = efecto ;
        this.Tipo = tipo;
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
}
