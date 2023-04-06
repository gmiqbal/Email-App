package org.example;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("GM Iqbal", "Mahmud");

//        em1.setAlternateEmail("gm11@gmail.com");
//        System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
    }
}