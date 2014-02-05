package ec.com.webapplication.dao;

import java.util.List;
import ec.com.webapplication.model.Login;

public interface ILoginDAO {
    public Login getUserByUser(String user, String password);
    public List<Login> getUsers();
}