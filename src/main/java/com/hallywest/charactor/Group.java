package com.hallywest.charactor;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Charactor> charactors;
	
	public boolean hasAliveCharactor() {
		for (Charactor charactor : charactors) {
			if (charactor.isAlive()) {
				return true;
			}
		}
		return false;
	}
	
	public List<Charactor> getAliveCharactors() {
		List<Charactor> alives = new ArrayList<Charactor>();
		for (Charactor charactor : charactors) {
			if (charactor.isAlive()) {
				alives.add(charactor);
			}
		}
		return alives;
	}

	public List<Charactor> getCharactors() {
		return charactors;
	}

	public void setCharactors(List<Charactor> charactors) {
		this.charactors = charactors;
	}

}
