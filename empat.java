/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal;

/**
 *
 * @author regina adristya
 */
public class empat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Menentukan angka ganjil atau genap dalam array");
        System.out.println("");
        System.out.println("Angka = [4,6,1,3,5]");
        
        int[] angka = {4,6,1,3,5};
        
        System.out.print("=> [");
        for(int a=0; a<5; a++){
            if(angka[a] %2 == 0){
                System.out.print("Genap,");
            }
            else{
                System.out.print("Ganjil,");
            }  
        }
        System.out.println("]");
                    
                    
            }
        }
  
