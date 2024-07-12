package org.example;
public class FactoryMain {
    public static void main(String[] args) {
           Os os1 = new Android();
           //os1.specs();
           FactoryMethod fm = new FactoryMethod();
           Os obj=fm.getOs("Secure");
           obj.specs();

    }
}