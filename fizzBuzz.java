package randomscrap;

public class fizzBuzz {
    public static void main(String[] args) {
        System.out.println(FizzBuzz(1, 100));
    }

    public static String FizzBuzz(int startNum, int endNum) {
        
        String output = "";
        
        for (int i = startNum; i <= endNum; i++) {

            if ( i % 3 == 0) output += "Fizz" ;
            if ( i % 5 == 0) output += "Buzz" ;

            if (i % 3 != 0 && i % 5 != 0) output += i + "";

            output += "\n" ;
        }

        return output;
        
    }
    
}


