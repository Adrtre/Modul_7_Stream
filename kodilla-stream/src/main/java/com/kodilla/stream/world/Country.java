package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String name;
    private final BigDecimal population;

    public Country(final String name, final BigDecimal population) {
        this.name = name;
        this.population = population;
    }

    public BigDecimal getPopulationQuantity(){
        return population;
    }
}
