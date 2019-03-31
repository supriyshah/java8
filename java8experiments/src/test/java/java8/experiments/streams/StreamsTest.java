package java8.experiments.streams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class StreamsTest {

    @Test
    public void StreamTest(){
        Streams streams = new Streams();
        streams.createSet().forEach(System.out::println);
        streams.updateSet().forEach(System.out::println);
        streams.getMap().forEach((k,v) -> System.out.println("Key:"+k+" Value:"+v));

    }
}
