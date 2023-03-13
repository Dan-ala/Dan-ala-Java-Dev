import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        String meses;
        System.out.println("Se determina la estación en la que está, según el mes ingresado");

        System.out.print("Por favor, digite un mes (la primera letra en mayúscula): ");


        Scanner dieMonate=new Scanner(System.in);
        meses=dieMonate .nextLine();

        switch (meses) {

            case "Diciembre","Enero","Febrero":
            System.out.println("Usted está en invierno");
                
                break;

                case "Marzo","Abril","Mayo":
                System.out.println("Usted está en primavera");

                break;

                case "Junio","Julio","Agosto":
                System.out.println("Usted está en verano");

                break;

                case "Septiembre","Octubre","Noviembre":
                System.out.println("Usted está en otoño");

                break;
        
            default:
            System.out.println("EROR, lo que ha ingresado, no es un mes, reinicie el programa.");
                break;
        }
        dieMonate.close();
    }
    
}
