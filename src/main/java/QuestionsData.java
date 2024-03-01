import java.util.List;

public record QuestionsData(String qId, String questionName, boolean isSolved, List<Tags> tags) {
}
