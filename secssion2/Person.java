package secssion2;

public class Person extends Animal {
    private  String age;
    private String gender;

    public Person(String name, String age, String gender) {
        super(name);
        this.age = age;
        this.gender=gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void talk() {
        System.out.println("Person talk!!!");
    }
}
