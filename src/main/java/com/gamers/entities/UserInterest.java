package com.gamers.entities;

import java.util.List;
import java.util.Map;

public class UserInterest {

	private Map<InterestTag, List<Game>> interests;

	/**
	 * @return the interests
	 */
	public Map<InterestTag, List<Game>> getInterests() {
		return interests;
	}

	/**
	 * @param interests
	 *            the interests to set
	 */
	public void setInterests(Map<InterestTag, List<Game>> interests) {
		this.interests = interests;
	}

}
