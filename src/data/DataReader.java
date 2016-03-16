package data;

import java.util.Set;

public abstract class DataReader {
	String searchCiteria;
	SearchType searchType;

	public Set<Person> getPersons() {
		return null;
	}

	public void setSearchCiteria(String searchCiteria) {
		this.searchCiteria = searchCiteria;
	}

	public void setSearchType(SearchType searchType) {
		this.searchType = searchType;
	}
}
