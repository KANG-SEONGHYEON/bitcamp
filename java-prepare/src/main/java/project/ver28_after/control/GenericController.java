package project.ver28_after.control;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericController<T> {
	static Scanner keyScan = new Scanner(System.in);
	
	protected ArrayList<T> list = new ArrayList<>();
	
	public void execute() {}
}
