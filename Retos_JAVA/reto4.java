import java.util.*;

public class reto4 {
    public static void Main(String[] args)
    {
        int player=0;
        Scanner scaner = new Scanner(System.in);

        int maquina = (int)(Math.random()*3+1);
        System.out.println("Escoja \n1.Piedra\n2.Papel\n3.Tijera");
        player = scaner.nextInt();

        if(player ==1 && maquina == 3)
        {
            System.out.println("El jugador 1 ganó");
        }else if(player == 3 && maquina == 2)
        {
            System.out.println("El jugador 1 ganó");
        }else if(player == 2 && maquina == 1)
        {
            System.out.println("El jugador 1 ganó");
        }else if(maquina == 1 && player == 3)
        {
            System.out.println("La máquina ha ganado :(");
        }else if(maquina == 3 && player == 2)
        {
            System.out.println("La máquina ha ganado :(");
        }else if(maquina == 2 && player == 1)
        {
            System.out.println("La máquina ha ganado :(");
        }else if(player == 1 && maquina == 1)
        {
            System.out.println("Han quedado empatados :o");
        }else if(player == 2 && maquina == 2)
        {
            System.out.println("Han quedado empatados :o");
        }else if(player == 3 && maquina == 3)
        {
            System.out.println("Han quedado empatados :o");
        }
        else
        { 
            System.out.println("No se pudo hacer el juego :("); 
        }

        scaner.close();
    }
}
