package lab17;

public class MVCPatternDemo {
    public static void main(String[] args){
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("Danil");
        controller.setEmployeeRate(19000);
        System.out.println("After updating: ");
        controller.updateView();
    }

    private static Employee retriveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("John");
        employee.setRate(100);
        employee.setHours(40);
        return employee;
    }

}
