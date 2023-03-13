import java.util.Scanner;
public class Ejercicio6Switch {

    public static void main(String[] args) {
        String dia_semana;
        System.out.println("Ingrese por favor el día en minúscula");

        String dia;

        Scanner dieWoche=new Scanner(System.in);
        dia_semana=dieWoche .nextLine();

        switch (dia_semana) {
            case "lunes":

            dia="lunes";
            double transporte,snacks;
            Scanner variablenTrans=new Scanner(System.in);
            
            System.out.print("Ingrese lo que usted se gasta en el transporte el día lunes: ");
            transporte=variablenTrans .nextDouble();

            Scanner variablenSna=new Scanner(System.in);
            System.out.print("Ingrese lo que se gasta en algunos snacks el día lunes: ");
            snacks=variablenSna .nextDouble();

            double sumLun=transporte+snacks;

            System.out.print("EL DÍA LUNES GASTA: " + sumLun);

                
                break;

                case "martes":

                dia="martes";
                System.out.print("Ingrese lo que gasta en transporte del día martes: ");
                
                Scanner variablenTrans2=new Scanner(System.in);
                transporte=variablenTrans2 .nextDouble();

                Scanner variablenSna2=new Scanner(System.in);
                System.out.print("Ingrese lo que gasta en snacks los días martes: ");
                snacks=variablenSna2 .nextDouble();

                double sumMar=transporte+snacks;

                System.out.print("EL DÍA MARTES GASTA: " + sumMar);
                
                break;

                case "miercoles":

                dia="miercoles";
                System.out.print("Ingrese lo que gasta en transporte del día miércoles: ");
                
                Scanner variablenTrans3=new Scanner(System.in);
                transporte=variablenTrans3 .nextDouble();

                Scanner variablenSna3=new Scanner(System.in);
                System.out.print("Ingrese lo que gasta en snacks los días miércoles: ");
                snacks=variablenSna3 .nextDouble();

                double sumMie=transporte+snacks;

                System.out.print("EL DÍA MIÉRCOLES GASTA: " + sumMie);

                break;

                case "jueves":

                dia="jueves";
                System.out.print("Ingrese lo que gasta en transporte del día jueves: ");
                
                Scanner variablenTrans4=new Scanner(System.in);
                transporte=variablenTrans4 .nextDouble();

                Scanner variablenSna4=new Scanner(System.in);
                System.out.print("Ingrese lo que gasta en snacks los días miércoles: ");
                snacks=variablenSna4 .nextDouble();

                double sumJue=transporte+snacks;

                System.out.print("EL DÍA JUEVES GASTA: " + sumJue);

                break;

                case "viernes":

                dia="viernes";
                System.out.print("Ingrese lo que gasta en transporte del día viernes: ");
                
                Scanner variablenTrans5=new Scanner(System.in);
                transporte=variablenTrans5 .nextDouble();

                Scanner variablenSna5=new Scanner(System.in);
                System.out.print("Ingrese lo que gasta en snacks los días viernes: ");
                snacks=variablenSna5 .nextDouble();

                double sumVie=transporte+snacks;

                System.out.print("EL DÍA VIERNES GASTA: " + sumVie);

                break;

                case "sabado":

                dia="sabado";
                System.out.print("Ingrese lo que gasta en transporte del día sábado: ");

                Scanner variablenTrans6=new Scanner(System.in);
                transporte=variablenTrans6 .nextDouble();

                Scanner variablenSna6=new Scanner(System.in);
                System.out.print("Ingrese lo que gasta en snacks los días sábados: ");
                snacks=variablenSna6 .nextDouble();

                double sumSab=transporte+snacks;

                System.out.print("EL DÍA SÁBADO GASTA: "+ sumSab);

                break;

                case "domingo":

                dia="domingo";

                Scanner variablenSna7=new Scanner(System.in);
                System.out.print("Ingrese lo que gasta en snacks los días domingos: ");
                snacks=variablenSna7 .nextDouble();

                System.out.print("EL DÍA SÁBADO GASTA: "+ snacks);

                break;
        
            default:
                break;
        }
        dieWoche.close();
    }
}