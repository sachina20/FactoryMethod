package org.example;

public class FactoryMethod {
   // FactoryMethod Fm = new FactoryMethod();
    public Os getOs(String str){
        if(str.equals("Powerful"))return new Android();
        else if (str.equals("Secure")) return new IOS();
        else return new Window();
    }
}
