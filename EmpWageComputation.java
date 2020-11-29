import java.util.HashMap;
import java.util.Random;

class EmpWageComputation
{

	public static void main(String args[]) 
	{
		HashMap<Integer, String>empDetails=new HashMap<Integer, String>();

		empDetails.put(123,"Smita");
		empDetails.put(124,"Raj");
		empDetails.put(125,"Abhishek");

		System.out.println(empDetails);
		System.out.println(empDetails.get(125));
		empDetails.remove(124);
		System.out.println(empDetails);
		empDetails.replace(125,"Vijaykumar");
		System.out.println(empDetails);

		HashMap<Integer, Employee> empMap=new HashMap<Integer, Employee>();
		Random random=new Random();
		for(int i=1;i<=5;i++)
		{
			int key=random.nextInt(100);
			empMap.put(key,new Employee(key,"vinit", 650000));
		}
		System.out.println(empMap);

	}
}
