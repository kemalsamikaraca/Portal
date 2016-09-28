
package com.karaca.kemalsamikaraca.internationalization;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 * @author kemalsamikaraca
 */
@ManagedBean(name = "language")
@SessionScoped
public class LanguageBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();

    /**
     * @return the locale
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * @param locale the locale to set
     */
    public void setLocale(Locale locale) {
        this.locale = locale;
    }
    
    public String getLanguage() {
        return locale.getLanguage();
    }
    
    public void changeLanguage(String language) {
        locale = new Locale(language);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }
    
}
