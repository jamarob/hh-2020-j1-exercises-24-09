package de.neuefische.jan.j1exercises2409;

public class Alarm {

    public static String getPeopleCapacityStatus(int numberOfPeople) {
        if (numberOfPeople > 30) {
            return "Too many people";
        }
        if(numberOfPeople == 30) {
           return "Limit of people reached";
        }
        return "Maximum number of people not exceeded";
    }

}
