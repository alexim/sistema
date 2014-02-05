package ec.com.webapplication.service;

import java.util.List;

import ec.com.webapplication.model.Login;

public interface ILoginService {
	/**
     * Get Usuario
     *
     * @param  int Usuario Id
     */
    public Login getByUser(String user, String password);
 
    /**
     * Get Usuario List
     *
     * @return List - Usuario list
     */
    public List<Login> getUsers();
}
