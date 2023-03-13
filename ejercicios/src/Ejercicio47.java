import java.util.*;
public class Ejercicio47 {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a nuestra tienda!");
        String respuAfirma="Yes";
        int totalCompra1=0,paga;
        int cantidad;

        System.out.println("¿Desea comprar algún artículo? (Sí es así, escriba Yes, sino No)");
        Scanner aboutMyStore=new Scanner(System.in);
        respuAfirma=aboutMyStore .next();

        

        while (respuAfirma.equals("Yes")) {
            
            System.out.print("Digite la cantidad de los artículos que va a comprar: ");
            cantidad=aboutMyStore .nextInt();

            String[] clothes=new String[cantidad];
            int[] pricesOfClothes=new int[cantidad];

                for(int i=0;i<cantidad;i++){

                        System.out.print("¿Qué artículo desea comprar?, Ingrese el nombre: ");
                        clothes[i]=aboutMyStore .next();
                            System.out.print("Por favor digite el precio de " + clothes[i] + ": ");
                            pricesOfClothes[i]=aboutMyStore .nextInt();

                            totalCompra1=totalCompra1+pricesOfClothes[i];

                        }

                        System.out.println("¿Desea comprar algo más? (Sí es así, escriba Yes, sino No)");
                        respuAfirma=aboutMyStore .next();

                        System.out.println("La compra tiene un total de: " + totalCompra1);

                    
             

                            System.out.print("¿Con cuánto paga?, ingrese la cantidad con la que paga: ");
                            paga=aboutMyStore .nextInt();

                            if (paga==totalCompra1) {
                                System.out.println("No hay cambio");
                            } else if(paga>totalCompra1){

                                long cambio=paga-totalCompra1;
                                System.out.println("Su cambio es de: " + cambio);
                            }else{
                                long noAlcanza=totalCompra1-paga;
                                System.out.println("No le alacanza, le hace falta un valor de: " + noAlcanza);
                            } 

                    }       System.out.println("La compra fue de: " + totalCompra1);
                            System.out.println("Gracias por visitarnos");

                            aboutMyStore.close();
          }
}