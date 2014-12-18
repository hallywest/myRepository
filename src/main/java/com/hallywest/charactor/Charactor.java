package com.hallywest.charactor;

import java.util.List;

import com.hallywest.event.Event;
public abstract class Charactor {
	protected int level;
	protected String name;
	protected double hp;
	protected double chp; // current hp
	protected double mp;
	protected double cmp; // current mp
	protected double pow; // power
	protected double epow;
	protected double spt; // spirit
	protected double espt;
	protected double sta; // stamina
	protected double esta;
	protected double act; // action
	protected double eact;
	protected double actProgress;
	
	protected Group we;
	protected Group they;
	
	public boolean isAlive() {
		return chp > 0;
	}
	
	public abstract List<Event> act();
	
	public abstract List<Event> react(Event event);

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public double getMp() {
		return mp;
	}
	public void setMp(double mp) {
		this.mp = mp;
	}
	public double getPow() {
		return pow;
	}
	public void setPow(double pow) {
		this.pow = pow;
	}
	public double getTotalPow() {
		return pow + epow > 0 ? pow + epow : 0;
	}
	public double getSpt() {
		return spt;
	}
	public void setSpt(double spt) {
		this.spt = spt;
	}
	public double getTotalSpt() {
		return spt + espt > 0 ? spt + espt : 0;
	}
	public double getSta() {
		return sta;
	}
	public void setSta(double sta) {
		this.sta = sta;
	}
	public double getTotalSta() {
		return sta + esta > 0 ? sta + esta : 0;
	}
	public double getAct() {
		return act;
	}
	public void setAct(double act) {
		this.act = act;
	}
	public double getTotalAct() {
		return act + eact > 0 ? act + eact : 0;
	}
	public double getChp() {
		return chp;
	}
	public void setChp(double chp) {
		this.chp = chp;
	}
	public double getCmp() {
		return cmp;
	}
	public void setCmp(double cmp) {
		this.cmp = cmp;
	}
	public double getActProgress() {
		return actProgress;
	}
	public void setActProgress(double actProgress) {
		this.actProgress = actProgress;
	}
	public double getEpow() {
		return epow;
	}
	public void setEpow(double epow) {
		this.epow = epow;
	}
	public double getEspt() {
		return espt;
	}
	public void setEspt(double espt) {
		this.espt = espt;
	}
	public double getEsta() {
		return esta;
	}
	public void setEsta(double esta) {
		this.esta = esta;
	}
	public double getEact() {
		return eact;
	}
	public void setEact(double eact) {
		this.eact = eact;
	}
}