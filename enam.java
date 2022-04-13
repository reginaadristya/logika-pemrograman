/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author regina adristya
 */
public class enam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan =  new Scanner(System.in);
        int k, index, arr[], i, nilai, l, result = 0;

        String desc = "TIDAK BISA";

        System.out.println("Menentukan Bilangan Maksimum Chapter 2 \n");

        System.out.print("Inputkan nilai k : ");
        k = scan.nextInt();

        System.out.print("Inputkan jumlah index : ");
        index = scan.nextInt();
        arr = new int[index];

        System.out.println("\nMasukkan " + index + " angka");
        for (i = 0; i < index; i++) {
            System.out.print("Elemen[" + (i) + "]             : ");
            arr[i] = scan.nextInt();
        }

        for (i=0; i<index; i++) {
            for (l=0; l<index; l++) {
                if (arr[i] != arr[l]) {
                    if (arr[i] + arr[l] == k) {
                        result++;
                    }
                }

            }
        }

        if (result > 0) {
            desc = "BISA";
        }

        String arrValue = Arrays.toString(arr);
        System.out.println("\nArray yang dimasukkan adalah " + arrValue);
        System.out.println("Apakah mungkin? " + desc);
        if (result > 0) {
            System.out.println("Jumlah kemungkinan " + result);
        }

    }

}
            

