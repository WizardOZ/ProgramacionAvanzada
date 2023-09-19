import java.util.Scanner;

public class NumArray {


    public static boolean IsInteger(String text) {
        double v;
        try {
            v = Double.parseDouble(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner texto = new Scanner (System.in);

        double[] valores = new double[50]; //¿Como crear array sin tamaño que no de error?
        int contador = 0;
        String num;
        boolean exit = false;
        do{
            System.out.println("Introduce un numero: ");
            num=texto.nextLine();
            if (IsInteger(num) && Double.parseDouble(num) >= 0) {
                valores[contador]  = Double.parseDouble(num);
                contador++;
                }else {
                    exit = true;
                }
            } while(!exit);
        System.out.println("El array de valores es: ");
        double suma = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println(valores[i]);
            suma += valores[i];
        }
        System.out.println("La suma resultante del array es: " + suma);
    }
}

