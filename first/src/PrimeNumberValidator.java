import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Created by shailesh on 2/7/2016.
 * https://dzone.com/articles/whats-wrong-java-8-part-vii
 * http://www.deadcoderising.com/2015-05-19-java-8-replace-traditional-for-loops-with-intstreams/
 * http://howtodoinjava.com/java-8/how-to-use-predicate-in-java-8/
 */
public class PrimeNumberValidator {

    public static IntPredicate isPrime = n -> n< 4 || n %2 != 0 ||
            IntStream.range(4, (int) Math.sqrt(n))
                    .filter(x-> x%2!=0 && x%n !=0)
                    .anyMatch(x->true);


    public static void main(String args[]){

        System.out.println(isPrime.test(17));
    }
}
