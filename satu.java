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
public class satu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menentukan angka yang lebih besar");
                
        System.out.print("Angka ke-1 = ");
        int a = scanner.nextInt();
        
        System.out.print("Angka ke-2 = ");
        int b = scanner.nextInt();
        
       if(a>b){
           System.out.println("Angka yang paling besar ialah = "+a);
       }   
       else if(a<b){
           System.out.println("Angka yang paling besar ialah = "+b);
       }
       else if(a==b){
           System.out.println("Nilai dari dua angkka sama besar");
       
       }
       }
        
        
    }
    
