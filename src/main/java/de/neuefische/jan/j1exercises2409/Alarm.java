package de.neuefische.jan.j1exercises2409;

public class Alarm {

    public static String getPeopleCapacityStatus(int numberOfPeople, String threatLevel) {
        int limit = 0;
        switch(threatLevel) {
            case "red":
                limit = 0;
                break;
            case "yellow":
                limit = 30;
                break;
            case "green":
                limit = 60;
                break;
        }
        if (numberOfPeople <= limit) {
            return "Maximum number of people not exceeded";
        }
        return "Too many people";
    }

}
