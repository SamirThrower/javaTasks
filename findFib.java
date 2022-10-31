package randomscrap;

public class findFib {

    public static void main(String[] args) {
        System.out.println(fibonnaci(11));  // returns 89
        System.out.println(fibonnaci(13));  // returns 233
    }

    public static int fibonnaci (int nthPlace) {
        if (nthPlace <= 1) return nthPlace;
        
        int nMinus1 = 0;
        int nMinus2 = 1;
        int sum = nMinus1 + nMinus2 ;

        while (nthPlace > 1) {
             sum = nMinus1 + nMinus2 ;
             nMinus1 = nMinus2 ;
             nMinus2 = sum;

             nthPlace-- ;
        }
        
        return sum;  
    }

}
