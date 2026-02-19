package repository.helper.cerveja;

import java.util.List;

import com.algaworks.brewer.model.Cerveja;

import repository.filter.CervejaFilter;

public interface CervejasQueries {

	public List<Cerveja> filtrar(CervejaFilter filtro);
	
}
