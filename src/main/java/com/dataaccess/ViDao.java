package com.dataaccess;

import java.util.ArrayList;
import java.util.List;

import com.model.Vins;

public interface ViDao {

	ArrayList<Vins> getAllVins();

	List<String> getVinsByTipus(String tipus);

	void deleteBook(Vins vi);

	void saveVins(Vins vi);

}
