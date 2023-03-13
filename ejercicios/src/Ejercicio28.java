import java.util.Scanner;

public class Ejercicio28 {
 public static void main(String[] args) {
    String clima;
    System.out.println("Se determinará la estación en que se encuentra, según el clima y las situaciones presentadas:");

    //invierno
    System.out.println("Invierno: ");
    System.out.println("Días fríos"); System.out.println("");
    System.out.println("Se usasn guantes"); System.out.println("");
    System.out.println("Se toman bebidas calientes"); System.out.println("");

    //primavera
    System.out.println("Primavera: ");
    System.out.println("Días no tan calientes"); System.out.println("");
    System.out.println("Hay muchas mariposas"); System.out.println("");
    System.out.println("Las personas cultivan árboles"); System.out.println("");

    //verano
    System.out.println("Verano: ");
    System.out.println("Días calientes"); System.out.println("");
    System.out.println("Tiempo de vacaciones"); System.out.println("");
    System.out.println("Se utilizan las gafas de sol"); System.out.println("");

    //otoño
    System.out.println("Otoño: "); 
    System.out.println("Viento"); System.out.println("");
    System.out.println("Cosechas"); System.out.println("");
    System.out.println("Las hojas se caen"); System.out.println("");
    
    System.out.print("Por favor ingrese un clima, recuerde, el primer caracter en mayúscula: ");

    Scanner weather=new Scanner(System.in);
    clima=weather .nextLine();

    switch (clima) {
        case "Días fríos","Se usan guantes","Se toman bebidas calientes":
        System.out.println("Usted está en invierno");
        break;

        case "Días no tan calientes","Hay muchas mariposas","Las personas cultivan árboles":
        System.out.println("Usted está en primavera");
            break;

            case "Días calientes","Tiempo de vacaciones","Se utilizan las gafas de sol":
            System.out.println("Usted está en verano");
            break;

            case "Viento","Cosechas","Las hojas se caen":
            System.out.println("Usted está en otoño");
            break;
    
        default:
        System.out.println("INGRESE INFO REAL");
            break;
    }
    weather.close();
 }   
}
