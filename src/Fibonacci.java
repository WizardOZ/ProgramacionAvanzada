import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner lectura = new Scanner (System.in);

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

}
