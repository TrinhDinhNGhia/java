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
public class bai2 {
    public static void main(String[] args) {
int a,b,c,max,min;
Scanner sc = new Scanner(System.in); //Phím tắt CTRL + Space
System.out.println("Nhap so nguyen a:");
a = sc.nextInt();
System.out.println("Nhap so nguyen b:");
b = sc.nextInt();
        System.out.println("Nhap so nguyen c:");
        c =sc.nextInt();
        min=max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
System.out.println("Max la:"+max);
 if(b<min){
 min=b;
         }
 if(c<min){
 min=c;
 }

System.out.println("Min la:"+min);
}
    
}
