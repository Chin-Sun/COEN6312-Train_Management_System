public class Employee {
    // Attributes
    private int employeeId;
    private String name;
    private String department;
    private String phone;
    private String shiftSchedule;

    // Constructor
    public Employee(int employeeId, String name, String department, String phone, String shiftSchedule) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.phone = phone;
        this.shiftSchedule = shiftSchedule;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShiftSchedule() {
        return shiftSchedule;
    }

    // Methods
    public void updateSchedule(String shiftDetails) {
        // Update the shift schedule with the new details
        this.shiftSchedule = shiftDetails;
        System.out.println("Shift schedule updated to: " + shiftDetails);
    }

    public void requestLeave(String leaveDetails) {
        // Handle the leave request
        System.out.println("Leave request for " + name + ": " + leaveDetails);
        // Logic to process the leave request would go here
    }

    // toString method for displaying employee information
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                ", shiftSchedule='" + shiftSchedule + '\'' +
                '}';
    }

    // Main method for demonstration purposes
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(1, "John Doe", "IT", "555-1234", "Day Shift");

        // Display employee details
        System.out.println(employee);

        // Update schedule
        employee.updateSchedule("Night Shift");

        // Request leave
        employee.requestLeave("Annual leave for two weeks");
    }
}
