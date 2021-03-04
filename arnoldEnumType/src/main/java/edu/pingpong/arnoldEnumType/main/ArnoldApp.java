package edu.pingpong.arnoldEnumType.main;

import edu.pingpong.arnoldEnumType.domain.*;

import java.util.*;

public class ArnoldApp {
    public static void main(String[] args) {

        reload();
    }

    public static void reload() {

        Scanner sc = new Scanner(System.in);

        boolean control = true;

        while (control) {

            System.out.println("Escribe tu peso en la tierra: ");

            Double peso = Double.parseDouble(sc.nextLine());

            for (Planeta planeta : Planeta.values()) {
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
            }

            System.out.println("\nYour weight only on the terrestrial planets: ");
            for (Planeta planeta : Planeta.getPlanetasTerrestres()) {
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
            }

            System.out.println("\nYour weight only on the gas giant planets: ");
            for (Planeta planeta : Planeta.getGigantesGaseosos()) {
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
            }

            System.out.println("Quieres escribir otro peso? (Y/N)");

            String again = sc.nextLine();

            if (again.equals("Y") || again.equals("y")) {
                clearScreen();
                
            } else {
                control = false;
            }
        }
    }
    public static void clearScreen() {
        System.out.flush();
    }
}