package edu.kings;
/**
 * This class is part of the "Campus of Kings" application. "Campus of Kings" is a
 * very simple, text based adventure game.
 *
 * This class holds an enumeration of all command words known to the game. It is
 * used to recognize commands as they are typed in.
 *
 * @author Maria Jump
 * @version 2015.02.01
 *
 * Used with permission from Dr. Maria Jump at Northeastern University
 */

public class CommandWords {
	/** A constant array that holds all valid command words. */
	private static CommandEnum[] validCommands = {CommandEnum.go,CommandEnum.quit,CommandEnum.help,CommandEnum.look,CommandEnum.status,CommandEnum.back};

	/**
	 * Static block to initialize the fields of CommandWords.
	 */

	/**
	 * Check whether a given String is a valid command word.
	 *
	 * @param aString The string to determine whether it is a valid command.
	 * @return true if a given string is a valid command, false if it isn't.
	 */
	public static boolean isCommand(CommandEnum aCommandEnum) {
		boolean valid = false;
		int index = 0;
		while (!valid && index < validCommands.length) {
			if (validCommands[index].equals(aCommandEnum)) {
				valid = true;
			}
			index++;
		}
		// if we get here, the string was not found in the commands
		return valid;
	}
	public static CommandEnum getCommand(String theString) {
		CommandEnum retval = null;
		switch(theString) {
		case "go":
			retval = CommandEnum.go;
			break;
		case "help":
			retval = CommandEnum.help;
			break;
		case "look":
			retval = CommandEnum.look;
			break;
		case "quit":
			retval = CommandEnum.quit;
			break;
		case "status":
			retval = CommandEnum.status;
			break;
		case "back":
			retval = CommandEnum.back;
			break;
			default:
		}
		return retval;
	}
}
