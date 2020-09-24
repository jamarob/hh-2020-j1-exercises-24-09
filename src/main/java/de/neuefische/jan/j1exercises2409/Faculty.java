package de.neuefische.jan.j1exercises2409;

public class Faculty {

    public static int faculty(int number){
        int i = 0;
        int result = 1;
        while(i++ < number) {
            result *= i;
        }
        return result;
    }

}
