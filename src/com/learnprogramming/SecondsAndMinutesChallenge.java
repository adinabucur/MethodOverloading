package com.learnprogramming;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));


        String secondResult = getDurationString(3945);
        System.out.println(secondResult);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid Value";
        } else if (seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;


        return hours + "h " + remainingMinutes + "m " +
                seconds + "s ";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Value.";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);

    }


}
