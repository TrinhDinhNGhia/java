/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import static java.lang.Math.sqrt;

/**
 *
 * @author Nghia
 */
public class ptbh {

    private int a;

    /**
     * Get the value of a
     *
     * @return the value of a
     */
    public int getA() {
        return a;
    }

    /**
     * Set the value of a
     *
     * @param a new value of a
     */
    public void setA(int a) {
        this.a = a;
    }
    
    private int b;

    /**
     * Get the value of b
     *
     * @return the value of b
     */
    public int getB() {
        return b;
    }

    /**
     * Set the value of b
     *
     * @param b new value of b
     */
    public void setB(int b) {
        this.b = b;
    }
    
    private int c;

    /**
     * Get the value of c
     *
     * @return the value of c
     */
    public int getC() {
        return c;
    }

    /**
     * Set the value of c
     *
     * @param c new value of c
     */
    public void setC(int c) {
        this.c = c;
    }

    public ptbh() {
    }

    public ptbh(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
   
    public String toString(){
    return("Phương trình bậc là: " +this.getA() + "x2 +" +this.getB()+"X+ "+ this.getC()+" = 0");
   }
    public String GiaiPT(){
         if(a==0)
             if(b==0)
                 if(c==0)
                     return("Phương trình vô số nghiệm");
                 else
                     return("Phương trình có nghiệm");
            else
                 if(c==0)
                     return("Phương trình có nghiệm x= 0 ");
                 else
                     return("Phương trình có nghiệm là : " + (-this.getC())/this.getB());
        else
             if(b*b-4*a*c >0)
                 return("X1 = " + ((-this.getB())+ sqrt(this.getB()*this.getB()-4*this.getA()*this.getC()))/2*this.getA()
                         +" " +"X2 = " +((-this.getB())- sqrt(this.getB()*this.getB()-4*this.getA()*this.getC()))/2*this.getA()
                         );
             else if(b*b-4*a*c==0)
                 return ("Phương trình có nghiệm kép X1=X2= " +(-this.getB())/(2*this.getA()));
            else
                 return("Phương trình vô nghiệm ");
     }


    
}
