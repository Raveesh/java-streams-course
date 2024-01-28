package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class Lecture1 {

  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    List<Person> ageMoreThan18List = new ArrayList<>();
    List<Person> finalList = new ArrayList<>();
    // 1. Find people aged less or equal 18
    // 2. Then change implementation to find first 10 people
    for (Person person : people) {
      if(person.getAge()<=18)
        ageMoreThan18List.add(person);
    }
    int count =0;
    for(Person person: ageMoreThan18List){
      if(count<=10){
        finalList.add(person);
        count = count++;
      }
    }
    System.out.println("finalList = " + finalList);

  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();

    List<Person> collect = people.stream().
            filter(person -> person.getAge() <= 18).
            limit(10).collect(Collectors.toList());
    System.out.println("collect = " + collect);
  }
}
