# MyStudentMgmtApp

The specification for a Student class:

studentId : long (Primary key)
studentNumber : (required) (e.g. Data values: 000-61-0001, 000-61-0002, etc.)
firstName : (required) (e.g.  Data values: "Anna", "Bob" etc.)
middleName : (is optional) (e.g.  Data values: "Lynn", "" etc.)
lastName: (required) (e.g.  Data values: "Smith", "Galverston" etc.)
cgpa : (is optional) (e.g. Data values: 3.45, 2.87, etc)
dateOfEnrollment (This field contains date values; representing the date of enrollment of the student)

A Java console (command-line) application named, MyStudentMgmtApp with a code for a Java persistent entity/class named, Student, including the data fields as has been specified above, and the accessor (getter) methods and mutator (setter) methods, and including constructor.

Implemented a method named, saveStudent(), which takes as input a Student object and it saves/persists it to database. Added code to the main method, that creates a Student object using the following data and invokes the saveStudent() method to save it to the database.

Student data: s1: { studentId:1, studentNumber: 000-61-0001, firstName:Anna, middleName: Lynn, LastName: Smith, cgpa:3.45, dateOfEnrollment:2019/5/24 }

1. Added a new entity named, Transcript (transcriptId: primaryKey, degreeTitle) to the solution above. Implemented JPA code for mapping and persisting/saving a student-and-transcript object data. Sample data: Transcript {1, "BS Computer Science"}

2. Added a new entity named, Classroom (classroomId: primaryKey, buildingName, roomNumber) to the solution above. Implemented JPA code for mapping and persisting/saving a student-and-classroom object data. Sample data: Classroom {1, "McLaughlin building", "M105"}
