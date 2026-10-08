// 4. Create an infinite stream of multiples of 5. Display the stream elements after skipping
// first 3 and limit to 10 elements.

import java.util.stream.Stream;

class Question4 {
    public static void main(String args[]) {
        Stream<Integer> num = Stream.iterate(0, n -> n + 5)
                .skip(3)
                .limit(10);
        num.forEach(System.out::println);
    }
}