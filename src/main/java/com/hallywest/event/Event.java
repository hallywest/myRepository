package com.hallywest.event;

import java.util.List;

import com.hallywest.charactor.Charactor;

public abstract class Event {
	
	protected Charactor from;
	protected List<Charactor> targets;
	
	public boolean canReAct() {
		return true;
	}
	public Charactor getFrom() {
		return from;
	}
	public List<Charactor> getTargets() {
		return targets;
	}
	public void setFrom(Charactor from) {
		this.from = from;
	}
	public void setTargets(List<Charactor> targets) {
		this.targets = targets;
	}
	
}
