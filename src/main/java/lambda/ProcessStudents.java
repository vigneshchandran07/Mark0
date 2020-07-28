package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ProcessStudents {

    private static List<Student> loadStudents() {

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setId(i);
            student.setName("Name" + i);
            Random r = new Random();
            int result = r.nextInt(100 - 1) + 1;
            student.setTotalMarks(result);
            studentList.add(student);
            if (i % 2 == 0) student.setGender("Male");
            else student.setGender("Female");
        }
        return studentList;
    }

    public static void main(String[] args) {
        List<Student> studentList = loadStudents();
        List<Student> maleStudentList;

        maleStudentList = studentList
                .stream()
                .sorted(Comparator.comparingInt(Student::getTotalMarks))
                .filter(s -> s.getGender().equals("Male"))
                .collect(Collectors.toList());

        int highestRankAvailable = maleStudentList.size();
        for (Student student : maleStudentList) {
            student.setRank(highestRankAvailable);
            highestRankAvailable--;
        }


        System.out.println(maleStudentList.toString());

    }

}
