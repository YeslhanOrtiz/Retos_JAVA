import java.util.*;

public class reto8 {
    public static void main(String[] args) {
        int c = 0;
        int n = 0;
        int mTime=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de competidores que van a participar en la competencia");
        c = sc.nextInt();
        String[]competidor = new String[c];
        int[]tiempo = new int[c];
        System.out.println("Los competidores que participarán son "+ c);

        for(int i = 0; i<competidor.length; i++){
                n = n+1;
                System.out.println("Ingrese el nombre del competidor/a "+n);
                competidor[i]= sc.next();
                System.out.println("Ingrese el tiempo del competidor/a "+competidor[i]);
                tiempo[i]= sc.nextInt();
        }
        for(int i = 0; i<competidor.length; i++){
            System.out.println("El competidor/a "+competidor[i]+" hizo una marca de "+tiempo[i]);
            
        } 
        for (int x = 0; x < tiempo.length; x++) 
        { 
            if (mTime < tiempo[x]) 
            { 
                mTime = tiempo[x]; 
            }else{ 
                mTime = tiempo[x];            
                System.out.println("El ganador es el competidor con el tiempo "+mTime);            
            }
             
        } 
        sc.close();
    }
}
