package textbasedadventure;

public class GameWorld {
	Square[][] world;
	public GameWorld() {
	world=new Square[][] {{new Hallway("Youve entered the first hallway"),new Hallway()}, {new Room(),new Hallway()}};
	}
	Square getSquare(int x,int y) {
		return world[x][y];
	}
}
