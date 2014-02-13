package ec.com.webapplication.managed.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import ec.com.webapplication.globals.VariablesGlobales.Estado;
import ec.com.webapplication.model.Login;
import ec.com.webapplication.service.ILoginService;

/**
 *
 * @author Alexi
 */
@ManagedBean(name="loginBean")
@ RequestScoped
public class LoginBean implements Serializable{  

    /**
	 * 
	 */
	private static final long serialVersionUID = -7883301876834795924L;
	
 	//Spring Login Service es inyectado...
	@ManagedProperty(value="#{LoginService}")
    ILoginService loginService;
	Login login;
    
    private String user;
	private String password;
	private Estado estado = Estado.ACTIVO;

    public String getUser() {  
        return user;  
    }  

    public void setUser(String user) {  
        this.user = user;  
    }  

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getPassword() {  
        return password;  
    }  

    public void setPassword(String password) {  
        this.password = password;  
    }  
    
    public ILoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}

	public Login getLogin() {
		login = new Login();
		login = getLoginService().getByUser(user, password);
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}  
	
	public void login() {  
        //RequestContext context = RequestContext.getCurrentInstance();  
        FacesMessage msg = null;  
        //boolean loggedIn = false;  

        try{
        	this.getLogin();
	      //  if (this.getUser().equals("ADMIN") && (this.getPassword() != null || !this.getPassword().equals(""))) {
        	if (login != null) {
	        	FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("USUARIO", user);
	            //loggedIn = true;  
	            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Inciando sesión", user);
	            FacesContext.getCurrentInstance().addMessage(null, msg);
	            FacesContext.getCurrentInstance().getExternalContext().redirect("pages/principal.jsf");
	        } else {  
	            //loggedIn = false;  
	            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al iniciar sesión", "Credenciales Incorrectas");
	            FacesContext.getCurrentInstance().addMessage(null, msg);
	        }  
	 
	        /*FacesContext.getCurrentInstance().addMessage(null, msg);
	        context.addCallbackParam("loggedIn", loggedIn);  */
        }catch(Exception e){
        	
        }
        
       
    }
}