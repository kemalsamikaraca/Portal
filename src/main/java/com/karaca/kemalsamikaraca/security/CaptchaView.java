
package com.karaca.kemalsamikaraca.security;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * @author kemalsamikaraca
 */

@ManagedBean
public class CaptchaView {
    
    public void submit() {
        
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    }
    
    public void test(){
        System.out.println("Deneme 1");
        System.out.println("Deneme 2");
    }
}
