/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan18;

import java.util.Scanner;

public class Latihan18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // kesimpulannya adalah
        // perkalian atau pembagian akan dilakukan terlebih
        // dahulu

        // jika dilakukan perkalian dan pembagian, maka
        // akan dilakukan operasinya dari kiri ke kanan

        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompokan operasi dengan ( )
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUDRAT");
        int m,x,c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;

        System.out.println("nilai y = " + y);
    }
    
}
