package v3.comand;

import v3.Input;
import v3.domain.StudentScores;

public class InitScoresCommand implements Command{
    StudentScores studentScores= StudentScores.getInstance();
    @Override
    public void execute() {
        int studentNum= Input.getInt("학생수> ");
        studentScores.setStudentNum(studentNum);
    }
}
