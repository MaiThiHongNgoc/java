package lab06;

/**
 * write a description of class Client here
 * @author (your main)
 * @version (a version number or a date)
 */
public class MoreClass {
    public static void main(String[] args) {
        Object obj1 = new Object();
        System.out.println(obj1);

        Object obj2 = new Object(){
            public String toString(){
                return "this is obj2";
            }
        };
        System.out.println(obj2);
    }
}

/**
 * Tại sao System.out.println(obj1); có thể được hiển thị?"
 *
 * System.out.println(obj1)được hiển thị vì nó gọi toString()phương thức của Objectlớp, theo mặc định sẽ in tên lớp và mã băm của đối tượng.
 *
 *
 *
 *
 * Sự khác biệt giữa hai đối tượng obj1 và obj2 là gì?"
 *
 * obj1đề cập đến một phiên bản thông thường của Objectlớp, trong khi obj2đề cập đến một lớp con ẩn danh Objectnơi toString()phương thức được ghi đè để trả về một chuỗi tùy chỉnh. Vì vậy, sự khác biệt nằm ở hành vi của toString()các phương pháp của họ.
 */
