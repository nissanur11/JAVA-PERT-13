/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan12;

public class Latihan12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // unary = operasi yang dilakukan pada satu variable

        // unary + dan -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);

        // unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++);
        System.out.printf("nilai hasil dari postfix menjadi = %d \n", b);

        // unary boolean dengan ! untuk negasi

        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);

    }
    
}
