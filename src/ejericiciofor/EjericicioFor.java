/*
 *Factorial de un numero
 * 
 */
package ejericiciofor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjericicioFor {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un numero ");
        int n = Integer.parseInt(br.readLine());

        while (n < 0) {
            System.out.println("ERROR numero no valido");
            System.out.print("Escribe un numero");
            n = Integer.parseInt(br.readLine());
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("el factorial de " + n + " es " + factorial);
    }
}
