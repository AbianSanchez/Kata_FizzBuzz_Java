public class FizzBuzz {
    public static void main(String[] args) {

    }

    static String checkFizzBuzz (int value){
        boolean modFive = false;
        boolean modThree = false;
        if ((value % 5) == 0){ modFive = true;}
        if ((value % 3) == 0){ modThree = true;}
        if(modFive){
            return "Buzz";
        } else if (modThree){
            return "Fizz";
        }
        return ""+value;
    }
}
