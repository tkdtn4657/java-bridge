package bridge;

public enum PrintMessage{
	
	PRINT_OUTPUT_GOGAME("다리 건너기 게임을 시작합니다."),
	PRINT_INPUT_SIZE("다리의 길이를 입력해주세요."),
	PRINT_INPUT_UPDOWN("이동할 칸을 선택해주세요. (위: U, 아래: D"),
	PRINT_INPUT_RETRY("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q"),
	PRINT_OUTPUT_RESULT("최종 게임 결과"),
	PRINT_OUTPUT_GAMECOMPLITE("게임 성공 여부: "),
	PRINT_OUTPUT_TRYCOUNT("총 시도한 횟수: ");

	private final String message;
	
	PrintMessage(String message) {
		this.message = message;
	}
	
	public String getName() {
		return message;
	}
	
}