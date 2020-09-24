package de.neuefische.jan.j1exercises2409;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    public void notMoreThan30PeopleForThreatLevelYellow() {
        // Given
        int numberOfPeople = 31;
        String threatLevel = "yellow";

        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople, threatLevel);

        // Then
        assertEquals("Too many people", status);
    }

    @Test
    public void lessThan31PeopleIsOkayForThreatLevelYellow(){
        // Given
        int numberOfPeople = 30;
        String threatLevel = "yellow";

        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople, threatLevel);

        // Then
        assertEquals("Maximum number of people not exceeded", status);
    }

    @Test
    public void notMoreThan60PeopleForThreatLevelGreen() {
        // Given
        int numberOfPeople = 61;
        String threatLevel = "green";

        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople, threatLevel);

        // Then
        assertEquals("Too many people", status);
    }

    @Test
    public void lessThan31PeopleIsOkayForThreatLevelGreen(){
        // Given
        int numberOfPeople = 60;
        String threatLevel = "green";

        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople, threatLevel);

        // Then
        assertEquals("Maximum number of people not exceeded", status);
    }

    @Test
    public void lessThan31PeopleIsNotOkayForThreatLevelRed(){
        // Given
        int numberOfPeople = 30;
        String threatLevel = "red";

        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople, threatLevel);

        // Then
        assertEquals("Too many people", status);
    }

    @Test
    public void lessThan61PeopleIsNotOkayForThreatLevelRed(){
        // Given
        int numberOfPeople = 60;
        String threatLevel = "red";

        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople, threatLevel);

        // Then
        assertEquals("Too many people", status);
    }

    @Test
    public void only0PeopleIsOkayForThreatLevelRed(){
        // Given
        int numberOfPeople = 0;
        String threatLevel = "red";

        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople, threatLevel);

        // Then
        assertEquals("Maximum number of people not exceeded", status);
    }
}