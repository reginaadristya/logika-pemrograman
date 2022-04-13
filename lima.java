/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal;

/**
 *
 * @author regina adristya
 */
public class lima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Menentukan nilai maksimum dalam array");
        System.out.println("");
        System.out.println("Angka = [4,6,1,3,5]");
        
        int[] angka = {4,6,1,3,5};
        int k = angka.length;
        
        int maks = angka[0];
        
        for(int a=1; a<k; a++){
            if(angka[a] > maks){
                maks = angka[a];
            System.out.println("Nilai maksimum dalam array adalah "+maks);
            }
        }
    }
    
}
