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
        var departure = sc.nextLine();
        System.out.println("Type in the Station you're heading to: ");
        var destination = sc.nextLine();
        System.out.println("Type in the Time you want to depart: ");
        var time = sc.nextLine();

        var request = new Request(departure, destination, time);
        var connections = request.send();

        System.out.println("------------------------------");
        System.out.println("         Connections");
        System.out.println("------------------------------");
        System.out.println("Departure Time" + " ---- " + "Journey Length" + " ---- " + "Platform");

        for (Connection connection : connections) {
            printConnection(connection);
            printSection(section);
            printStop(stop);
        }
    }

    public void printConnection(Connection connection) {
        System.out.print(connection.getDuration());
    }

    public void printSection(Section section){
        System.out.print(section.getDeparture());
    }

    public void printStop(Stop stop){
        System.out.print(stop.getPlatform());
    }
}
