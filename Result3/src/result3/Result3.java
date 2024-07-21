/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package result3;
import java.util.Scanner;
public class Result3 {

    public static void main(String[] args) {
        System.out.println("Enter marks obtained by student");
         Scanner report =new Scanner(System.in);
      
         int x;
         x= report.nextInt();
         
         if (x>=80 && x<=100){
             System.out.println("level 7: outstanding achievement");
         }
           else if (x>=70 && x<=80){
             System.out.println("level 6: meritorious achievement");
    }
         if (x>=60 && x<=70){
             System.out.println("level 5: substantial achievement");
         }
         if (x>=50 && x<=60){
             System.out.println("level 4: adequate  achievement");
         }
         if (x>=40 && x<=50){
             System.out.println("level 3: moderate achievement");
         }
         if (x>=30 && x<=40){
             System.out.println("level 2: elementary achievement");
         }
         if (x>=0 && x<=30){
             System.out.println("level 1: not achieved");
         }
         else {
             System.out.println("Invalid Marks!!...");
         }
    }
   
}
         
