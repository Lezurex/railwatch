package com.lezurex.railwatch;

import com.lezurex.railwatch.objects.Connection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner sc;

    public Menu(Scanner sc){
        this.sc = sc;
    }

    public void print() {

        System.out.println("------------------------------");
        System.out.println("----------Railwatch-----------");

        try {
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
            }

        }catch (InputMismatchException e){
            System.out.println("Wrong Character Input: " + e);
        }
    }

    public void printConnection(Connection connection) {
        System.out.print(connection.getFrom().getDeparture() + " ");
        System.out.print(connection.getDuration() + " ");
        System.out.println(connection.getFrom().getPlatform() + " ");
    }

}
