import java.util.Arrays;
import java.util.Map;
import java.util.stream.*;
//class Employee{
//    private int employeeID;
//    private String name;
//    private String address;
//
//    public Employee(int employeeID, String name,String address) {
//        this.employeeID = employeeID;
//        this.name = name;
//        this.address = address;
//    }
//    public int getEmployeeID() {return employeeID;}
//    public String getName() {return name;}
//    public String getAddress() {return address;}
//
//    @Override
//    public  String toString() {
//        return "Employee [ID = "+employeeID+ ", Name = "+name+ ", Address = " +address+"]";
//    }
//}
public class MappingData {
    public static Map toMap(Transaction transaction1, Transaction transaction2)
    {
        Map<Integer, Transaction> employeeMap = Arrays.asList(transaction1, transaction2).stream()
                .collect(Collectors.toMap(employee -> employee.getId(), employee -> employee));
        return employeeMap;
    }

    public static void main(String[] args) {
        Transaction transaction1 = new Transaction(1, "Diana", 1200000);
        Transaction transaction2 = new Transaction(2, "Octaviana", 122222);

        System.out.println(toMap(transaction1, transaction2));
    }
}
