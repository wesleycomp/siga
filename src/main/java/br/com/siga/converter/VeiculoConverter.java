package br.com.siga.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.siga.dao.VeiculoDAO;
import br.com.siga.model.Veiculo;

@FacesConverter(forClass=Veiculo.class)
public class VeiculoConverter implements Converter{
	
	VeiculoDAO veiculoDAO = new VeiculoDAO(Veiculo.class);

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Veiculo veiculo = new Veiculo();
		if(value !=null)
			veiculo = veiculoDAO.buscaPorId(Long.parseLong(value));
		return veiculo;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if(value != null){
			Veiculo veiculo = (Veiculo)value;
			return veiculo.getId() == null ? null : veiculo.getId().toString();
		}
		return null;
	}

}
