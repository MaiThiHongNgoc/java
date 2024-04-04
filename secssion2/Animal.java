package secssion2;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // phương thức abstract thể hiện tính trừu tượng
    //cho phep đc định nghĩa lại owr lipws con
    public abstract void talk();
}
