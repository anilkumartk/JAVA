package oops.polymorphism.method_overloading;

class Calc{
   public int add(int a,int b){
       return a+b;
   }
   public int add(int a,int b,int c){
       return a+b+c;
   }
   public double add(double a,double b){
       return a+b;
   }
}
public class Example1 {
    public static void main(String[] args){
        Calc calc=new Calc();
        System.out.println(calc.add(1,2));
        System.out.println(calc.add(1,2,3));
        System.out.println(calc.add(2.5,3.0));
    }
}