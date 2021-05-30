package collection_util.sorting;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {

    static List<User> users = Arrays.asList(
            new User("C", 30, 1000),
            new User("D", 40, 12358),
            new User("A", 10, 456859),
            new User("B", 20, 458965),
            new User("E", 50, 7855896));

    public static void main(String[] args) {
        
        /*List<User> sortedList = users.stream()
			.sorted((o1, o2) -> o1.getAge() - o2.getAge())
			.collect(Collectors.toList());*/
			
        List<User> sortedList = users.stream()
			.sorted(Comparator.comparingInt(u -> u.getAge()))
			.collect(Collectors.toList());
 
        sortedList.forEach(System.out::println);
        
        System.out.println("\nsorted list of salary");
        users.stream()
        	.sorted(Comparator.<User>comparingDouble(user -> user.getSalary()))
        	.forEach(System.out::println);
        
        System.out.println("\nsorted list of name");
        users.stream()
        	.sorted(new Comparator<User>() {

				@Override
				public int compare(User o1, User o2) {
					return o1.getName().compareTo(o2.getName());
				}
			})
        	.forEach(System.out::println);

    }

    static class User {

        private String name;
        private int age;
        private float salary;

        public User(String name, int age, float salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		@Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age + '\'' +
                     ", salary=" + salary +
                    '}';
        }
    }
}