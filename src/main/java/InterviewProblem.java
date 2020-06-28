public class InterviewProblem {

    static String st_variable = "StartVal";
    final String final_variable = "final";
    String normal_variable = "StartVal";

    public static void main(String[] args) {
        System.out.println("Hello world I'm in main function");
        InterviewProblem interviewProblem = new InterviewProblem();
        System.out.println(interviewProblem.st_variable);
        interviewProblem.st_variable = "Changed in Main";
        System.out.println(interviewProblem.st_variable);

        System.out.println(interviewProblem.final_variable);
        //interviewProblem.final_variable = "Changed in Main";
        System.out.println(interviewProblem.final_variable);
    }

}



