package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project extends Common {
    private int code;
    private List<Employee> employees; // khai báo thuộc tính nhân viên trong dự án
    public Project() {
        this.employees = new ArrayList<>();
    }



    public Project(int id, String name, int code, List<Employee> employees) {
        super(id, name);
        this.code = code;
        this.employees = employees;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public List<Employee> getemployees(){
        return employees;
    }
    // chức năng thêm nhân viên vào dự án
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    // chức năng lấy ra số lượng nhân viên có trong dự án
    public int getEmployeecount(){
        return employees.size();
    }

    public Project input_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập id dự án: ");
        int id =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên dự án :");
        String name = sc.nextLine();
        System.out.println("Nhập code dự án:");
        int code = Integer.parseInt(sc.nextLine());
        return null;
    }

    public void Show_info(Project project){
        System.out.println("Mã dự án : "+ this.getId() + "Tên dự án : "+ this.getName()+"Code dự án : "+ this.getCode());
        System.out.println("Nhân viên dự án: ");
        for (Employee employee:
             project.getemployees()) {
            System.out.println("ID :" + employee.getId()+"name:"+ employee.getName()+"age"+employee.getAge()+"Possion"+employee.getPosition());
        }
    }
}
