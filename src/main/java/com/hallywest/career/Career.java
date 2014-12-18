package com.hallywest.career;

import java.util.List;

import com.hallywest.charactor.Charactor;
import com.hallywest.charactor.Group;

public abstract class Career {
	
	protected List<Skill> skills;

	public abstract Skill triggerWhatSkill(Charactor charactor, Group we, Group they);
}
