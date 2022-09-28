package matriz1;

public class Matriz1 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int dato = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = dato;
                dato++;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("");
        }
        int diagonal1[] = new int[matriz.length];
        int diagonal2[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    diagonal1[i] = matriz[i][j];
                }
                if ((i + j) == matriz.length - 1) {
                    diagonal2[i] = matriz[i][j];
                }
            }
        }
        System.out.println("--------------------------------------------");
        int suma = 0;
        System.out.print("Diagonal 1 : ");
        for (int elemento : diagonal1) {
            System.out.print("\t" + elemento);
            suma += elemento;
        }
        System.out.println(" = " + suma);
        System.out.println(" ");
        suma = 0;
        System.out.print("Diagonal 2 : ");
        for (int elemento : diagonal2) {
            System.out.print("\t" + elemento);
            suma += elemento;
        }
        System.out.println(" = " + suma);
        System.out.println(" ");
    }
}
