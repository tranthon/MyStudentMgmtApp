package edu.mum.cs.cs425.studentmgmt;
import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;


@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ClassroomRepository classroomRepository;
    public static void main(String[] args) {
        SpringApplication.run(StudentMgmtApp.class, args);
    }

    private Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Lab 7 registration application");
        Classroom c1 = new Classroom("McLaughlin building", "M105");
        classroomRepository.save(c1);
        Transcript t1 = new Transcript("BS Computer Science");
        Student s1 = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 5, 24), t1);
        s1.setClassroom(c1);
        Student savedStudent = saveStudent(s1);
        System.out.println(savedStudent);
    }
}
