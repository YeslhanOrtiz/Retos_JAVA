import java.util.*;

public class reto7 {
    public static void main(String[] args) {

        double notafinal=0,snotas=0;
        int c=0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese la cantidad de notas que tiene el estudiante");
        int n = sc.nextInt();
        double calificaciones[] = new double[n];

        for(int i = 0; i<calificaciones.length; i ++){
            c = c+1;
            System.out.println("Ingrese la "+ c +" calificación");
            calificaciones[i] = sc.nextDouble();
            snotas=snotas+calificaciones[i];
        }
        System.out.println("Las notas del estudiante fueron");
        for(int x = 0; x<calificaciones.length; x++){
            System.out.println(calificaciones[x]);    
        }
        
        notafinal = snotas/calificaciones.length;
        System.out.println("El promedio del estudiante fué de " + notafinal);

        if(notafinal<3.0){
            System.out.println("no alcanzaste a pasar :(");
        }else if(notafinal==3.0 || notafinal<=4.0){
            System.out.println("Cási te quedas pasaste raspando");
        }else{
            System.out.println("Pasaste de sobra gj :)");
        }

        sc.close();
    }
}
