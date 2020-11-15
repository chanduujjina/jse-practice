package com.demo.oops.polymorphism;

import com.demo.dto.Profile;

public class MeritStudent extends Student{
	@Override
	public Profile getStudentProfie() {
		return new Profile("maths,physics,chemistyr", 1, "good");
	}

}