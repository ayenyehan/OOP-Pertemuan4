/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author LAB F
 */
public class Array1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] NMA = new String[5];
        
        
       NMA[0]="Ayen";
       NMA[1]="Aini";
       NMA[2]="Tea";
       NMA[3]="Lendri";
       NMA[4]="Naldi";
       

       
       Scanner inp = new Scanner(System.in);
       System.out.println("~~~~Input Data ke Array~~~~");
       for(int idx=0; idx<5; idx++) {
           System.out.printf("Data Nama Pengunjung ke-%d: ", idx+1);
           NMA[idx] = inp.nextLine();
           
       }
       System.out.println("~~~~Input Data ke Array~~~~");
       for(int idx=0; idx<5; idx++) {
           System.out.println("Data Nama Pengunjung ke-"+ (+idx+1)+": "+NMA[idx]);   
    }
       System.out.println("~~~~Input Data ke Array~~~~");
       int no=1;
       for(String isi : NMA){
           System.out.println(no+". "+isi);
           no++;
       }
    }           
}
