package java8.experiments.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {

    private static final List<Integer> listInt = Arrays.asList(1,2,3,5,7,9,11,13,15);

    //Create a set with all int > 2
    public Set<Integer> createSet(){
        return listInt.stream().filter (x -> x>2).collect(Collectors.toSet());
    }

    // Multiply all entries in set by 2
    public Set<Integer> updateSet(){
        return createSet().stream().map(x->x*2).collect(Collectors.toSet());
    }

    // Create map of entry and count
    public Map<Integer, Integer> getMap(){
        return listInt.stream().collect(Collectors.toMap(x->x, x->x));
    }

}
