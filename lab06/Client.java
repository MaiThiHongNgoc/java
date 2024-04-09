package lab06;

/**
 * write a description of class Client here
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client {
    /**
     * constructor for objects of class Client
     */
    public Client(){

    }
    public void doUnchecked(String value){
        //can phai check exception, neu khonf -->bug
        int result=canThrowUnCheckeException(value);
        System.out.println("result= "+result);
    }
    private int canThrowUnCheckeException(String value){
        return Integer.parseInt(value);
    }
    private void doChecked(){
        try {
            //buoc phai check exception o day! khong cach nao khac
            canThrowCheckeException();
            System.out.println("OK");
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    private int canThrowCheckeException() throws Exception{
        throw new Exception("Failure");
    }
}

//questions
//1.
/**
 * Phân biệt các ngoại lệ được kiểm tra và không được kiểm tra :
 *
 * Trong Clientlớp, canThrowUncheckedException()phương thức ném ra một NumberFormatException, đây là một ngoại lệ không được kiểm tra. Phương thức này không khai báo rằng nó đưa ra bất kỳ ngoại lệ nào và trình biên dịch không thực thi việc xử lý ngoại lệ này.
 * Mặt khác, canThrowCheckedException()phương thức ném ra một ngoại lệ đã được kiểm tra Exception. Nó tuyên bố rõ ràng rằng nó có thể ném ngoại lệ này bằng cách sử dụng throwstừ khóa trong chữ ký phương thức của nó. Bất kỳ mã nào gọi phương thức này đều phải xử lý ngoại lệ này hoặc khai báo rằng nó sẽ ném nó.
 */

//2.
/**
 * Sử dụng các ngoại lệ được kiểm tra và không được kiểm tra :
 *
 * Các ngoại lệ được kiểm tra thường được sử dụng cho các điều kiện đặc biệt mà một phương pháp có thể được mong đợi một cách hợp lý để phục hồi. Chúng thường được sử dụng cho các tình huống trong đó mã gọi có thể thực hiện một số hành động khắc phục.
 * Mặt khác, các trường hợp ngoại lệ không được kiểm tra thường được sử dụng cho các lỗi lập trình hoặc các tình trạng khác mà mã cuộc gọi thường không thể phục hồi. Chúng được sử dụng cho các tình huống trong đó mã gọi không thể xử lý ngoại lệ hoặc không hợp lý.
 */

//3.
/**
 * Tại sao không nên bắt (Ngoại lệ cũ)? :
 *
 * Việc bắt bừa Exceptionbãi thường không được khuyến khích vì nó bắt được tất cả các ngoại lệ, bao gồm cả ngoại lệ được kiểm tra và không được kiểm tra. Điều này có thể gây khó khăn cho việc chẩn đoán và xử lý các trường hợp ngoại lệ đúng cách.
 * Tốt hơn hết là bạn nên nắm bắt các ngoại lệ cụ thể hoặc ít nhất là nắm bắt được siêu lớp cụ thể nhất trong số các ngoại lệ mà bạn muốn xử lý. Điều này cho phép xử lý ngoại lệ được nhắm mục tiêu nhiều hơn và khả năng đọc mã tốt hơn.
 * Trong mã được cung cấp, phương thức bắt Exceptiontrong doChecked()sẽ bắt tất cả các ngoại lệ, có thể bao gồm cả ngoại lệ được kiểm tra và không được kiểm tra. Sẽ tốt hơn nếu bạn nắm bắt được loại ngoại lệ cụ thể hơn, chẳng hạn như IOExceptionor SQLException, nếu bạn biết ngoại lệ nào có thể được đưa ra và cách xử lý chúng một cách cụ thể.
 */
