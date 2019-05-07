/**
 * see the tutorial in https://www.youtube.com/watch?v=Vvnliarkw48
 * 
 */

package com.in28minutes.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		// usually uses a database

		// hardcoded
		if (user.equals("nik") && password.equals("pass"))
			return true;

		return false;

	}
}
