import java.security.spec.NamedParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamDemo {

	@Test
	public void regular() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Pratham");
		names.add("Prashant");
		names.add("Prerit");
		names.add("Hardik");
		names.add("Dipak");
		names.add("Mihir");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("P")) {
				count++;
			}
		}
		System.out.println(count);

	}

	@Test
	public void streamExample() {
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Pratham");
		names.add("Prashant");
		names.add("Prerit");
		names.add("Hardik");
		names.add("Dipak");
		names.add("Mihir");
		//there is no life for intermediate operations if there are no terminal operations
		//These operations will execute only if inter operations (filter) returns true. 
		Long l = names.stream().filter(s->s.startsWith("P")).count();
		System.out.println(l);
		
		Long d = Stream.of("Pratham","Prashant","Prerit","Hardik","Dipak","Mihir").filter(s->
		{
			s.startsWith("H");
			return true;
		}).count();
		System.out.println(d);
		
//		names.stream().forEach(n-> System.out.println(n));
		
		names.stream().filter(m->m.length()>5).limit(1).forEach(m->System.out.println(m));

	}
	
	@Test
	public void tearmMap() {
		
		ArrayList<String> namess = new ArrayList<String>();
		namess.add("Santosh");
		namess.add("Abhijit");
		namess.add("Rakesh");
		namess.add("Kartik");
		namess.add("Samir");
		namess.add("Bhavin");
		
		List<String> name = Arrays.asList("Pratham","Prashant","Prerit","Hardik","Dipak","Mihir");
		name.stream().filter(s->s.startsWith("P")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		Stream<String> newStream = Stream.concat(namess.stream(), name.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean falg = newStream.allMatch(s->s.equalsIgnoreCase("Pratham"));
		Assert.assertTrue(falg);
		
		
	}
}
