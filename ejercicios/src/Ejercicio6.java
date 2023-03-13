import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Se determinará el gasto semanal");

        double transporte,snacks,almuerzo,otros;

        //Día lunes

        System.out.println("Ingrese lo que gasta en transportes y snacks del día lunes");

        Scanner transLun=new Scanner(System.in);
        transporte=transLun .nextDouble();

        Scanner snacksLun=new Scanner(System.in);
        snacks=snacksLun .nextDouble();

        double sumLun=transporte+snacks;

        System.out.println("En total se gasta el día lunes: " + sumLun);

        //Día martes

        System.out.println("Ingrese lo que gasta en transportes y snacks del día martes:");

        Scanner trasnMar=new Scanner(System.in);
        transporte=trasnMar .nextDouble();

        Scanner snacksMar=new Scanner(System.in);
        snacks=snacksMar .nextDouble();

        double sumMar=transporte+snacks;

        System.out.println("En total se gasta el día martes: " + sumMar);

        //Día miércoles

        System.out.println("Ingrese lo que gasta en transportes, snacks y almuerzo del día miércoles:");

        Scanner transMie=new Scanner(System.in);
        transporte=transMie .nextDouble();

        Scanner snacksMie=new Scanner(System.in);
        snacks=snacksMie .nextDouble();

        Scanner almuMie=new Scanner(System.in);
        almuerzo=almuMie .nextDouble();

        double sumMie=transporte+snacks+almuerzo;

        System.out.println("En total se gasta el día miércoles: " + sumMie);

        //Día jueves

        System.out.println("Ingrese lo que gasta en transportes y snacks del día jueves:");

        Scanner trasnJue=new Scanner(System.in);
        transporte=trasnJue .nextDouble();

        Scanner snacksJue=new Scanner(System.in);
        snacks=snacksJue .nextDouble();

        double sumJue=transporte+snacks;

        System.out.println("En total se gasta el día jueves: " + sumJue);

        //Día viernes

        System.out.println("Ingrese lo que gasta en transportes y snacks del día viernes:");

        Scanner trasnVie=new Scanner(System.in);
        transporte=trasnVie .nextDouble();

        Scanner snacksVie=new Scanner(System.in);
        snacks=snacksVie .nextDouble();

        double sumVie=transporte+snacks;

        System.out.println("En total se gasta el día viernes: " + sumVie);

        //Día sábado

        System.out.println("Ingrese lo que gasta en transportes y snacks del día sábado:");

        Scanner transSab=new Scanner(System.in);
        transporte=transSab .nextDouble();

        Scanner snacksSab=new Scanner(System.in);
        snacks=snacksSab .nextDouble();

        double sumSab=transporte+snacks;

        System.out.println("En total se gasta el día sábado: " + sumSab);

        //Día domingo

        System.out.println("Ingrese lo que gasta en snacks y otras cosas del día domingo:");

        Scanner snacksDom=new Scanner(System.in);
        snacks=snacksDom .nextDouble();

        Scanner otrCosas=new Scanner(System.in);
        otros=otrCosas .nextDouble();

        double sumDom=snacks+otros;

        System.out.println("En total se gasta el día domingo: " + sumDom);

        //Vamos a ver el promedio de la semana

        double totalSum=sumLun+sumMar+sumMie+sumJue+sumVie+sumSab+sumDom;
        
        System.out.println("Lo que ha gastado: " + totalSum);

        if (totalSum==50000) {
            System.out.println("USted está gastando normal");
        }if (totalSum<50000) {
            System.out.println("Ahorra");
        }if (totalSum>50000) {
            System.out.println("Está malgastando");

        }
        
        transLun.close();
        trasnMar.close();
        transMie.close();
        trasnJue.close();
        trasnVie.close();
        transSab.close();

        snacksLun.close();
        snacksMar.close();
        snacksMie.close();
        snacksJue.close();
        snacksVie.close();
        snacksSab.close();
        snacksDom.close();

        almuMie.close();
        otrCosas.close();
    }

 }