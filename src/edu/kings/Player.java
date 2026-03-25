/**
 * 
 */
package edu.kings;

/**
 * 
 */
public class Player {
	private Room currentRoom;
	private Room pastRoom;
	public Player(Room room) {
		this.currentRoom = room;
	} 
	
	public Room getcurrentRoom() {
		return currentRoom;
	}
	
	public void setcurrentRoom(Room room) {
		this.currentRoom = room;
	}
	
	
	
	
}
