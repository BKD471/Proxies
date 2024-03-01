import java.util.List;

public class Client {
    public static void main(String[] args) {
        ILeetCodeDashBoard leetCodeDashBoard = new LeetCodeDaoProxy();
        final AuthObj authObj = new AuthObj("1", "bkd471", "abcd123");
        List<QuestionsData> questionList = leetCodeDashBoard.showQuestionsList(authObj);
        System.out.println(questionList);

        Question question = leetCodeDashBoard.showQuestion("1");
        System.out.println(question);

        List<QuestionsData> filteredQuestions = leetCodeDashBoard.filterByTags(authObj, String.valueOf(Tags.HASHING));
        System.out.println(filteredQuestions);
    }
}
