package ec.com.webapplication.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ec.com.webapplication.dao.impl.ILoginDAO;
import ec.com.webapplication.model.Login;
import ec.com.webapplication.service.impl.ILoginService;

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
    public Login getByUser(String user) {
        return getLoginDAO().getUserByUser(user);
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
    public ILoginDAO getLoginDAO() {
        return loginDAO;
    }
    
    /**
     * Set Usuario DAO
     *
     * @param IUserDAO - Usuario DAO
     */
    public void setLoginDAO(ILoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }
}
