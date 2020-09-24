package de.neuefische.jan.j1exercises2409;

public class Faculty {

    public static int faculty(int number){
        int result = 1;
        for(int i=1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
