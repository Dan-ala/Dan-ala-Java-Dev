import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        System.out.println("Este programa le pregunta al cliente de un supermercado cómo quiere cancelar sus productos");

        String nombreProductos="";
        int cantidadProductos;
        double precio;

        Scanner productos=new Scanner(System.in);

        System.out.println("Ingrese el nombre de los productos... ");
            System.out.println("");

            System.out.print("Ingrese el nombre del producto #1: ");
            nombreProductos=productos .next();
            System.out.print("Ingrese la cantidad del producto: ");
            cantidadProductos=productos .nextInt();
            System.out.println("Ingrese el precio de: " + nombreProductos  );
            precio=productos .nextDouble();

            //suma del producto #1
            double sumProd1=cantidadProductos*precio;
            System.out.println("La cantidad total más su precio es de:" + sumProd1);


            System.out.print("Ingrese el nombre del producto #2: ");
            nombreProductos=productos .next();
            System.out.print("Ingrese la cantidad del producto: ");
            cantidadProductos=productos .nextInt();
            System.out.println("Ingrese el precio de: " + nombreProductos  );
            precio=productos .nextDouble();

            //suma del producto #2
            double sumProd2=cantidadProductos*precio;
            System.out.println("La cantidad total más su precio es de:" + sumProd2);

            System.out.print("Ingrese el nombre del producto #3: ");
            nombreProductos=productos .next();
            System.out.print("Ingrese la cantidad del producto: ");
            cantidadProductos=productos .nextInt();
            System.out.println("Ingrese el precio de: " + nombreProductos  );
            precio=productos .nextDouble();

            //suma del producto #3
            double sumProd3=cantidadProductos*precio;
            System.out.println("La cantidad total más su precio es de: " + sumProd3);

            System.out.print("Ingrese el nombre del producto #4: ");
            nombreProductos=productos .next();
            System.out.print("Ingrese la cantidad del producto: ");
            cantidadProductos=productos .nextInt();
            System.out.println("Ingrese el precio de: " + nombreProductos  );
            precio=productos .nextDouble();

            //suma del producto #4
            double sumProd4=cantidadProductos*precio;
            System.out.println("La cantidad total más su precio es de: " + sumProd4);

            System.out.print("Ingrese el nombre del producto #5: ");
            nombreProductos=productos .next();
            System.out.print("Ingrese la cantidad del producto: ");
            cantidadProductos=productos .nextInt();
            System.out.println("Ingrese el precio de: " + nombreProductos  );
            precio=productos .nextDouble();

            //suma del producto #5
            double sumProd5=cantidadProductos*precio;
            System.out.println("La cantidad total más su precio es de: " + sumProd5);

            System.out.print("Ingrese el nombre del producto #6: ");
            nombreProductos=productos .next();
            System.out.print("Ingrese la cantidad del producto: ");
            cantidadProductos=productos .nextInt();
            System.out.println("Ingrese el precio de: " + nombreProductos  );
            precio=productos .nextDouble();

            //suma del producto #6
            double sumProd6=cantidadProductos*precio;
            System.out.println("La cantidad total más su precio es de: " + sumProd6);

            System.out.print("Ingrese el nombre del producto #7: ");
            nombreProductos=productos .next();
            System.out.print("Ingrese la cantidad del producto: ");
            cantidadProductos=productos .nextInt();
            System.out.println("Ingrese el precio de: " + nombreProductos  );
            precio=productos .nextDouble();

            //suma del producto #7
            double sumProd7=cantidadProductos*precio;
            System.out.println("La cantidad total más su precio es de: " + sumProd7);

            System.out.print("Ingrese el nombre del producto #8: ");
            nombreProductos=productos .next();
            System.out.print("Ingrese la cantidad del producto: ");
            cantidadProductos=productos .nextInt();
            System.out.println("Ingrese el precio de: " + nombreProductos  );
            precio=productos .nextDouble();

            //suma del producto #5
            double sumProd8=cantidadProductos*precio;
            System.out.println("La cantidad total más su precio es de: " + sumProd8);

            //ahora la app le muestra al cliente la cantidad total a pagar

            double totalSum=sumProd1+sumProd2+sumProd3+sumProd4+sumProd5+sumProd6+sumProd7+sumProd8;
            System.out.print("El total de su compra, tiene un valor de: " + totalSum);

            //ahora le pregunta al cliente como desea pagar el saldo

            int medioDePago,efectivo=1,tarjeta=2;
            System.out.println("Para poder realizar su pago, digite 1 si es en Efectivo, y 2 si es con Tarjeta");
            System.out.println("");
            System.out.print("Ingrese su medio de pago (1 Efectivo o 2 Tarjeta): ");
            medioDePago=productos .nextInt();

            if (medioDePago==1) {
                System.out.print("Usted pagará en Efectivo: " + totalSum);
            }else{
                System.out.print("Usted pagará con Tarjeta: " + totalSum);
            }

            productos.close();

    }
}
