package Game;

public class gameBowling {
	public int []rolls;
	
	
	rolls=new int[21];
	quille=0;
	
	public void roll(int x) {
		
		
		rolls[quille++]=x;
		score();
		
		
	}
	
	public int score() {
		for(int x=0;x<21;x++) {
			return rolls[x];

		}
		
		
		}

	
}
