import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        long contador = 0;
        while (contador<300000000) {
            contador++;
            if(contador%1000000 == 0){
                System.out.println(contador);
            }
        }
        lector.close();
    }
}
