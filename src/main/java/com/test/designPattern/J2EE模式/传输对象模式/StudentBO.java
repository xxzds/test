package com.test.designPattern.J2EE模式.传输对象模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建业务对象。
 * @author ding.shuai
 * @date 2016年8月6日上午10:20:05
 */
public class StudentBO {

	// 列表是当作一个数据库
	List<StudentVO> students;

	public StudentBO() {
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("Robert", 0);
		StudentVO student2 = new StudentVO("John", 1);
		students.add(student1);
		students.add(student2);
	}

	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	// 从数据库中检索学生名单
	public List<StudentVO> getAllStudents() {
		return students;
	}

	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}

	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}
}
