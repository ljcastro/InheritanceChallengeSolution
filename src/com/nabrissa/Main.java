package com.nabrissa;

public class Main {

    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);

        outlander.accelerate(20);
        System.out.println("----------------------------------------------");
        outlander.accelerate(30);
        System.out.println("----------------------------------------------");
        outlander.accelerate(-40);
        System.out.println("----------------------------------------------");
        outlander.steer(50);
        System.out.println("----------------------------------------------");
        outlander.steer(-50);
        System.out.println("----------------------------------------------");
        outlander.accelerate(30);
        System.out.println("----------------------------------------------");
        outlander.accelerate(40);

    }
}
