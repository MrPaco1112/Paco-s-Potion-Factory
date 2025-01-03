
package pacopotionfactory;
import java.util.*;
/**
 * @author Juan Esteban Sarmiento Benitez - A.K.A : Paco :D
 */
public class PacoPotionFactory {


    public static void main(String[] args) {
        System.out.println("==== Bienvenido a la fabrica de pociones digital de Paco =====");
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int opcion1 = -1;
        Ingrediente ingr1 = new Ingrediente("Roca volcanica","Quemadura","Igneo");
        Ingrediente ingr2 = new Ingrediente("Saco de tinta","Envenenamiento","Tintoso");
        Ingrediente ingr3 = new Ingrediente("Fibra de borrador","Daño","Borrador");
        ArrayList<Pocion> pociones = new ArrayList<>();
        
        do{
            try{
                System.out.println("=== Menu Principal ===");
                System.out.println("1. Crear pociones");
                System.out.println("2. Ver pociones creadas");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                opcion1 = s.nextInt();                
            }catch(InputMismatchException e){
                System.out.println("Error el valor ingresado no es valido, reintentar");
                System.out.println();
                break;
            }
            switch(opcion1){
                case 1:
                    Pocion nuevaPocion = Pocion.crearPocion(ingr1,ingr2,ingr3);
                    pociones.add(nuevaPocion);
                    break;
                case 2:
                    
                    System.out.println("==== Pociones creadas ====");
                    if(pociones.isEmpty()){
                        System.out.println("No se han creado pociones");
                        System.out.println("Desea crear una pocion?");
                        System.out.println("1. Si ");
                        System.out.println("2. No ");
                        int opcion2 = s2.nextInt();
                        switch(opcion2){
                            case 1:
                                Pocion nuevaPocion2 = Pocion.crearPocion(ingr1, ingr2,ingr3);
                                pociones.add(nuevaPocion2);
                                break;
                            case 2:
                                System.out.println("Saliendo");
                                break;
                            }
                    }else{
                        System.out.println("==== Lista de pociones ====");
                        for (Pocion pocion : pociones){
                            pocion.mostrarInfo(pocion.getNombrePocion(),ingr1,ingr2,ingr3,pocion.getEfectos(),pocion.getTamaño());
                        }    
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
            }        
        }while(opcion1 != 3);
        
    }
    
}
