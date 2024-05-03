package session8.controller;

import session8.model.LoginDaoImpl;
import session8.entity.Users;

public class LoginController {
    LoginDaoImpl loginDAO= new LoginDaoImpl() ;
    public String loginStatementController(Users user){
        return loginDAO.checkLoginStatement(user);
    }
    public String loginPreparedController(Users user){
        return loginDAO.checkLoginPreparedStatement(user);
    }

}
