import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Shailesh Meshram on 2/14/2016.
 */
public class TrailingZeros {
    /**
     * Given a number find the number of trailing zeroes in its factorial.

     Input Format

     A single integer - N

     Output Format

     Print a single integer which is the number of trailing zeroes.

     Input Constraints

     1 <= N <= 1000

     Problem Setter: Practo Tech Team
     SAMPLE INPUT

     10

     SAMPLE OUTPUT

     2

     Explanation

     10! = 3628800 has 2 zeros in the end.

     */
    /**
     * http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
     * http://minborgsjavapot.blogspot.in/2014/11/compute-factorials-using-java-8-streams.html
     */

    public OptionalInt getFactorial(int num){
        //List<Integer> temp = IntStream.rangeClosed(0, num).boxed().collect(Collectors.toList());
        //System.out.println("temp = " + temp);

         return IntStream.rangeClosed(1, num).reduce((a, b) -> a * b);


    }

    public int getTrailingZeroCount(OptionalInt num){
        int count = 0;
        for(int i=0; i<num.getAsInt(); i++){

            if(num.getAsInt()%10 == 0){
                num = OptionalInt.of(num.getAsInt()/10);
                count++;
            }
            else{
                break;
            }
        }



        return count;
    }


    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner reader = new Scanner(System.in);
        int givenNumber = reader.nextInt();
        TrailingZeros trailingZeros = new TrailingZeros();
        OptionalInt fact = trailingZeros.getFactorial(givenNumber);
        int res = trailingZeros.getTrailingZeroCount(fact);
        System.out.println("res = " + res);


    }
}
