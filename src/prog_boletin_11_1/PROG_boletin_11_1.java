package prog_boletin_11_1;

import java.util.Scanner;

public class PROG_boletin_11_1 {

    public static void main(String[] args) {
        int numcero = 0;
        int numposit = 0;
        int numnegat = 0;

        for (int i = 0; i < 10; i++) {
            Scanner scaner = new Scanner(System.in);
            System.out.println("Teclea un número: ");
            int num = scaner.nextInt();

            if (num == 0) {
                numcero = numcero + 1;
            } else if (num > 0) {
                numposit = numposit + 1;
            } else if (num < 0) {
                numnegat = numnegat + 1;
            }
        }

        System.out.println("Cantidad de números cero= " + numcero);
        System.out.println("Cantidad de números positivos= " + numposit);
        System.out.println("Cantidad de números negativos= " + numnegat);
    }

}
