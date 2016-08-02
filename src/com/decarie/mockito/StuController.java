package com.decarie.mockito;

public class StuController {

	public StuController() {
		// TODO Auto-generated constructor stub
	}
	
	private StudentDAO mStudentDAO;

    public Student getStudentInfo(int sid) {
        Student student = null;
        if (mStudentDAO != null) {
            student = mStudentDAO.getStudentFromDB(sid);
        }
        if (student == null) {
            student = fetchStudentInfo(sid);
        }
        return student;
    }

    private Student fetchStudentInfo(int sid) {
        System.out.println("从网络上获取学生信息");
        Student student = new Student();
        student.id = 456;
        student.name = "server-user";
        return student;
    }

    public void setStudentDAO(StudentDAO dao) {
        this.mStudentDAO = dao;
    }

}
