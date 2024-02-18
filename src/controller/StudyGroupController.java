package controller;
import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.StudyGroupService;

import java.util.List;

public class StudyGroupController {
    private StudyGroupService studyGroupService = new StudyGroupService();

    public StudyGroup createStudyGroupWithTeacherAndStudents(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public void printStudyGroupDetails(StudyGroup studyGroup) {
        System.out.println("Teacher: " + studyGroup.getTeacher().getFirstName() + " " +
                studyGroup.getTeacher().getLastName() + " " +
                studyGroup.getTeacher().getMiddleName());
        System.out.println("Students:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println("  - " + student.getFirstName() + " " +
                    student.getLastName() + " " +
                    student.getMiddleName() +
                    " (ID: " + student.getStudentId() + ")");
        }
    }
}