package session5;

public class AgeCheckingException extends Exception {
    // day la exception do nguoi dung tu dinh nghia

    public AgeCheckingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Loi nhap tuoi sai"+ super.getMessage();
    }
}
