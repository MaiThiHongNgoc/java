package session8;

public class LoginController {
    LoginDaoImpl loginDAO= new LoginDaoImpl() ;
    public String loginStatementController(Users user){
        return loginDAO.checkLoginStatement(user);
    }
    public String loginPreparedController(Users user){
        return loginDAO.checkLoginPreparedStatement(user);
    }

}
