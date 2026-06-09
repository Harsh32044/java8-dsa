package main.java.dsaKunal.top150LC.randomQ;

import java.util.Arrays;

public class DailyTempQ739 {

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] answers = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int count = 0;
            for (int j = i+1; j < temperatures.length; j++) {
                if(temperatures[j] <= temperatures[i]) {
                    count+=1;
                }
                else if (temperatures[j] > temperatures[i]) {
                    break;
                }
            }
            if (count == temperatures.length - i - 1){
                answers[i] = 0;
            }
            else {
                answers[i] = ++count;
            }
        }

        return answers;


    }

    public static int[] dailyTemp2(int[] temperatures) {
        int[] answers = new int[temperatures.length];

        int i = 0, j = 1;

        while (j < temperatures.length) {
            int tempDiff = temperatures[j] - temperatures[i];

            if (tempDiff > 0) {
                answers[i] = j - i;
                i++;
                j = i+1;
            }
            else if (j == temperatures.length - 1){
                answers[i] = 0;
                i++;
                j = i+1;
            }
            else {
                j++;
            }


        }
        return answers;
    }

    public static void main(String[] args) {

        int[] temps = {55,38,53,81,61,93,97,32,43,78};

        System.out.println(Arrays.toString(dailyTemp2(temps)));
    }
}
