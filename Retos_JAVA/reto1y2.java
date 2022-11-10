import java.util.*;

public class reto1y2 {
    public static void main(String[] args) throws Exception
    {
        int opc = 0;
        Scanner ingresoConsl = new Scanner(System.in);
        System.out.println("Bienvenido al programa");
        System.out.println("Ingrese la opción para saber el proceso que desea realizar");
        System.out.println("1. Conversor de temperatura" + "\n2. Dosis de vacunas" + "\n 3. Salir");

        opc = ingresoConsl.nextInt();

       switch(opc)
        {
            case 1:          
                System.out.println("Ingrese la temperatura que desea conocer");
                double temp = ingresoConsl.nextDouble();
                double centigrados = (temp - 32)/1.8;
                System.out.println("La temperatura en centígrados es " + centigrados);
            break;

            case 2:
                System.out.println("Ingrese los meses que tiene el bebé");
                int meses = ingresoConsl.nextInt();
                if(meses <= 12)
                {
                    System.out.println("Cuanto pesa el bebé");
                    int peso = ingresoConsl.nextInt();
                    int dosis = (peso + 10)/(meses * 10)*8;

                    System.out.println("la dósis que se debe aplicar es " + dosis);
                }
                else
                {
                    System.out.println("El bebé supera la edad de un año");
                }
            break;

            case 3:
                System.exit(0);
            break;

            default:
                System.out.println("Usted ingresó un valor no valido");
            break;
        }
        ingresoConsl.close();
    }
}
