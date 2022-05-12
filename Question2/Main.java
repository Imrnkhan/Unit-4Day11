package Question2;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Salary implements Comparator<Employee>
{
   
    public int compare(Employee e1, Employee e2)
    {
        return (int) (e1.getSalary()-e2.getSalary());
    }
}

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Employee> emObj = new TreeSet<Employee>(new Salary());
		
		System.out.println("Enter Detail of 4 Employees");
		
	
	
		emObj.add(new Employee(21542 ,"Imran", 12445));
		int j=1;
		
	   while(j<=4)
		  {
		
		System.out.println("Enter Details for Employee:"+j);
		System.out.println("------------------------");
		
		System.out.println("Enter Employee Id:");
		int emId = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee Salary:");
		int salary = Integer.parseInt(sc.nextLine());
		
		emObj.add(new Employee(emId, name, salary));
		
		
		System.out.println("Employee "+j+" Successfully added");
		
		j++;
		
	}
		
		System.out.println(emObj);
		
		int i=1;
		for(Employee x:emObj)
		{
			System.out.println("Detail for Employee:"+i++);
			System.out.println("Employee Id:"+x.getEmId());
			System.out.println("Employee Name:"+x.getEmpName());
		    System.out.println("Employee Salary"+x.getSalary());
		    System.out.println("--------------------------------");			
			}
		
		
		
		 
	}

}