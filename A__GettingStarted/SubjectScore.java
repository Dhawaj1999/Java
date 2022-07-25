package A__GettingStarted;

public class SubjectScore {
    public static void main(String[] args) {
        // calculate total marks and percent
        int science = 80;
        double math = 86.5;
        int generalKnowledge = 73;
        double english = 69.5;
        double russian = 76.5;
        double totalScore = (science + math + generalKnowledge + english + russian);
        double percentage = (totalScore/500)*100;
        System.out.println(totalScore);
        System.out.println(percentage);
    }
}
