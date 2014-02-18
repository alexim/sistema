package ec.com.webapplication.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ec.com.webapplication.dao.ILoginDAO;
import ec.com.webapplication.data.HibernateConnection;
import ec.com.webapplication.model.Login;

@Repository
public class LoginDAO extends HibernateConnection implements ILoginDAO{
	
    /**
     * Get Usuario
     *
     * @param  int Usuario Id
     * @return Usuario
     */
    @Override
    public Login getUserByUser(String user, String password) {
    	//List<Login> list = session.createCriteria(Login.class).list(); //Trae todos los registros de la tabla Login.
		List list = getSessionFactory().getCurrentSession()
									   .createQuery("from Login where Usuario=:user and Clave=:password")
					                   .setString("user", user)
					                   .setString("password", password)
					                   .list();
		if (list.isEmpty()){
			 return null;
		}else{
			 return (Login)list.get(0);
		}
    }
 
    /**
     * Get Usuario List
     *
     * @return List - Usuario list
     */
    @Override
    public List<Login> getUsers() {
        @SuppressWarnings("unchecked")
		List<Login> list = getSessionFactory().getCurrentSession().createQuery("from Login").list();
        return list;
    }
}
