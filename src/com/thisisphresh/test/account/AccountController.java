package com.thisisphresh.test.account;

/**
 * Responsible for the tasks to create and modify user accounts.
 *
 * @author hirogwa
 */
public interface AccountController<E extends SignupEntry> {
	PhreshUser signup(E entry);
}
