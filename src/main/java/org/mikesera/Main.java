package org.mikesera;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[][] t = new char[3][3];
        tictac(t);
    }


    public static char generateRandom(char[] coordinates){
        Random random = new Random();

        int index = random.nextInt(coordinates.length);

        return  coordinates[index];
    }

    public static void tictac(char[][] t){
        char[] coordinates = {'x', 'o'};

       for(int i = 0; i < t.length; i++){
           for(int j = 0; j < t[i].length; j++){
               t[i][j] = generateRandom(coordinates);
           }

       }

        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }



    }

}