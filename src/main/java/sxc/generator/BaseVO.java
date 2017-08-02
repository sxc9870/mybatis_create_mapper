package sxc.generator;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.time.Clock;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BaseVO {
	public static class Car {
		public static Car create(final Supplier<Car> supplier) {
			return supplier.get();
		}

		public static void collide(final Car car) {
			System.out.println("Collided " + car.toString());
		}

		public void follow(final Car another) {
			System.out.println("Following the " + another.toString());
		}

		public void repair() {
			System.out.println("Repaired " + this.toString());
		}
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		final Car car = Car.create(Car::new);
		final List<Car> cars = Arrays.asList(car);
		cars.forEach(Car::collide);// 静态
		cars.forEach(Car::repair);// 成员不代参
		cars.forEach(car::follow);// 成员代参
		cars.forEach((e) -> {
			System.out.println(e.toString());
			;
		});
		Method method = BaseVO.class.getMethod("main", String[].class);
		for (final Parameter parameter : method.getParameters()) {
			System.out.println("Parameter: " + parameter.getName());
		}
		final Collection<Task> tasks = Arrays.asList(new Task(Status.OPEN, 5), new Task(Status.OPEN, 13),
				new Task(Status.CLOSED, 8));
		// 经常会有这个一个需求：我们需要按照某种准则来对集合中的元素进行分组。Stream也可以处理这样的需求，下面是一个例子：
		// Group tasks by their status
		final Map<Status, List<Task>> map = tasks.stream().collect(Collectors.groupingBy(Task::getStatus));
//		System.out.println(map);
//		final Collection< String > result = tasks
//			    .stream()                                        // Stream< String >
//			    .mapToInt( Task::getPoints )                     // IntStream
//			    .asLongStream()                                  // LongStream
//			    .mapToDouble( points -> points / totalPoints )   // DoubleStream
//			    .boxed()                                         // Stream< Double >
//			    .mapToLong( weigth -> ( long )( weigth * 100 ) ) // LongStream
//			    .mapToObj( percentage -> percentage + "%" )      // Stream< String> 
//			    .collect( Collectors.toList() );                 // List< String > 
//			         
//			System.out.println( result );
		// Get the system clock as UTC offset 
		final Clock clock = Clock.systemUTC();
		System.out.println( clock.instant() );
		System.out.println( clock.millis() );
	}

	private enum Status {
		OPEN, CLOSED
	};

	private static final class Task {
		private final Status status;
		private final Integer points;

		Task(final Status status, final Integer points) {
			this.status = status;
			this.points = points;
		}

		public Integer getPoints() {
			return points;
		}

		public Status getStatus() {
			return status;
		}

		@Override
		public String toString() {
			return String.format("[%s, %d]", status, points);
		}
	}
}
