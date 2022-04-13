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
public class tiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan = new Scanner(System.in);
        
        int num,  sum;
        sum = 0;
      
        
        System.out.println("Menghitung Total Penjumlahan 1-N\n");
        
        System.out.print("Silahkan inputkan bilangan : " );
        num = scan.nextInt();
        
         for (int i=1; i<=num; i++){
            sum += i;
            if(i <num){
                System.out.print(i + " + ");
            }else if(i == num){
                System.out.print(i);
            }
         }
     
        System.out.println("\nTotal Penjumlahan = " + sum);
        
    }
    
}