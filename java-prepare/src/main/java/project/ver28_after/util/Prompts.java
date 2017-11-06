package project.ver28_after.util;

import java.util.Scanner;

public class Prompts {
	static Scanner keyScan = new Scanner(System.in);
	
	public static int inputInt(String messege, Object...values) {
		System.out.printf(messege, values);
		return Integer.parseInt(keyScan.nextLine());
	}
	
	public static String inputString(String messege, Object...values) {
		System.out.printf(messege, values);
		return keyScan.nextLine();
	}
	@Deprecated
	public static String input(String message) {
		System.out.print(message);
		return keyScan.nextLine();
	} // prompt method

	public static boolean confirm(String message) {
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("y") || response.equals("yes") || response.equals("")) {
			return true;
		}
		return false;
	} // confirm method

	public static boolean confirm2(String message) {
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("n") || response.equals("no") || response.equals("")) {
			return false;
		}
		return true;
	} // confirm2 method


}
