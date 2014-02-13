package ec.com.webapplication.managed.bean;

import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  
  


import javax.faces.bean.ManagedBean;

import ec.com.webapplication.model.Clientes;

@ManagedBean(name="clienteBean")
public class ClienteBean implements Serializable {  
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 5412551322822502000L;

	
  
    private List<Clientes> filteredCars;  
  
    private List<Clientes> clientes;  
  
    private Clientes selectedClientes;   
  
    public ClienteBean() {  
    	clientes = new ArrayList<Clientes>();  
          
     //   populateRandomCars(clientes, 50);  
    }  
    
    public Clientes getSelectedCar() {  
        return selectedClientes;  
    }  
    public void setSelectedCar(Clientes selectedClientes) {  
        this.selectedClientes = selectedClientes;  
    }  
    
    /*
    private void populateRandomCars(List<Clientes> list) {   
            list.add(new Clientes());  
    }  
  */
    
    public List<Clientes> getFilteredCars() {  
        return filteredCars;  
    }  
    public void setFilteredCars(List<Clientes> filteredCars) {  
        this.filteredCars = filteredCars;  
    }  
  
    public List<Clientes> getCars() {  
        return clientes;  
    }  
} 