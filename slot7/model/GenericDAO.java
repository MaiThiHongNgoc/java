package slot7.model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface GenericDAO<T> {
    public String create(T entity) throws SQLException;
    public T getById(int id) throws SQLException;
    public ArrayList<T> getAll() throws SQLException;
    public void update(T entity) throws SQLException;
    public boolean delete(int id) throws SQLException;
}
