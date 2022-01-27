package com.company;

public class LabeledForLoopEx {
    public static void main(String[] args) {
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
        /* Using no condition in for loop: Infinite Loop Ctrl+C to break out
        for(;;){
            System.out.println("infinitive loop");
        }
        */
    }
}
