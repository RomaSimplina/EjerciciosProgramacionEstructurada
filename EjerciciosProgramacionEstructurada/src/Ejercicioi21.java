import java.util.Scanner;
//Pendiente

public class Ejercicioi21 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        int año;
        do{
        System.out.println("Ingrese un año entre 1994-1999");
        año = lector.nextInt();
        }while(año>=1994 && año<=1999);

        if(año!=1996){
            System.out.println("---------------------------"+año+"---------------------------");
            System.out.println("                       CALENDARIO");
            System.out.println("Enero\t\t\tFebrero\t\t\tMarzo\t\t\tAbril\t\t\tMayo");
        
        }else{
    
        }

        lector.close();
    }
}
