
package com.karaca.kemalsamikaraca.security;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * @author kemalsamikaraca
 */

@ManagedBean
public class CaptchaView implements Serializable{
    
    public void submit() {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Your message has been sent.", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
