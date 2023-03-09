package com.dataaccess;

import java.util.ArrayList;
import java.util.List;

import com.model.Vins;

public class ViDaoImpl implements ViDao {

	ArrayList<Vins> VinList;
		
	public ViDaoImpl() {
		VinList = new ArrayList<Vins>();
		
		VinList.add(new Vins("Don Simon","negre"));
		VinList.add(new Vins("Blanc de Blancs","blanc"));
		VinList.add(new Vins("Pago de los Capellanes","negre"));
		VinList.add(new Vins("Coto","negre"));
		VinList.add(new Vins("Vinya del Fadri","blanc"));
		VinList.add(new Vins("Gessami","blanc"));
		VinList.add(new Vins("Frizzante","rosat"));
		VinList.add(new Vins("Lambrusco","rosat"));
		VinList.add(new Vins("Marques de Caceres","rosat"));
		
		}
		
	@Override
	public ArrayList<Vins> getAllVins() {
		return VinList;
	}
	
	@Override
	public List<String> getVinsByTipus (String tipus) {
		
		List<String> marca = new ArrayList<String>();
		
		for (Vins v:VinList) {
			if (v.getTipus().equals(tipus)) {
				marca.add(v.getMarca());
			} 
		}
		return marca;
	}
	
    @Override
    public void saveVins(Vins vi) {
        VinList.add(vi);
    }

    @Override
    public void deleteBook(Vins vi) {
        VinList.remove(vi);
    }
	
	
}
