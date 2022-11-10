import java.util.*;

public class reto9 {
    public static void main(String[] args) {
        int c=0;

        Scanner sc = new Scanner(System.in);

        String[][]producto = new String[4][4];
        int[][]precio = new int[4][4];

        for(int fila=0;fila<4;fila++){
            for(int columna=0;columna<4;columna++){
                c=c+1;
                System.out.println("Ingrese el nombre del producto "+c);
                producto[fila][columna] = sc.next();
                System.out.println("Ingrese el precio de "+producto[fila][columna]);
                precio[fila][columna] = sc.nextInt();
            }
        }
        System.out.println("\n---------------------------------------\n");
        for(int fila=0;fila<4;fila++){
            for(int columna=0;columna<4;columna++){
                System.out.println("Posición "+fila+columna+"\t"+producto[fila][columna]+"\t"+precio[fila][columna]);
            }
        }

        sc.close();
    }
}
