package v3.comand;

import v3.Input;
import v3.domain.StudentScores;

public class GetScoresCommand implements Command{
    StudentScores studentScores= StudentScores.getInstance();
    @Override
    public void execute() {
        int[] scores = studentScores.getScores();
        for(int i= 0; i< scores.length; i++) {
            scores[i] = Input.getInt("scores[" + i + "]> ");
        }
    }
}
