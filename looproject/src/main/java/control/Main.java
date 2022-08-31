package control;

import dao.StudentDao;
import model.Student;

public class Main {

	public static void main(String[] args) {

		StudentDao dao = new StudentDao();
		Student student = new Student();
		student.setName("Emerson Fedechen");
		student.setAge(49);
		student.setEmail("fedechen@utfpr.edu.br");
		student.setRa(1233445);
		dao.saveStudent(student);
	}
}