package ec.com.webapplication.dao.impl;

import java.util.List;

import ec.com.webapplication.model.Login;

public interface ILoginDAO {
	
    public Login getUserByUser(String user);
    
    public List<Login> getUsers();
}
