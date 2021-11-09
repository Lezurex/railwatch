package com.lezurex.railwatch;

import com.lezurex.railwatch.objects.Connection;
import com.lezurex.railwatch.objects.Section;
import com.lezurex.railwatch.objects.Stop;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu(sc, new Connection());
        menu.print();

    }
}
