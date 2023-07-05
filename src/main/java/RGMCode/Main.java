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

}