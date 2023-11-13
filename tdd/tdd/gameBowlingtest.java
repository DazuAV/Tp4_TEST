package tdd;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Game.gameBowling;


public class gameBowlingtest {
	
	@BeforeEach
	void init() {
		gameBowling game = new gameBowling();

	}
	
	@Test
	public void test() { 
		
	int resu =gameBowling.score(0);
	int y;
	
	for(int i=0; i<20;i++) {
		
		gameBowling.roll();
	assertEquals(0,gameBowling.score());
	}
	
	
	assert resu==0: "test bon";
	
	for(y=0;y<20;y++) {
	int resu1 =gameBowling.score(0);}
	
	assert resu==0: "";
	
	}
	
	
	
	

}
