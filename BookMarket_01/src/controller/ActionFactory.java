package controller;

import controller.action.Action;

public class ActionFactory {

	private static ActionFactory instance = null;

	public static ActionFactory getInstance() {
		if (instance == null) {
			instance = new ActionFactory();
		}
		return instance;
	}

	private ActionFactory() {
		super();
	}

	public Action getAction(String command) {
		Action action = null;

		if (command.equals("command in string")) {
		}
		System.out.println("ActionFactory: " + command);
		return action;

	}

}
