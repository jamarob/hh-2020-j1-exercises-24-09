package de.neuefische.jan.j1exercises2409;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FillArrayTest {

    @Test
    void testGetStudents() {
        // Given
        int numberOfStudents = 3;
        String[] expected = {"Student 1", "Student 2", "Student 3"};

        // When
        String[] actual = FillArray.getStudentNames(numberOfStudents);

        // Then
        assertArrayEquals(expected, actual);
    }
}