package edu.pingpong.arnoldEnumType.domain;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum Planeta {

    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private final double masa;
    private final double radio;
    private final static double G = 6.67300E-11;

    private Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    public double getMasa() {
        return this.masa;
    }

    public double getRadio() {
        return this.radio;
    }
    
    public double pesoSuperficie(double peso) {
        return tuMasa(peso) * gravedadSuperficie();
    }

    public double gravedadSuperficie() {
        return G * this.masa / (this.radio * this.radio);
    }

    public double tuMasa(double peso) {
        return peso / gravedadSuperficialTierra();
    }

    public double gravedadSuperficialTierra() {
        return (G * Planeta.EARTH.masa) / Math.pow(Planeta.EARTH.radio, 2);
    }

    public static List<Planeta> getPlanetasTerrestres() {
        List<Planeta> planteasTerrestres = new ArrayList<>();
        planteasTerrestres.add(MERCURY);
        planteasTerrestres.add(VENUS);
        planteasTerrestres.add(EARTH);
        planteasTerrestres.add(MARS);
        return planteasTerrestres;
    }
    
    public static List<Planeta> getGigantesGaseosos() {
        List<Planeta> gigantesGaseosos = new ArrayList<>();
        gigantesGaseosos.add(JUPITER);
        gigantesGaseosos.add(SATURN);
        gigantesGaseosos.add(URANUS);
        gigantesGaseosos.add(NEPTUNE);
        return gigantesGaseosos;
    }
}
