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
	int resu =gameBowling.partie(0);
	
	assert resu==0: "test bon";
	
	}

}
