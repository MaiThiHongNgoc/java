package session8;

public interface LoginDAO {
    public String checkLoginStatement(Users user);
    public String checkLoginPreparedStatement(Users user);
}
