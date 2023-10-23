//import static math.Calculator.*;

class CalculatorClient {

    public static void main(String[] args) {


        double sum = Calculator.add(3,5);
        System.out.println("The sum is " + sum);

        System.out.println("The difference is " + Calculator.subtract(3, 5));

        System.out.println("The multiplication result is " + Calculator.multiply(3,5));

        System.out.println("The devision result is " + Calculator.devide(3,5));

        System.out.println("10 is even? " + Calculator.isEven(10));

        System.out.println("The random number is " + Calculator.randomizer());


        int min =5, max = 5, result = 0;
        boolean itWorks = true;

        System.out.println();
        for(int i = 0; i < 1_000_000; i++){
            result = Calculator.randomizer(min,max);

            if (result < min || result > max) {
                itWorks = false;
                break;
            }
        }

        if(itWorks){
            System.out.println(" Congratulation! IT WORKS");
        }
        else {
            System.out.println("You gotta BUG!!!");
            System.out.println(" The value returned is: " + result);
        }


    }

}