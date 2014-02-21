package com.thisisphresh.test.account;

import java.util.HashMap;
import java.util.Map;

/**
 * Entry point of user administration.
 *
 * @author hirogwa
 */
public class UserAdministrator {
	private static final Map<Class<? extends SignupEntry>, Class<? extends AccountController>> CONTROLLERS;

	static {
		CONTROLLERS = new HashMap<>();
		CONTROLLERS.put(SignupEntryFacebook.class, AccountControllerFacebook.class);
	}

	public static PhreshUser signup(SignupEntry entry) {
		try {
			return CONTROLLERS.get(entry).newInstance().signup(entry);
		} catch (InstantiationException | IllegalAccessException e) {
			throw new IllegalArgumentException();
		}
	}
}
