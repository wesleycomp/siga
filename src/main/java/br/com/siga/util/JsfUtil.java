package br.com.siga.util;

import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

public class JsfUtil {

	public static void adicionarMensagem(String msg) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
	}
	
}
