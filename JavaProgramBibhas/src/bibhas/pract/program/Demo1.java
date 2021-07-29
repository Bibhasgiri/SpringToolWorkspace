package bibhas.pract.program;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Demo1 {

	public static <T> Stream<T> iteratorToSequentialStream(Iterator<T> itr) {
		Spliterator<T> spitr = Spliterators.spliteratorUnknownSize(itr, Spliterator.NONNULL);
		return StreamSupport.stream(spitr, false);
	}

	public static void main(String[] args) {
		Iterator<String> iterator = Arrays.asList("G", "E", "E", "K", "S").iterator();
		Stream<String> stream = iteratorToSequentialStream(iterator);
		System.out.println("Sequential Stream : " + stream.collect(Collectors.toList()));
	}

}
