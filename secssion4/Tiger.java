package secssion4;

public class Tiger extends Animal implements CanEat,CanDrink,RepositorAction{
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void drink() {
        System.out.println("Tiger can drink...");
    }
    @Override
    public void eat() {
        System.out.println("Tiger can eat...");

    }

    @Override
    public void run() {
        //super.run();
        System.out.println("Tiger run");
    }

    @Override
    public void back() {
        //super.back();
        System.out.println("Tiger back");
    }

    @Override
    public void create() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void viewAll() {

    }

    @Override
    public void getDetaillById(int id) {

    }
}
