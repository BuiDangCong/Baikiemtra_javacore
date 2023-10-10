package Model;

public class Common {
    private int id ; // khai báo thuộc tính mã .
    private String name; // Khai báo thuộc tính tên

    public Common() {
    }

    public Common(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
