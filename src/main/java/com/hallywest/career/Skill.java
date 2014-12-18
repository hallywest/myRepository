package com.hallywest.career;

import java.util.List;

import com.hallywest.event.Event;

public abstract class Skill {
	
	protected int cd;
	protected int ccd; //current cd

	public abstract List<Event> trigger();
}
