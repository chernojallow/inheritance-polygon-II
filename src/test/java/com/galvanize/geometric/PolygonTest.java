package com.galvanize.geometric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PolygonTest {

    @Test
    void perimeterTest(){
        Polygon  polygon = new Polygon();
        int expected = polygon.perimeter();
        assertNotNull(expected);
      }
    @Test
    void areaTest(){
        int s [] = new int[20];
        Triangle  polygon = new Triangle(s);
        double expected = polygon.area();
        assertNotNull(expected);
    }

}
