package com.beginner.jpa;

/**
 * @author dragon 2016-01-01
 */
public enum ActorType {
	User(1),
	Group(1 << 1),
	Department(1 << 2);

	private final Integer value;

	ActorType(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}


	@Override
	public String toString() {
		return "AT:" + super.toString();
	}
}