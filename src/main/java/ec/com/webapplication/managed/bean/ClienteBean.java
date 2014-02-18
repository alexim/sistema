package ec.com.webapplication.managed.bean;

import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.Date;
import java.util.List;  

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import ec.com.webapplication.globals.VariablesGlobales.Estado;
import ec.com.webapplication.model.Clientes;
import ec.com.webapplication.service.IClienteService;

@ManagedBean(name="clienteBean")
@RequestScoped
public class ClienteBean implements Serializable {  

	private static final long serialVersionUID = 5412551322822502000L;
	private long idCliente;
	private String nombre;
	private String identificacion;
	private String direccion;
	private Date ingreso;
	private Estado estado;
	
	//Spring cliente Service es inyectado...
	@ManagedProperty(value="#{ClienteService}")
    IClienteService clienteService;
	List<Clientes> clientesList;

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getIngreso() {
		return ingreso;
	}

	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public IClienteService getClienteService() {
		return clienteService;
	}

	public void setClienteService(IClienteService clienteService) {
		this.clienteService = clienteService;
	}

	public List<Clientes> getClientesList() {
        return clientesList;
    }
	
	public void ejecutar(){
		clientesList = new ArrayList<Clientes>();
		clientesList.addAll(getClienteService().getClientes());
	}
} 