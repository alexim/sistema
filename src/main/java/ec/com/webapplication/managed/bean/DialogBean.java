package ec.com.webapplication.managed.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

@ManagedBean(name="dialogBean")
public class DialogBean {  
    
    public void chooseCar(String page) {  
        RequestContext.getCurrentInstance().openDialog(page);  
    }  

    public void onCarChosen(SelectEvent event) {  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Selected", "Model:+  car.getModel()");  
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }  
}  