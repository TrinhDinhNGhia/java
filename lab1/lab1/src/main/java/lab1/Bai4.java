/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Nghia
 */
public class Bai4 {
    public  static void tinhTienDien(){
         float soDien;
        float tienDien;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        soDien =sc.nextFloat();
         if(soDien<=50){
             tienDien=soDien*5000;
             
         }else{
         tienDien=50*5000+(soDien-50)*1200;
               }
         System.out.printf("Tien dien :%f",tienDien);
    }
    public static void main(String[] args){
        tinhTienDien();
        tinhTienDien();
       
         
    }
    
}
