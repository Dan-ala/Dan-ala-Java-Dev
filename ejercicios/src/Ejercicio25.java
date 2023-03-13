import java.util.*;
public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.println("En este programa se determina el promedio la asignatura de física, si es = 3,5 se salva de reprobar, si es menor a 3,5 reprueba y si es mayor o igual que 4,5 aprueba ");
        float nota1, nota2, nota3;

        System.out.print("Ingrese la primer nota: ");
        Scanner notas=new Scanner(System.in);
        nota1=notas .nextFloat();

        System.out.print("Ingrese la segunda nota: ");
        nota2=notas .nextFloat();

        System.out.print("Ingrese la tercera nota: ");
        nota3=notas .nextFloat();

        float suma=nota1+nota2+nota3;
        float promedio=suma/3;

        if (promedio==35) {
            System.out.println("Se salva de reprobar");
        }else if(promedio<35){
            System.out.println("Reprueba");
        }else if(promedio>=45){
            System.out.println("Aprueba");
        }else{
            System.out.println("Reprueba");
        }
        notas.close();
    }
}