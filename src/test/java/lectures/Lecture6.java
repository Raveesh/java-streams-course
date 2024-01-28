package lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.function.Predicate;
import org.junit.Test;

public class Lecture6 {

  final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer val = Arrays.stream(numbers).filter(n -> n < 10 && n > 5).findAny().orElse(-1);
    System.out.println("val = " + val);

  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer val = Arrays.stream(numbers).filter(n -> n < 10 && n > 5).findFirst().orElse(-1);
    System.out.println("val = " + val);

  }
}

