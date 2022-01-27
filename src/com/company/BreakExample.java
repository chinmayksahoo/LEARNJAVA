package com.company;
/**
 * Author : Chinmay Sahoo
 *
 * */
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);
        }

        //outer loop
        for  (int i = 1; i <= 3; i++){
            //inner loop
            for (int j = 1; j <= 3; j++){
                if (i == 2 && j == 2){
                    //using break statement inside the inner loop
                    break;
                }
                System.out.println(i + " " + j);
            }
        }

        aa:
            for (int i = 1; i <= 3; i++){
                bb:
                    for (int j = 1; j <= 3; j++){
                        if(i == 2 && j == 2){
                            //using break statement with label
                            break aa;
                        }
                        System.out.println(i + " " + j);
                    }
            }
    }
}
