package ec.com.webapplication.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ec.com.webapplication.dao.IClienteDAO;
import ec.com.webapplication.data.HibernateConnection;
import ec.com.webapplication.model.Clientes;

@Repository
public class ClienteDAO  extends HibernateConnection implements IClienteDAO{
	
	@Override
	public List<Clientes> getClientes() {
		////List list = getSessionFactory().getCurrentSession().createQuery("from Clientes").list();
		List list = getSessionFactory().getCurrentSession().createCriteria(Clientes.class).list();
		
		/*@SuppressWarnings("unchecked")
		List<Clientes> list = getSessionFactory().openSession()
								                 .createSQLQuery("PA_C_CLIENTES")
								                 .list();
		getSessionFactory().close();*/
		return list;
	}  
}
