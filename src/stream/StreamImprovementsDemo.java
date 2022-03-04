package stream;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamImprovementsDemo {
    public static void main(String[] args) {
        iterateOverloadedMethod();
        optionalOfStream();
        dropWhileStream();
        takeWhileStream();

    }

    private static void takeWhileStream() {
        List<Integer> list = Stream.of(2,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println("takeWhileStream");
        System.out.println("Stream takeWhile method takes each element that matches its predicate. It stops when it get unmatched element. " +
                "It returns a subset of elements that contains all matched elements, other part of stream is discarded.");
        System.out.println(list);
    }

    private static void dropWhileStream() {
        List<Integer> list = Stream.of(2,2,3,4,5,6,7,8,9).dropWhile(rec->rec%2==0).collect(Collectors.toList());
        System.out.println();
        System.out.println("dropWhileStream - Stream dropWhile method returns result on the basis of order of stream elements.");
        System.out.println("Ordered stream: It returns a stream that contains elements after dropping the elements that match the given predicate.\n" +
                "Unordered stream: It returns a stream that contains remaining elements of this stream after dropping a subset of elements that match the given predicate.");
        System.out.println(list);
    }

    private static void optionalOfStream() {
        Stream<Integer> s = Optional.of(1).stream();
        System.out.println();
        s.forEach(System.out::print);
    }

    private static void iterateOverloadedMethod() {
        IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::print);
    }
}
