package com.lezurex.railwatch;

import com.lezurex.railwatch.objects.Connection;
import com.lezurex.railwatch.objects.Section;
import com.lezurex.railwatch.objects.Stop;

import java.util.Scanner;

public class Menu {

    private Connection connection;
    private Stop stop;
    private Section section;
    private Scanner sc;

    public Menu(Scanner sc, Connection connection, Stop stop, Section section){
        this.sc = sc;
        this.connection = connection;
        this.stop = stop;
        this.section = section;
    }

    public void print() {

        System.out.println("------------------------------");
        System.out.println("----------Railwatch-----------");
        System.out.println("Type in the Departure Station: ");
        sc.nextLine();
        System.out.println("Type in the Station you're heading to: ");
        sc.nextLine();
        System.out.println("Type in the Time you want to depart: ");
        sc.nextLine();
        System.out.println("------------------------------");
        System.out.println("         Connections");
        System.out.println("------------------------------");
        System.out.println("Departure Time" + " ---- " + "Journey Length" + " ---- " + "Platform");
        System.out.println(section.getDeparture() + " ---- " + connection.getDuration() + " ---- " + stop.getPlatform());
        System.out.println("------------------------------");
    }
}
