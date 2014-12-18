package com.hallywest.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hallywest.charactor.Charactor;
import com.hallywest.charactor.Group;
import com.hallywest.event.Event;

public class Judge {
	
	private static final Integer ACT_LINE = 100;
	private Group one;
	private Group two;
	
	public Judge(Group one, Group two) {
		this.one = one;
		this.two = two;
	}
	
	public void startGame() {
		while (true) {
			oneBout();
		}
	}
	
	private void oneBout() {
		Charactor whoAct = judgeWhoAct(getCharactorCanAct());
		List<Event> events = whoAct.act();
		loopAct(events);
	}
	
	private void loopAct(List<Event> events) {
		for (Event event : events) {
			if (event.canReAct()) {
				for (Charactor target : event.getTargets()) {
					loopAct(target.react(event));
				}
			}
		}
	}
	
	private List<Charactor> getCharactorCanAct() {
		List<Charactor> canAct = new ArrayList<Charactor>();
		canAct.addAll(one.getAliveCharactors());
		canAct.addAll(two.getAliveCharactors());
		return canAct;
	}
	
	private Charactor judgeWhoAct(List<Charactor> charactors) {
		for (Charactor charactor : charactors) {
			charactor.setActProgress(charactor.getActProgress() + charactor.getTotalAct());
		}
		Collections.sort(charactors, new Comparator<Charactor>() {
			public int compare(Charactor c1, Charactor c2) {
				return c1.getActProgress() > c2.getActProgress() ? 1 : -1;}
		});
		Charactor whoAct = charactors.get(0);
		if (whoAct.getActProgress() >= ACT_LINE) {
			whoAct.setActProgress(whoAct.getActProgress() - ACT_LINE);
			return whoAct;
		}
		return judgeWhoAct(charactors);
	}

}
