package com.lezurex.railwatch;

import com.lezurex.railwatch.objects.Connection;
import com.lezurex.railwatch.objects.Section;
import com.lezurex.railwatch.objects.Stop;

public class Menu {

    Connection connection = new Connection();
    Stop stop = new Stop();
    Section section = new Section();

    public void print() {

        System.out.println("------------------------------");
        System.out.println("----------Railwatch-----------");
        System.out.println("Type in the Departure Station: ");
        System.out.println("Type in the Station you're heading to: ");
        System.out.println("Type in the Time you want to depart: ");
        System.out.println("------------------------------");
        System.out.println("Connections");
        System.out.println("------------------------------");
        System.out.println("Departure Time" + " ---- " + "Journey Length" + " ---- " + "Platform");
        System.out.println(section.getDeparture() + " ---- " + connection.getDuration() + " ---- " + stop.getPlatform());
        System.out.println("------------------------------");
    }
}
