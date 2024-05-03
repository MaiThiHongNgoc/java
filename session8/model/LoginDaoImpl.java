package session8.model;

import session8.entity.Users;
import session8.model.DBConnection;
import session8.model.LoginDAO;

import java.sql.*;

public class LoginDaoImpl implements LoginDAO {
    private static final Connection conn;

    static {
        try {
            conn =  DBConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private Statement stmt=null;
    private PreparedStatement pstm=null;

    @Override
    public String checkLoginStatement(Users user)  {
        String query="select username from users where username='"+user.getUsername()+"' and password ='"+user.getPassword()+"'";
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                System.out.println("username is: "+rs.getString("username"));
                return rs.getString("username");
            }
            return "Not in the database";
        }catch (SQLException ex){
            ex.printStackTrace();
            return "false";
        }
    }

    @Override
    public String checkLoginPreparedStatement(Users user) {
        String query = "select username from user where username like ? and password like ?";
        try {
            pstm = conn.prepareStatement(query);
            pstm.setString(1, user.getUsername());
            pstm.setString(2,user.getPassword());
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                System.out.println("username is: "+rs.getString("username"));
                return rs.getString("username");

            }
            return "Not in the database";


        }catch (SQLException ex){
            ex.printStackTrace();
            return "false";
        }

    }
}
