import java.util.Scanner;


public class Main {
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
            }
        }
        for (int i = 2; i < numero2; i++) {
            if (numero2 % i == 0) {
                isPrimo2 = false;
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


/*
        System.out.println("Serie de Fibonnacci \n Introduce un valor: ");
        int num = lectura.nextInt();
        int n1 = 0;
        int n2 = 1;
        int aux;
        System.out.println("Los numeros de fibonacci hasta "+num+" son: \n"+ n1 +"\n"+ n2);
        while (n1 < num){
            aux = n1;
            n1 = n2;
            n2 = n2+aux;
            if (n2 < num) System.out.println(n2);
        }
            
        }
*/
}
