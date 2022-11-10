import java.util.*;

public class reto6 {
    public static void main(String[] args) 
    {
        int opMen,prec1,prec2,prec3,prec4,resultado;
        String prod1,prod2,prod3,prod4;
        Scanner scaner = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda SENA");
        System.out.println("\nUsted tiene la posibilidad de comprar 4 productos en nuestra tienda");
        do 
        {
         
            System.out.println("Ingrese el nombre del producto: ");
            prod1 = scaner.next();
            System.out.println("Ingrese el precio del producto: ");
            prec1 = scaner.nextInt();
            System.out.println("Ingrese el nombre del producto: ");
            prod2 = scaner.next();
            System.out.println("Ingrese el precio del producto: ");
            prec2 = scaner.nextInt();
            System.out.println("Ingrese el nombre del producto: ");
            prod3 = scaner.next();
            System.out.println("Ingrese el precio del producto: ");
            prec3 = scaner.nextInt();
            System.out.println("Ingrese el nombre del producto: ");
            prod4 = scaner.next();
            System.out.println("Ingrese el precio del producto: ");
            prec4 = scaner.nextInt();

            resultado = prec1 + prec2 + prec3 + prec4;

            System.out.println("El valor de la compra es de "+ resultado);
            
            System.out.println("Si desea realizar otra compra seleccione la opción 1\n o por el contrario la opción 2 para salir del programa");
            opMen = scaner.nextInt();

            
        } while (opMen !=2);
        System.out.println("Gracias por su compra vuelva pronto");
        scaner.close();
    }
}
