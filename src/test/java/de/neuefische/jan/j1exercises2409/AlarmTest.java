package de.neuefische.jan.j1exercises2409;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    public void notMoreThan30People() {
        // Given
        int numberOfPeople = 31;

        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople);

        // Then
        assertEquals("Too many people", status);
    }

    @Test
    public void thirtyPeopleIsTheLimit() {
        // Given
        int numberOfPeople = 30;

        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople);

        // Then
        assertEquals("Limit of people reached", status);
    }

    @Test
    public void lessThan30PeopleIsOkay(){
        // Given
        int numberOfPeople = 29;

        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople);

        // Then
        assertEquals("Maximum number of people not exceeded", status);
    }
}