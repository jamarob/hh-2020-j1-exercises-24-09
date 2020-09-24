package de.neuefische.jan.j1exercises2409;

public class Alarm {

    public static String getPeopleCapacityStatus(int numberOfPeople, String threatLevel) {
        int limit = getMaximumNumberOfPeople(threatLevel);
        if (numberOfPeople <= limit) {
            return "Maximum number of people not exceeded";
        }
        return "Too many people";
    }

    public static int getMaximumNumberOfPeople(String threatLevel){
        switch(threatLevel) {
            case "red":
                return 0;
            case "yellow":
                return 30;
            case "green":
                return 60;
            default:
                return 0;
        }
    }
}
