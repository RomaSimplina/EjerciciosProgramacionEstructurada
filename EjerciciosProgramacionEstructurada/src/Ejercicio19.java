import java.util.Scanner;
//Pendiente(Cargos del dia anterior)
public class Ejercicio19 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        System.out.println("Cantidad de clientes");
        int cCLientes = lector.nextInt();
        int clientes[] = new int[cCLientes];
        double cuotaMin = 2.00;
        int horas = 0;
        double cuotaTotal = 0;

        for(int i = 0; i<clientes.length; i++){
            System.out.println("Cliente no."+(i+1)+"=");
            System.out.print("Horas: ");
            horas = lector.nextInt();
            if(horas<=3){
                System.out.println("Cargos por estacionamiento del cliente no."+(i+1)+" :C$"+cuotaMin);
            }else if(horas>3 && horas<=16){
                cuotaTotal = cuotaMin+horas*0.50;
                System.out.println("cargos por estacionamiento del cliente no."+(i+1)+" :C$"+cuotaTotal);
            }else if(horas>16 && horas<=24){
                System.out.println("Cargos por estacionamiento del cliente no."+(i+1)+" : C$10");
            }
        }
        lector.close();
    }
}
