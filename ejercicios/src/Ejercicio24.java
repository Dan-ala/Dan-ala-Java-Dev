import java.util.*;
public class Ejercicio24 {
    public static void main(String[] args) {
        String sede;
           System.out.println("Se determina en qué aula está, dependiendo de la sede donde se encuentre");

           System.out.print("Por favor digite en qué sede se encuentra, recuerde, primer caracter en mayúscula: ");
           Scanner seDe=new Scanner(System.in);
           sede=seDe .nextLine();

           switch (sede) {

            case "Calle 63":
            System.out.println("Usted está en el aula 512 Torre 2");    
                break;

                case "Calle 52":
                System.out.println("Usted está en el aula 412");
                break;
           
            default:
            System.out.println("Por favor ingrese información coherente");
                break;
           }

           seDe.close();
    }
}
