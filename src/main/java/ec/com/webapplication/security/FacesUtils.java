package ec.com.webapplication.security;

import javax.faces.context.FacesContext;

public class FacesUtils {
    public Object getSessionMapValue(FacesContext context, String key) {
        return context.getExternalContext().getSessionMap().get(key);
    }
    public void setSessionMapValue(FacesContext context, String key, Object value) {
        context.getExternalContext().getSessionMap().put(key, value);
    }
    public Object removeSessionMapValue(FacesContext context, String key) {
        return context.getExternalContext().getSessionMap().remove(key);
    }
}