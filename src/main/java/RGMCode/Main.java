package RGMCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //countTo100WithWhile();
        countTo100WithFor();
    }

    public static void countTo100WithWhile(){
        int aCount = 0;

        while (aCount < 100){
            aCount++;
            System.out.println("Anzahl der wiederholungen " + aCount);
        }
    }

    public static void countTo100WithFor(){
        for (int i = 0; i < 100; i++){
            System.out.println("Anzahl der wiederholungen " + i);
        }
    }

    /*public static int calcFakultaet(int zahl) {
        int faku = 1;
        for (int i = 1; i <= zahl; i++) {
            faku *= i;
        }
        return faku;
    }*/

    public static int calcFakultaet(int zahl) {
        int faku = 1;
        int i = 1;
        while (i <= zahl) {
            faku *= i;
            i++;
        }
        return faku;
    }

}