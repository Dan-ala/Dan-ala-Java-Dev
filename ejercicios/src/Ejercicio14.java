import java.util.*;
public class Ejercicio14 {
    public static void main(String[] args) {
        int num;

        System.out.println("¿El estudiante hizo la tarea? (1 para si, y 2 para no)");
        Scanner evaluar=new Scanner(System.in);
        num=evaluar .nextInt();

        if (num==1) {

            System.out.println("Excelente");
            
        }else{
            System.out.println("Va perdiendo la materia");
        }
        evaluar.close();
    }
}
