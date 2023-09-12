package com.driver;

public class Main {
public static class Product{
    public int product(int x, int y){
        return x*y;
    }
    public int product (int x , int y, int z){
        return x*y*z;
    }
    public double product(double x, double y){
        return x*y;
    }
}

    public static void main(String[] args) {
        Product p1=new Product();
        int ans=p1.product(20, 30);
        int ans2=p1.product(20, 30, 40);
        double ans3=p1.product(30.0, 20.0);
        System.out.println(ans+" "+ans2+" "+ans3);

    }
}