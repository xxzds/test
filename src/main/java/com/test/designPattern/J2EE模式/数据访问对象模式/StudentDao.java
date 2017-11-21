package com.test.designPattern.J2EE模式.数据访问对象模式;

import java.util.List;

/**
 * 创建数据访问对象接口。
 * @author ding.shuai
 * @date 2016年8月6日上午10:50:16
 */
public interface StudentDao {
	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);
}
