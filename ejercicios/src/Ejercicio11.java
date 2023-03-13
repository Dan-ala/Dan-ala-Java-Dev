import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args) {

        String mes;  int day;
        

        System.out.print("Este programa le dice su digno zodiacal dependiendo el mes y el día de su nacimiento");
        System.out.println("");
        System.out.print("Ingrese el mes en que nació (en minúscula): ");

        Scanner mesDia=new Scanner(System.in);
        mes=mesDia .nextLine();

        System.out.print("Ingrese el día en que nació (1-31): ");
        day=mesDia .nextInt();

        switch (mes) {
            case "enero":

            if (day<=19) {
                System.out.print("capricornio");
            }else{
                System.out.print("acuario");
            }
                
                break;

                case "febrero":

            if (day<=18) {
                System.out.print("acuario");
            }else{
                System.out.print("piscis");
            }
                
                break;

                case "marzo":

            if (day<=20) {
                System.out.print("piscis");
            }else{
                System.out.print("aries");
            }
                
                break;

                case "abril":

                if (day<=19) {
                    System.out.println("aries");
                }else{
                    System.out.println("tauro");
                }

                break;

                case "mayo":

                if (day<=20) {
                    System.out.println("tauro");
                }else{
                    System.out.println("geminis");
                }

                break;

                case "junio":

                if (day<=20) {
                    System.out.println("geminis");
                }else{
                    System.out.println("cáncer");
                }

                break;

                case "julio":

                if (day<=22) {
                    System.out.println("cáncer");
                }else{
                    System.out.println("leo");
                }

                break;

                case "agosto":

                if (day<=22) {
                    System.out.println("leo");
                }else{
                    System.out.println("virgo");
                }

                break;

                case "septiembre":

                if (day<=22) {
                    System.out.println("virgo");
                }else{
                    System.out.println("libra");
                }

                break;

                case "octubre":

                if (day<=22) {
                    System.out.println("libra");
                }else{
                    System.out.println("escorpio");
                }

                break;

                case "noviembre":

                if (day<=21) {
                    System.out.println("escorpio");
                }else{
                    System.out.println("sagitario");
                }

                break;

                case "diciembre":

                if (day<=21) {
                    System.out.println("sagitario");
                }else{
                    System.out.println("capricornio");
                }

                break;

        
            default:
            System.out.println("Ingrese datos reales");
                break;
        }

        mesDia.close();

    }
    
}