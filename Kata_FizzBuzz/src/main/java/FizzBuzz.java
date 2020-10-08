public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println(checkFizzBuzz(i));
        }
    }

    static String checkFizzBuzz (int value){
        boolean modFive = (value % 5) == 0;
        boolean modThree = (value % 3) == 0;
        if(modFive && modThree){
            return "FizzBuzz";
        }else if(modFive){
            return "Buzz";
        }else if (modThree){
            return "Fizz";
        }
        return ""+value;
    }
}
