package baseball;

import static constant.Constant.*;

import camp.nextstep.edu.missionutils.Console;

public class Controller {

	private final String answer;

	public Controller(String answer) {
		this.answer = answer;
	}

	public void start() {

		String resultMessage;

		do {

			System.out.print(QUESTION);

			String input = Console.readLine();

			Verification.ofInput(input);

			resultMessage = Game.play(answer, input);

			System.out.println(resultMessage);

		} while (!resultMessage.equals(INPUT_LENGTH + STRIKE));

		System.out.println(CLEAR);
	}

	public boolean selectRestartOrExit() {

		System.out.println(RESTART_OR_EXIT);

		String reStartOrExitInput = Console.readLine();

		Verification.ofReStartOrExitInput(reStartOrExitInput);

		if (reStartOrExitInput.equals(RE_START)) {
			return true;
		}

		return false;
	}
}
