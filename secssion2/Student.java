package secssion2;
//luôn viết hoa kí tự đầu tiên class
//luôn viết thường package
public class Student {
    //Field : trường : Property: thuộc tính: Attribute
    //để định nghĩa leen đối tượng và chứa giá trị
    //thường là private để đảm bảo an toàn dữ liệu
    //giad trị gán (write) thì sd là Setter
    //giá trị đọc thì sd getter
    private String name;
    private Integer bornYear;
    private  String placeOfBirth;


    //constructor: hàm khởi tạo
    //sử dụng để tạo ra đối tượng có các đặc tính ban đầu
    //có thể có đối số howacj k
    //tên trùng tên class và k có dữ liệu trả về

    public Student(String name, Integer bornYear, String placeOfBirth){
        //this là đối tượng hiện tại, sd trong chính class đó
        this.name = name;
        this.bornYear= bornYear;
        this.placeOfBirth=placeOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getBornYear() {
        return bornYear;
    }

    public void setBornYear(Integer bornYear) {
        this.bornYear = bornYear;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
