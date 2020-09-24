package de.neuefische.jan.j1exercises2409;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @ParameterizedTest(name = "Threat level: {0} and {1} customers gives {2}")
    @CsvSource({
            "red, 30, Too many people",
            "red, 60, Too many people",
            "red, 0, Maximum number of people not exceeded",
            "yellow, 30, Maximum number of people not exceeded",
            "yellow, 31, Too many people",
            "green, 60, Maximum number of people not exceeded",
            "green, 61, Too many people",

    })
    public void checkAllowedNumberOfPersons(String threatLevel, int numberOfPeople, String expected) {
        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople, threatLevel);

        // Then
        assertEquals(expected, status);
    }

}