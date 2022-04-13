/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal;
import java.util.Scanner;
/**
 *
 * @author regina adristya
 */
public class dua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Menentukan Nilai Ganjil Atau Genap");
        
        System.out.print("Silahkan masukkan angka : ");
        int angka = scanner.nextInt();
        
        if(angka % 2 == 0){
            System.out.println("Nilai tersebut merupakan bilangan genap");
        }
        else {
            System.out.println("Nilai tersebut merupakan bilangan ganjil");
        }
    }
    
}
