package lectures;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture11 {

  @Test
  public void joiningStrings() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    StringBuilder builder = new StringBuilder();
    for (String name : names) {
      builder.append(name).append(",");
    }
    String val = builder.toString().substring(0, builder.toString().length()-1);
    System.out.println(val);

  }

  @Test
  public void joiningStringsWithStream() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");

    String collect = names.stream().collect(Collectors.joining(","));
    System.out.println(collect);
  }
}
