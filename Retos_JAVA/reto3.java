import java.util.*;

public class reto3 {
    public static void main(String[] args)
    {
        int num1;
        Scanner scaner = new Scanner(System.in);
        num1 = (int)(Math.random()*2+1);

        System.out.println("Elija 1 si quiere sello o 2 cara");
        int opUs = scaner.nextInt();
        System.out.println("\nUsted elijió la opción "+ opUs);

        if(num1 == 1)
        {
            System.out.println("Ha salido 1. sello");
        }else
        {
            System.out.println("Ha salido 2. cara");
        }
        if(num1 == opUs){
            System.out.println("Usted a ganado felicidades");
        }else{
            System.out.println("No has tenido suerte perdiste :(");
        }

        scaner.close();
    }
}
