import Model.Employee;
import Model.Project;
import Service.Employee_service;
import Service.Project_service;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // khởi tạo đối tượng dự án
        Project project = new Project();
        // khởi tạo đối tượng nhân viên
        Employee employee = new Employee();
        Employee_service employeeService = new Employee_service();
        Project_service projectService = new Project_service();
        Boolean flag = true;
            while (flag){
                System.out.println("Mời bạn chọn chức năng :");
                System.out.println("0.Thoát");
                System.out.println("----------------------------------");
                System.out.println("1.Thêm nhân viên.");
                System.out.println("2.Chỉnh sửa thông tin nhân viên.");
                System.out.println("3.Xoá nhân viên theo mã.");
                System.out.println("4.Hiển thị danh sách nhân viên.");
                System.out.println("----------------------------------");
                System.out.println("5.Thêm nhân viên vào dự án.");
                System.out.println("6.Thêm dự án.");
                System.out.println("7.Chỉnh sửa thông tin dự án.");
                System.out.println("8.Xoá dự án theo mã.");
                System.out.println("9.Hiển thị danh sách dự án.");
                System.out.println("10.Đưa số nhân viên theo tên hoặc code dự án");
                Scanner sc0 = new Scanner(System.in);
                Scanner sc1 = new Scanner(System.in);
                int select = sc0.nextInt();
                switch (select){
                    case 0 :
                        flag = false;
                        break;
                    case 1 :
                        employeeService.addEmployee(new Employee().input_Data());
                        break;
                    case 2 :
                        System.out.println("Nhập id vào để thay đổi thông tin nhân viên :");
                        int id = sc0.nextInt();
                        System.out.println("Nhập tên mới :");
                        String name = sc1.nextLine();
                        System.out.println("Nhập tuổi :");
                        int age = sc0.nextInt();
                        System.out.println("Nhập chức vụ mới :");
                        String possition = sc1.nextLine();
                        employeeService.upDateEmployee(id,name,age,possition);
                        break;
                    case 3 :
                        System.out.println("mời nhấn mã để xoá thông tin nhân viên :");
                        int id2 = Integer.parseInt(sc0.nextLine());
                        employeeService.deLeTe(id2);
                        break;
                    case 4 :
                         employeeService.Display_employees();
                        break;
                    case 5 :
                        project.addEmployee(employee.input_Data());
                        break;
                    case 6 :
                        projectService.addProject(new Project().input_data());
                        break;
                    case 7 :
                        System.out.println("Nhập id vào để thay đổi thông tin dự án :");
                        int id1 = sc0.nextInt();
                        System.out.println("Nhập tên mới :");
                        String name1 = sc1.nextLine();
                        System.out.println("Nhập code dự án :");
                        int code = sc0.nextInt();
                         projectService.updateProject(id1,name1,code);
                        break;
                    case 8 :
                        System.out.println("mời nhấn mã để xoá thông tin dự án :");
                        int id4 = Integer.parseInt(sc0.nextLine());
                        projectService.deleteProject(id4);
                        break;
                    case 9 :
                        projectService.Display_Project();
                        break;
                    case 10 :
                        System.out.println("nhập mã code dự án :");
                        int code4 = sc0.nextInt();
                        System.out.println("nhập tên dự án :");
                        String name4 = sc1.nextLine();
                        if(code4 == project.getCode()||project.getName().equals(name4) ){
                            System.out.println("số lượng nhân viên của dự án là :" + project.getEmployeecount());
                        }
                        break;
                }
            }
        }
    }
