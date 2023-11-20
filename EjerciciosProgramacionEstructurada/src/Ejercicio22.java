import java.util.Scanner;
import java.util.Random;
//Pendiente
public class Ejercicio22 {
    public static void main(String[] args){
    Scanner lector = new Scanner(System.in);
    Random random = new Random();

    int numeroAleatorio = random.nextInt(50);
    int numeroSeleccionado = 0;
    int intentos = 0;
    String jugarNuevamente=null; 
    
    System.out.println("Tiene 3 intentos disponibles\n");
    do{
        System.out.println("Intento "+(intentos+1));
        System.out.println("Adivine un número entre 1 y 50");
        numeroSeleccionado = lector.nextInt();
        if(numeroAleatorio>numeroSeleccionado){
            System.out.println("Demasiado bajo");
        }else if(numeroAleatorio<numeroSeleccionado){
            System.out.println("Demasiado alto");
        }else if(numeroAleatorio == numeroSeleccionado){
            System.out.println("¡Felicidades, adivinó el número!");
        }
        if(intentos>3){
            System.out.println("Lo siento mucho, has perdido");
        }
        intentos++;
    }while(intentos<3);



    do {
        do {
    System.out.println("\nDesea jugar nuevamente?");
    jugarNuevamente = lector.nextLine();
    } while ((jugarNuevamente == "Si" || jugarNuevamente == "si") || jugarNuevamente == "No" || jugarNuevamente == "no");
    if(jugarNuevamente == "No" || jugarNuevamente == "no"){
        return ;
    }
         System.out.println("Tiene 3 intentos disponibles\n");
    do{
        System.out.println("Intento "+intentos);
        System.out.println("Adivine un número entre 1 y 50");
        numeroSeleccionado = lector.nextInt();
        if(numeroAleatorio>numeroSeleccionado){
            System.out.println("Demasiado bajo");
        }else if(numeroAleatorio<numeroSeleccionado){
            System.out.println("Demasiado alto");
        }else if(numeroAleatorio == numeroSeleccionado){
            System.out.println("¡Felicidades, adivinó el número!");
        }
        if(intentos>3){
            System.out.println("Lo siento mucho, has perdido");
        }
        intentos++;
    }while(intentos<=3);

    } while (jugarNuevamente == "Si" || jugarNuevamente == "si");

    lector.close();
    
    }
}