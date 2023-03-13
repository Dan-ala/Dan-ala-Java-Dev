import java.util.*;
public class Ejercicio18 {
    public static void main(String[] args) {
        String nombre="Tatiana",nUsu;

        System.out.print("Ingrese un nombre que tenga 4 vocales y 3 consonantes: ");

        Scanner ingreNom=new Scanner(System.in);
        nUsu=ingreNom .nextLine();


        if (nUsu==nombre) {
            System.out.println("En hora buena, el nombre es correcto");
        }else{
            System.out.println("No es correcto, vuelva a intentar");
        }
        ingreNom.close();
    }
}
