import java.util.List;

public interface ILeetCodeDashBoard {
    List<QuestionsData> showQuestionsList(final AuthObj authObj);
    List<QuestionsData> filterByTags(final AuthObj authObj,final String tag);
    Question showQuestion(final String qId);
}
