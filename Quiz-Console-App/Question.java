public class Question {
    private static int nextId = 1;
    private int id;
    private String question;
    private int opt1;
    private int opt2;
    private int opt3;
    private int opt4;
    private int answer;

    public Question(String question, int opt1, int opt2, int opt3, int opt4, int answer) {
        this.id = nextId++;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public int getOpt1() {
        return opt1;
    }
    public void setOpt1(int opt1) {
        this.opt1 = opt1;
    }
    public int getOpt2() {
        return opt2;
    }
    public void setOpt2(int opt2) {
        this.opt2 = opt2;
    }
    public int getOpt3() {
        return opt3;
    }
    public void setOpt3(int opt3) {
        this.opt3 = opt3;
    }
    public int getOpt4() {
        return opt4;
    }
    public void setOpt4(int opt4) {
        this.opt4 = opt4;
    }
    public int getAnswer() {
        return answer;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + "]. Question=" + question + "\nopt1=" + opt1 + "\nopt2=" + opt2 + "\nopt3=" + opt3
                + "\nopt4=" + opt4 + "\nAnswer=" + answer;
    }

    
}
