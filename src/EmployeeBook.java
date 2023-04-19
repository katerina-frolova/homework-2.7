import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private Map<String, Employee> staff = new HashMap<>();

    public void addEmployee(Employee employee){
        staff.put(employee.getFullName(), employee);
    }
    public void removeEmployee(String fullName){
        staff.remove(fullName);
    }
    public Employee findEmployee(String fullName){
        return staff.get(fullName);
    }
    public void printStaff(){
        for (var e:staff.values()){
            System.out.println(e);
        }
    }
}
