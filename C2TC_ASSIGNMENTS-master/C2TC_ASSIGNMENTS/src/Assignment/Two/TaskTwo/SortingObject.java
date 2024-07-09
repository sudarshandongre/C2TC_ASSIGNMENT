package Assignment.Two.TaskTwo;
import java.util.*;

class Employee implements Comparable<Employee> {
    String ename;
    int eid;
    String email;
    long phone;

    public Employee(String ename, int eid, String email, long phone) {
        this.ename = ename;
        this.eid = eid;
        this.email = email;
        this.phone = phone;
    }
    @Override
    public int compareTo(Employee otherEmployee) {
//    	Comparable interface:
//        return this.ename.compareTo(otherEmployee.ename);  // for name
        return this.email.compareTo(otherEmployee.email);        // for email
        
//        Comparator interface:
//        return this.eid - otherEmployee.eid;               // for eid
//        return (int) (this.phone - otherEmployee.phone);   // for phone
    }
}

public class SortingObject {
    public static void main(String[] args) {
        List<Employee> e = new ArrayList<>();
        e.add(new Employee("Soham", 36, "soham.in@gmail.com", 123456789));
        e.add(new Employee("Sam", 02, "sam@gmail.com", 678912455));
        e.add(new Employee("Riya", 28, "riya.in@gmail.com", 987654321));
        e.add(new Employee("Amit", 30, "amit.kumar@gmail.com", 1122334455));
        e.add(new Employee("Neha", 25, "neha.sharma@gmail.com", 988776655));
        e.add(new Employee("Vikas", 40, "vikas.verma@gmail.com", 566778899));
        e.add(new Employee("Priya", 35, "priya.mehta@gmail.com", 677889900));

        Collections.sort(e);

        for (Employee E : e) {
        	System.out.println(E.ename + " - Eid: " + E.eid  + ", Email: " + E.email + ", Phone: " + E.phone);

        }
    }
}
