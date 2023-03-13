import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        System.out.println("Este programa determina su digno zodiacal dependiendo el mes de su nacimiento");
        System.out.println("");

        String mes;
        Scanner months=new Scanner(System.in);

        String[] meses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        String[] signo={"capricornio","acuario","piscis","aries","tauro","geminis","cáncer","leo","virgo","libra","escorpio","sagitario"};

        System.out.print("Ingrese su mes de nacimiento: ");
        mes=months .nextLine();

        if (mes.equals(meses[0])) {
            System.out.println("Usted tiene el signo: " + (signo[0]));
            
        }else if (mes.equals(meses[1])) {
            System.out.println("Usted tiene el signo: " + (signo[1]));


        }else if(mes.equals(meses[2])){
            System.out.println("Usted tiene el signo: " + (signo[2]));
        }

        else if(mes.equals(meses[3])){
            System.out.println("Usted tiene el signo: " + (signo[3]));
        }

        else if(mes.equals(meses[4])){
            System.out.println("Usted tiene el signo: " + (signo[4]));
        }

        else if(mes.equals(meses[5])){
            System.out.println("Usted tiene el signo: " + (signo[5]));
        }

        else if(mes.equals(meses[6])){
            System.out.println("Usted tiene el signo: " + (signo[6]));
        }

        else if(mes.equals(meses[7])){
            System.out.println("Usted tiene el signo: " + (signo[7]));
        }

        else if(mes.equals(meses[8])){
            System.out.println("Usted tiene el signo: " + (signo[8]));
        }

        else if(mes.equals(meses[9])){
            System.out.println("Usted tiene el signo: " + (signo[9]));
        }

        else if(mes.equals(meses[10])){
            System.out.println("Usted tiene el signo: " + (signo[10]));
        }

        else if(mes.equals(meses[11])){
            System.out.println("Usted tiene el signo: " + (signo[11]));
        }
        
        else{
            System.out.println("Ingrese un mes");
        }

        months.close();
    
    }
}