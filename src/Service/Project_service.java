package Service;

import Model.Project;

import java.util.ArrayList;
import java.util.List;

public class Project_service {
    private List<Project> projects;
    public Project_service(){
        this.projects = new ArrayList<>();
    }
    // 1.Thêm dự án
    public void addProject(Project project){
        this.projects.add(project);
    }
    //2.Chỉnh sửa thông tin dự án
    public void updateProject(int new_id , String new_name,int code){
        for( Project project:
             projects) {
            if(project.getId() == new_id){
                project.setName(new_name);
            }
        }
    }
    // 3.Xoá thông tin dự án theo mã
    public void deleteProject(int id){
        this.projects.removeIf(project -> project.getId() == id); // hàm xoá phần tử khỏi 1 list theo điều kiện
    }
    //4.Hiển thị danh sách dự án
    public void Display_Project(){
        System.out.println("pro");
        for (Project project:
             projects) {
           project.Show_info(project);
        }
    }
}
