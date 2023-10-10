package Service;

import Model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Employee_service {
    private List<Employee> employees;

    public Employee_service() {
        this.employees = new ArrayList<>();
    }

    // 1. Chức năng thêm nhân viên
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
     // 2 .Chức năng chỉnh sửa thông tin nhân viên.
    public void upDateEmployee(int new_id , String new_name ,int new_age,String new_Position) {
        for (Employee employee:
             employees)
            if (employee.getId() == new_id) {
                employee.setName(new_name);
                employee.setAge(new_age);
                employee.getPosition();
                break;
            }
    }
    // 3.Chức năng xoá thông tin nhân viên theo mã
    public void deLeTe(int id) {
         this.employees.removeIf(employee -> employee.getId()==id); // hàm xoá phần tử khỏi 1 list theo điều kiện
    }
    //4. Hiển thị danh sách nhân viên
     public void Display_employees(){
         for (Employee employee:
              employees) {
             employee.Show_info();
         }
     }

}
