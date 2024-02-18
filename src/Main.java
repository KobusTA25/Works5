import controller.StudyGroupController;
import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример использования
        Teacher teacher = new Teacher("Иван", "Иванович", "Иванов", 1);

        Student student1 = new Student("Петр", "Петров", "Петрович", 101);
        Student student2 = new Student("Иван", "Иванов", "Иванович", 102);
        Student student3 = new Student("Василий", "Васильев", "Васильевич", 103);

        List<Student> students = List.of(student1, student2, student3);

        StudyGroupController studyGroupController = new StudyGroupController();
        StudyGroup studyGroup = studyGroupController.createStudyGroupWithTeacherAndStudents(teacher, students);

        studyGroupController.printStudyGroupDetails(studyGroup);
    }
}