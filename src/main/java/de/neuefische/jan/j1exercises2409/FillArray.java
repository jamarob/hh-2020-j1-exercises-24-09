package de.neuefische.jan.j1exercises2409;

public class FillArray {

    public static String[] getStudentNames(int size) {
        String[] strings = new String[size];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Student " + (i+1);
        }
        return strings;
    }

}
