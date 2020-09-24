package de.neuefische.jan.j1exercises2409;

public class Faculty {

    public static int faculty(int number){
        if(number == 0){
            return 1;
        }
        return number * faculty(number-1);
    }

}
