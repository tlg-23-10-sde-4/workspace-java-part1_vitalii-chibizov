// import java.lang.Math;
class Calculator {


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double devide(double a, double b) {
        return a / b;
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }

   public static int randomizer() {
        return randomizer (1, 19);
        /*
        public static int randomizer() {
            return this.randomizer (1, 19);
         */
//        // randomizer example
//        int max = 19;
//        int min = 1;
//
//        double randomNum = (Math.random() * max) + min;
//        return (int) randomNum;
    }

    public static int randomizer(int min, int max) {

        //double randomNum = (Math.random() * max) + min;
        double randomNum = (Math.random() * (max - min) +min);
        return (int) randomNum;
    }



        }
   // if (int value % 2 == 0){
    //    System.out.println("True");}