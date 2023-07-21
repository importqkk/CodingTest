package baekjoon.q10814;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Person[] person = new Person[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			person[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		br.close();
		
		Arrays.sort(person, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<person.length; i++) {
			sb.append(person[i]);
		}
		System.out.println(sb);
		
	}
	
	
	public static class Person {
		
		int age;
		String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
		
	}
	
}
