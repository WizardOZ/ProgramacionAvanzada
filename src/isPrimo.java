import java.util.Scanner;

public class isPrimo {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        //System.out.println("Hello world!");

        System.out.println("NUMEROS PRIMOS \n");
        System.out.println("Introduce un valor entero: ");
        int numero1 =  lectura.nextInt();
        boolean isPrimo1 = true;
        for (int i = 2; i < numero1; i++) {
            if (numero1 % i == 0) {
                isPrimo1 = false;
                break;
            }
        }

        if (!isPrimo1){
            System.out.println("El número "+ numero1 +" NO ES PRIMO.");
        }else{
            System.out.println("El número "+ numero1 +" ES PRIMO");
        }
    }

}
