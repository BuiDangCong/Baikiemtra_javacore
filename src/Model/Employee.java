package Model;

import java.util.Scanner;

public class Employee extends Common {
    private int age ; // khai báo thuôc tính tuổi nhân viên
    private String Position; // Khai báo thuộc tính chức vụ nhân viên


    public void name(String name) {
    }
    public Employee() {

    }
    
    public Employee(int id, String name, int age, String Position) {
        super(id, name);
        this.age = age;
        this.Position = Position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }
    public Employee input_Data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập thông tin nhân viên");
        System.out.println("Nhập mã nhân viên : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập tên nhân viên : ");
        String name =sc.nextLine();
        System.out.println("Mời nhập tuổi nhân viên :");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập chức vụ nhân viên");
        String Position = sc.nextLine();
        return null;
    }
    public void Show_info(){
        System.out.println("Mã nhân viên : "+ this.getId() + "Tên nhân viên : "+ this.getName()+"Tuổi nhân viên : "+ this.getAge()+"Chức vụ nhân viên : "+ this.getPosition());
    }

}
