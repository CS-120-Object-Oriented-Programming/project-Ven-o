package edu.kings;

public enum CommandEnum {
	go("go"),
	quit("quit"),
	look("look"),
	help("help"),
	status("status"),
	back("back");
	
	private final String command;
	
	private CommandEnum(String newCommand) {
		command = newCommand;
	}
	
	public String getCommand() {
		return command;
	}
}
