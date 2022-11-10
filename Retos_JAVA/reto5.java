import java.util.*;

public class reto5 {
    public static void main(String[] args)
    {
        int n=0,num1,opUs,opMen = 0,opApu,apuesta;
        Scanner scaner = new Scanner(System.in);
        Random moneda = new Random();

        System.out.println("Bienvenido a la casa de apuestas");
        do {
            System.out.println("Ingrese el valor total que desea apostar");
            apuesta = scaner.nextInt();

            System.out.println("El valor de la apuesta es de " + apuesta);
            System.out.println("Si no está seguro de que quiere esta cantidad elija la opción 1\nO por el contrario elija la opción dos para continuar");
            opApu = scaner.nextInt();
        } while (opApu != 2);
            

        num1 = 1 + moneda.nextInt(2);
        do 
        {
            n=n+1;
            System.out.println("Elija 1 si quiere sello o 2 cara");
            opUs = scaner.nextInt();
            if(opUs == 1)
            {
                System.out.println("Usted a elejido sello");
            }else{
                System.out.println("Usted a elegido cara");
            }

            System.out.println("-----------------");
            System.out.println("resultado "+ num1);

            if(num1 == 1)
            {
                System.out.println(" sello");
            }else
            {
                System.out.println(" cara");
            }

            System.out.println("-----------------");
            if (num1 == opUs) 
            {
                System.out.println("Usted es afortunado y ha ganado el juego de la moneda");
                System.out.println("Por haber ganado se le suma la cantidad apostada a su saldo actual");
                apuesta = apuesta + apuesta;
            } else {
                System.out.println("Usted ha tenido un mal día para probar suerte y ha perdido :(");
                System.out.println("Por haber perdido se le descuenta todo lo que apostó de su saldo actual");
                apuesta = apuesta - apuesta;
            }

            System.out.println("-----------------");
            System.out.println("Su saldo actual en la casa de apuestas es de " + apuesta);

            if(apuesta<1)
            {
                System.exit(0);
            }else
            {
                System.out.println("-----------------");
                System.out.println("Para repetir el programa y poder seguir a postando le al azar seleccione 1 \nDe lo contrario seleccione la opción 2");
                opMen = scaner.nextInt();
            }

        } while (opMen!=2);
        System.out.println("-----------------");
        System.out.println("Usted a terminado con un saldo de "+ apuesta +" con un número de intentos de "+n);

        System.out.println("-----------------");
        System.out.println("Saliendo del programa\nGracias por jugar vuelva pronto :)");
        scaner.close();
    }
}
