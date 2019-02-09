package com.kodilla.stream.forum.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {

    China.getPeopleQuantity(){
        return new BigDecimal(5000000);
    }

    @Test
    public BigDecimal testGetPeopleQuantity(){
        //Given
        Set<Continent> ourWorld= new HashSet<Continent>();
        Continent Asia=new Continent();
        Continent Europe=new Continent();
        Continent NorthAmerica=new Continent();

        ourWorld.add(Asia);
        ourWorld.add(Europe);
        ourWorld.add(NorthAmerica);

        Country China=new Country();
        Country India=new Country();
        Country Poland=new Country();
        Country Italy=new Country();
        Country USA=new Country();
        Country Canada=new Country();

        Asia.add(China);
        Asia.add(India);
        Europe.add(Poland);
        Europe.add(Italy);
        NorthAmerica.add(USA);
        NorthAmerica.add(Canada);

        China.getPeopleQuantity(){
            return new BigDecimal("5000000");
        }
        India.getPeopleQuantity(){
            return new BigDecimal("7000000");
        }
        Poland.getPeopleQuantity(){
            return new BigDecimal("300000");
        }
        Italy.getPeopleQuantity(){
            return new BigDecimal("200000");
        }
        USA.getPeopleQuantity(){
            return new BigDecimal("6000000");
        }
        Canada.getPeopleQuantity(){
            return new BigDecimal("4500000");
        }

    }
}
