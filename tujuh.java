/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal;

/**
 *
 * @author regina adristya
 */
public class tujuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        System.out.println("Menentukan nilai yang sama dalam array");
        int [] array = new int [] {1,7,3,4,9,9,5};
        
        System.out.print("Angka yang sama : ");
        
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
