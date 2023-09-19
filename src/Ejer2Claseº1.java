import java.util.Scanner;

public class Ejer2Claseº1 {
    //--------------------------------------------------------------------------------------APARTADO 1
        public static boolean IsInteger(String text) {
            int v;
            try {
                v = Integer.parseInt(text);
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }

        public static void main(String[] args) {
            Scanner texto = new Scanner (System.in);

            int[] valores = new int[50]; //¿Como crear array sin tamaño que no de error?
            int contador = 0;
            String num;
            boolean exit = false;
            do{
                System.out.println("Introduce un numero: ");
                num=texto.nextLine();
                if (IsInteger(num)) {
                    valores[contador]  = Integer.parseInt(num);
                    contador++;
                }else if (num.charAt(0) == 'x'){
                    exit = true;
                }
            } while(!exit);
            System.out.println("El array de valores es(usando un for): ");
            for (int i = 0; i < contador; i++) {
                System.out.print(valores[i]);
                if (i < contador-1) {
                    System.out.print(", ");
                }
            }
            System.out.println("\n----------------------------"); // ----------------------- APARTADO 2
            System.out.println("El array de valores es(usando un foreach): "); //Hacer que no aparezca la ultima coma
            int cont = 0;
            for (int aux:valores) {
                if (cont < contador) {
                    System.out.print(aux);
                    cont++;
                }
                if (cont < contador) {
                    System.out.print(", ");
                }
            }
            System.out.println("\n----------------------------");
        }

}
