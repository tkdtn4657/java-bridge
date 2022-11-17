package bridge;



public class IoData {
	String message;
	
	IoData(PrintMessage tmp){
		this.message = tmp.getName();
	}
	static void outputGoGame(){
		IoData output = new IoData(PrintMessage.PRINT_OUTPUT_GOGAME);
		System.out.println(output.message);
	}
	
	static void inputSize(){
		IoData output = new IoData(PrintMessage.PRINT_INPUT_SIZE);
		System.out.println(output.message);
	}
	
	static void inputUpDown(){
		IoData output = new IoData(PrintMessage.PRINT_INPUT_UPDOWN);
		System.out.println(output.message);
	}
	
	static void inputRetry(){
		IoData output = new IoData(PrintMessage.PRINT_INPUT_RETRY);
		System.out.println(output.message);
	}
	
	static void outputResult(){
		IoData output = new IoData(PrintMessage.PRINT_OUTPUT_RESULT);
		System.out.println(output.message);
	}
	
	static void outputGameComplite(){
		IoData output = new IoData(PrintMessage.PRINT_OUTPUT_GAMECOMPLITE);
		System.out.println(output.message);
	}
	static void outputTryCount(){
		IoData output = new IoData(PrintMessage.PRINT_OUTPUT_TRYCOUNT);
		System.out.println(output.message);
	}

}
