import java.util.*;
public class Ejercicio31 {
    public static void main(String[] args) {
        System.out.println("Este programa pide el día de la semana (del 1-7), el mismo programa muestra el nombre de la semana");
        System.out.print("Digite del 1-7 el día de la semana: ");

         int dayWeek;

         Scanner dayOfTheWeek=new Scanner(System.in);
        dayWeek=dayOfTheWeek .nextInt();

         if (dayWeek==1) {
            System.out.println("Lunes");
         }else if (dayWeek==2) {
                System.out.println("Martes");
         }else if (dayWeek==3) {
                    System.out.println("Miércoles");
         }else if (dayWeek==4) {
                        System.out.println("Jueves");
         }else if (dayWeek==5) {
                            System.out.println("Viernes");
         }else if (dayWeek==6) {
                                System.out.println("Sábado");
         }else if (dayWeek==7) {
                                    System.out.println("Domingo");
                                }else{
                                    System.out.println("ERROR");
                                }
                                dayOfTheWeek.close();
    }
}
