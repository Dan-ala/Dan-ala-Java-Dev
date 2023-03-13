import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula el promedio de las notas ingresadas para obtener la nota final");

        System.out.print("Ingrese la cantidad de notas que desea calcular: ");

        int numNotas;
        Scanner grades=new Scanner(System.in);
        numNotas=grades .nextInt();

        int[] notas=new int[numNotas];
        int sumDeNotas=0;
        int div=numNotas;

    for(int i=0; i<numNotas; i++){
        System.out.print("Ingrese el valor de la nota: ");
        notas[i]=grades.nextInt();

        //ahora se hace el cálculo de las notas digitadas...

        sumDeNotas += notas[i];
        div=sumDeNotas/numNotas;
    }

    System.out.println("");
    System.out.println(sumDeNotas + " Es la suma total de las notas");System.out.println("");
    System.out.println(div + " Es la nota final ");System.out.println("");

    if (div<30) {
        System.out.println("Reporbaste :(");
        }else if (div==30||div==31||div==32||div==33||div==34||div==35||div==36||div==37||div==38||div==39||div==40) {
            System.out.println("Pasaste raspando...");
        }else if(div>40){
            System.out.println("Aprobaste con buenos resultados :) CONGRATS");
    }

    grades.close();
    }
}