package Bowling;

public class gameBowlingTest {
	gameBowling game = new gameBowling();
	
	public void test() { 
	int resu =gameBowling.partie(0);
	
	assert resu==0: "test bon";
	
	}

}
