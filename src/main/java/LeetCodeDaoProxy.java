import java.util.List;

public class LeetCodeDaoProxy implements ILeetCodeDashBoard {
    private final LeetCodeDao leetCodeDao;
    LeetCodeDaoProxy(){
        this.leetCodeDao=new LeetCodeDao();
    }

    /**
     * @return 
     */
    @Override
    public List<QuestionsData> showQuestionsList(final AuthObj authObj) {
        if(authObj.userName().equals("bkd471") && authObj.password().equals("abcd123")){
            return leetCodeDao.showQuestionsList(authObj);
        }
        throw new RuntimeException("Please Authenticate");
    }

    /**
     * @param tag 
     * @return
     */
    @Override
    public List<QuestionsData> filterByTags(final AuthObj authObj,String tag) {
        if(authObj.userName().equals("bkd471") && authObj.password().equals("abcd123")){
            return leetCodeDao.filterByTags(authObj,tag);
        }
        throw  new RuntimeException("Please Authenticate");
    }

    /**
     * @param qId 
     * @return
     */
    @Override
    public Question showQuestion(String qId) {
        return leetCodeDao.showQuestion(qId);
    }
}
