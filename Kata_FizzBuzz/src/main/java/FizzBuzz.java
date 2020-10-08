public class FizzBuzz {
    public static void main(String[] args) {

    }

    static String checkFizzBuzz (int value){
        boolean modFive = false;
        if ((value % 5) == 0){ modFive = true;}
        if(modFive){
            return "Buzz";
        }
        return ""+value;
    }
}
