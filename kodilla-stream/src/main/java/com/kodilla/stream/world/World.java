package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {

    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        return continents;
    }
    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPopulationQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
