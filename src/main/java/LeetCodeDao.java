import java.util.EnumSet;
import java.util.List;

public class LeetCodeDao implements ILeetCodeDashBoard{
    /**
     * @return 
     */
    @Override
    public List<QuestionsData> showQuestionsList(final AuthObj authObj) {
        // db calls to fetch questions
        List<QuestionsData> fetchedQuestions= List.of(new QuestionsData("1","Two Sum",true,List.of(Tags.HASHING,Tags.SORTING)),
                new QuestionsData("2","Three Sum",true,List.of(Tags.HASHING,Tags.SORTING,Tags.TWO_POINTERS)));
        return fetchedQuestions;
    }

    /**
     * @param tag 
     * @return
     */
    @Override
    public List<QuestionsData> filterByTags(final AuthObj authObj,final String tag) {
        // db calls to fetch questions
        List<QuestionsData> fetchedQuestions= List.of(new QuestionsData("1","Two Sum",true,List.of(Tags.HASHING,Tags.SORTING)),
                new QuestionsData("2","Three Sum",true,List.of(Tags.HASHING,Tags.SORTING,Tags.TWO_POINTERS)));
       List<QuestionsData> filteredQuestions=fetchedQuestions.stream()
               .filter(question-> question.tags().contains(Tags.valueOf(tag))).toList();
        return filteredQuestions;
    }

    /**
     * @param qId 
     * @return
     */
    @Override
    public Question showQuestion(final String qId) {
        // fetch question from db
        Question questions=new Question();
        return questions;
    }
}
