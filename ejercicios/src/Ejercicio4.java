import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
     
        System.out.println("Bienvenida Enfermera, este programa le facilita determinar la cantidad de dosis de una vacuna para un bebé");

        System.out.print("Registre la edad del bebé: ");

        Scanner meineBaby = new Scanner(System.in);
        int baby;
        baby=meineBaby .nextInt();
         //Tiene que ser un bebé menor a un año

         

        if (baby<=1) {
            System.out.println("Como el bebé es menor o igual a un año, verificaremos el peso para determinar la cantidad de dosis en la vacuna");
        }

        else{
            System.out.println("A este bebé NO se le aplica una vacuna");
        }

        System.out.print("Inserte los meses del bebé: ");

        /*Ahora inserta la cantidad de meses que tiene el bebé */ 
         Scanner meineMonth = new Scanner(System.in);
         int mes;
        mes=meineMonth .nextInt();
        
        //Determinamos el número de dosis que debe obtener el bebé

        System.out.print("Inserte el peso del bebé: ");

        Scanner meineWeight = new Scanner(System.in); 
        double weight;
        weight=meineWeight .nextInt();

        //Ahora vamos a aplicar la fórmula que nos brindan

        System.out.print("Ahora aplica la formula: ");

        Scanner meineDosage = new Scanner(System.in);
        double dosage = weight + 10 / mes * 10 * 8;

        System.out.println(dosage);
        

        meineBaby.close();
        meineMonth.close();
        meineWeight.close();
        meineDosage.close();
    }
    
}
