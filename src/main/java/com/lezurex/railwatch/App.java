package com.lezurex.railwatch;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu(sc);
        menu.print();
    }
}
