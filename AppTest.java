package com.sparta.RA.refactoring_unit_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("getGreeting, when given a time of 0, returns good evening")
    public void getGreeting_givenATimeOf0_ReturnsGoodEvening(){
        int time = 0;
        String expected = "Good evening!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given a time of 4, returns good evening")
    public void getGreeting_givenATimeOf4_ReturnsGoodEvening(){
        int time = 4;
        String expected = "Good evening!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given a time of 5, returns good morning")
    public void getGreeting_givenATimeOf5_ReturnsGoodMorning(){
        int time = 5;
        String expected = "Good morning!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given a time of 11, returns good morning")
    public void getGreeting_givenATimeOf11_ReturnsGoodMorning(){
        int time = 11;
        String expected = "Good morning!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given a time of 12, returns good afternoon")
    public void getGreeting_givenATimeOf12_ReturnsGoodAfternoon(){
        int time = 12;
        String expected = "Good afternoon!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given a time of 18, returns good afternoon")
    public void getGreeting_givenATimeOf18_ReturnsGoodAfternoon(){
        int time = 18;
        String expected = "Good afternoon!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given a time of 19, returns good evening")
    public void getGreeting_givenATimeOf19_ReturnsGoodEvening(){
        int time = 19;
        String expected = "Good evening!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given a time of 21, returns good evening")
    public void getGreeting_givenATimeOf21_ReturnsGoodEvening(){
        int time = 21;
        String expected = "Good evening!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }
}


// @ParameterizedTest
@DisplayName("getGreeing, when given a time from (5 to 11), returns good morning")
public void getGreeting_givenTimeBetween5and11_returnsGoodMorning(){

}
