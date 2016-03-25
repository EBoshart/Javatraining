package textbasedadventure;

public class Room extends Square {
	String string;
	public Room() {
		
	}
	public Room(String s) { 
	}
	
	@Override
	String getDescription() {
		// TODO Auto-generated method stub
		return "you have entered a room";
	}
	String getDescription(String s){
		return s;
	}

}
