package tdd;

public class Game {
	private int[] rolls = new int[21];
	private int currRoll = 0;
	//private Frame[] frames = new Frame[10];
	
	
	public void roll(int nbQuilles) {
		if (currRoll >= 3) {
			if (rolls[currRoll-1] + rolls[currRoll-2] >= 10)
				rolls[currRoll+1] += rolls[currRoll];
		}
		rolls[currRoll] += nbQuilles;
		currRoll++;
	}
	
	public int score() {
		int score = 0;
		for (int i=0;i<21;i++)
			score += rolls[i];
		return score;
	}
	
	
	
}
