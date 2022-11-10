import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	List<Employee> e=new ArrayList<Employee>();
	/*
	 * e.sort((e1,e2)->Employee.comparingCountry(e1, e2));
	 * e.sort(Employee::comparingCountry);
	 * 
	 * List<String> listCountries = Arrays.asList("France", "Germany", "Italy",
	 * "Egypt"); listCountries.sort((String stringArg1, String stringArg2) ->
	 * stringArg1.compareTo(stringArg2));
	 * listCountries.forEach(a->System.out.println(listCountries));
	 */
	
	e.add(new Employee(1,"gaurav", 25000, 5, "TA", "Male"));
	e.add(new Employee(2,"depthi", 27000, 6, "SE", "FeMale"));
	e.add(new Employee(3,"charan", 30000, 5, "TA", "Male"));
	e.add(new Employee(4,"gaurav2", 43000, 1, "DSE", "Male"));
	e.add(new Employee(5,"rama", 50000, 1, "SP", "Male"));
	e.add(new Employee(6,"deepa", 25000, 2, "TA", "FeMale"));
	//1)emplyee with TA role
	e.stream().filter(e1->e1.getRole().contains("TA")).forEach(e2->System.out.println(e2));
	//2)female employees
	long count=e.stream().filter(e3->e3.getGender().contains("FeMale")).count();
	System.out.println( " female employeees " + count);
	
	//3)male employees
		long count1=e.stream().filter(e4->!e4.getGender().contains("FeMale")).count();
		System.out.println( "male employees " + count1);
		 int no [] = {12, 21, 32, 45, 52, 63};
	        Arrays.stream(no)
	            .filter(n -> n%3 == 0)
	            .map(n -> ++n)
	            .filter(n -> n%8 == 0)
	            .forEach(System.out::println);
	
	
	}

}
