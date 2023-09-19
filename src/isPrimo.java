import java.util.Scanner;

public class isPrimo {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        //System.out.println("Hello world!");

        System.out.println("NUMEROS PRIMOS \n");
        System.out.println("Introduce el primer valor: ");
        int numero1 =  lectura.nextInt();
        System.out.println("Introduce el segundo valor: ");
        int numero2 =  lectura.nextInt();
        boolean isPrimo1 = true;
        boolean isPrimo2 = true;
        for (int i = 2; i < numero1; i++) {
            if (numero1 % i == 0) {
                isPrimo1 = false;
                break;
            }
        }
        for (int i = 2; i < numero2; i++) {
            if (numero2 % i == 0) {
                isPrimo2 = false;
                break;
            }
        }
        System.out.println(isPrimo1+"-"+numero1+ "---"+ isPrimo2+"-"+numero2);
        if (!isPrimo1 || !isPrimo2){
            System.out.println("Uno o más numeros de los introduccidos NO SON PRIMOS.");
        }else{
            int resultado = numero2+ numero1;
            System.out.println("La suma de estos dos numeros es "+resultado);
        }
    }

}
