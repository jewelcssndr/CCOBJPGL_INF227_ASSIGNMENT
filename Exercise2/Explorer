package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Jupiter;
import Planets.Earth;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Jupiter jupiter);

    void visit(Earth earth);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
