package com.util;

public class Validators {

	// required
	public static boolean isEmpty(String data) {
		if (data == null || data.trim().length() == 0) {
			return true;
		}
		return false;
	}

	// format
	public static boolean isAlpha(String data) {
		return data.matches("[a-zA-Z]+");
	}

	public static boolean isEmail(String data) {
		String emailRegex = "[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z][a-zA-Z][a-zA-Z]?";
		return data.matches(emailRegex);
	}

	public static String validPassword(String password) {
		String er = "";
		if (password.length() < 8) {
			er += "minimum length is 8 <br>";
		}
		if (password.matches(".*[A-Z]+.*") == false) {
			er += "missing capital character<br>";
		}
		if (password.matches(".*[a-z]+.*") == false) {
			er += "missing small character<br>";
		}
		if (password.matches(".*[0-9]+.*") == false) {
			er += "missing digits<br>";
		}
		if (password.matches(".*[$^&*@#]+.*") == false) {
			er += "missing special character<br>";
		}
		if (er == "") {
			return "correct";
		} else {
			return "<font color='red'>" + er + "</font>";
		}
	}

	public static String passwordStrength(String password) {
		String strength = "";
		if (validPassword(password) == "correct") {

			if (password.matches(".*[A-Z]{2,}.*") || password.matches(".*[0-9]{2,}.*")
					|| password.matches(".*[a-z]{2,}.*") || password.matches(".*[!@#$%^&*?]{2,}.*")) 
			{
				strength = "weak";
			} else {

				if (password.matches(".*[A-Z][^A-Z]+[A-Z].*") || password.matches(".*[a-z][^a-z]+[a-z].*")
						|| password.matches(".*[0-9][^0-9]+[0-9].*")
						|| password.matches(".*[!@#$%^&*][^!@#$%^&*]+[!@#$%^&*].*")) {
					strength = "strong";
				}
			}
			System.out.println(strength);
		}
		else {
			System.out.println("invalid");
		}
		return strength;

	}

	public static void main(String[] args) {
////		System.out.println(validPassword("test"));
//		// System.out.println(validPassword("test@123"));
//		System.out.println(validPassword("12121221212T12"));

		System.out.println("");
		passwordStrength("aabbcc123A@");
		passwordStrength("a3c3A@1w1w");

	}

}