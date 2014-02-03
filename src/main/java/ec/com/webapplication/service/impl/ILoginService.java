package ec.com.webapplication.service.impl;

import java.util.List;

import ec.com.webapplication.model.Login;

public interface ILoginService {
	/**
     * Get Usuario
     *
     * @param  int Usuario Id
     */
    public Login getByUser(String user);
 
    /**
     * Get Usuario List
     *
     * @return List - Usuario list
     */
    public List<Login> getUsers();
}
