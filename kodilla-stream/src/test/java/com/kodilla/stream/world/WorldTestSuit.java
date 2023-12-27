package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.synth.ColorType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuit {

    @Test
    public void WorldTestSuit(){
        //Given
        Country poland = new Country("Poland", new BigDecimal("380000000"));
        Country german = new Country("German", new BigDecimal("830000000"));
        Country france = new Country("France ", new BigDecimal("410000000"));

        Country china = new Country("China" , new BigDecimal("140000000"));
        Country inda = new Country("Indie", new BigDecimal("486000000"));
        Country japan = new Country("Japan", new BigDecimal("41000000"));

        List<Country> europeanCountries  = new ArrayList<>();
        europeanCountries.add(poland);
        europeanCountries.add(german);
        europeanCountries.add(france);

        List<Country> asianCountries  = new ArrayList<>();
        europeanCountries.add(china);
        europeanCountries.add(inda);
        europeanCountries.add(japan);

        Continent europa = new Continent("Europa" ,europeanCountries);
        Continent asia = new Continent("Asia",asianCountries);

        List <Continent> continents =  new ArrayList<>();
        continents.add(europa);
        continents.add(asia);

        World world = new World(continents);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedSand = new BigDecimal("2287000000");
        assertEquals (expectedSand,result);




    }

}
