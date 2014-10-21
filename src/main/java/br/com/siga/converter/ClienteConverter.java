package br.com.siga.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.siga.dao.ClienteDAO;
import br.com.siga.model.Cliente;

@FacesConverter(forClass=Cliente.class)
public class ClienteConverter implements Converter{
	
	ClienteDAO clienteDAO = new ClienteDAO(Cliente.class);

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Cliente cliente = new Cliente();
		if(value !=null)
			cliente = clienteDAO.buscaPorId(Long.parseLong(value));
		return cliente;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if(value != null){
			Cliente cliente = (Cliente)value;
			return cliente.getId() == null ? null : cliente.getId().toString();
		}
		return null;
	}

}
