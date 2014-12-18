package com.hallywest.charactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hallywest.career.Career;
import com.hallywest.career.Skill;
import com.hallywest.event.CommonAtkEvent;
import com.hallywest.event.Event;

public class Hero extends Charactor {

	private Career career;
	
	@Override
	public List<Event> act() {
		List<Event> events = new ArrayList<Event>();
		// whether use skill
		Skill skill = career.triggerWhatSkill(this, we, they);
		if (skill != null) {
			events.addAll(skill.trigger());
		} else {
			Charactor target = they.getAliveCharactors().get(new Random().nextInt(they.getAliveCharactors().size()));
			events.add(createCommonAtkEvent(this, target));
		}
		return events;
	}
	
	@Override
	public List<Event> react(Event event) {
		if (event instanceof CommonAtkEvent) {
			
		}
		return new ArrayList<Event>();
	}
	
	private Event createCommonAtkEvent(Charactor from, Charactor target) {
		CommonAtkEvent event = new CommonAtkEvent();
		event.setFrom(from);
		List<Charactor> targets = new ArrayList<Charactor>();
		targets.add(target);
		event.setTargets(targets);
		return event;
	}

	public Career getCareer() {
		return career;
	}

	public void setCareer(Career career) {
		this.career = career;
	}

	
}
