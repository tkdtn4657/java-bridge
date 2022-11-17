package bridge;

public class Game {
	Game(){
		IoData.outputGoGame();
		gameflow();
	}
	
	void gameflow(){
		IoData.inputSize();
		IoData.inputUpDown();
		IoData.inputRetry();
		IoData.inputUpDown();
		IoData.outputResult();
		IoData.outputGameComplite();
		IoData.outputTryCount();
		
		
		
	}
	
	
}
