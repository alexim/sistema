package ec.com.webapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ec.com.webapplication.dao.ILoginDAO;
import ec.com.webapplication.model.Login;
import ec.com.webapplication.service.ILoginService;

@Transactional(readOnly = true)
public class LoginService implements ILoginService {
	
	// LoginDAO is injected...
	ILoginDAO loginDAO;

	 /**
     * Get Usuario
     *
     * @param  int Usuario Id
     */
    @Override
    public Login getByUser(String user, String password) {
        return getLoginDAO().getUserByUser(user, password);
    }
 
    /**
     * Get Usuario List
     *
     */
    @Override
    public List<Login> getUsers() {
        return getLoginDAO().getUsers();
    }
    
    /**
     * Get Usuario DAO
     *
     * @return IUserDAO - Usuario DAO
     */
    @Autowired
    public ILoginDAO getLoginDAO() {
        return loginDAO;
    }
    
    /**
     * Set Usuario DAO
     *
     * @param IUserDAO - Usuario DAO
     */
    @Autowired
    public void setLoginDAO(ILoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }
}
