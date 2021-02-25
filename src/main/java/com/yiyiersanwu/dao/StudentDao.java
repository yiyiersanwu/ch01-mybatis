package com.yiyiersanwu.dao;

import com.yiyiersanwu.domain.Student;

import java.util.List;

/**
 * @author 何心想
 * @Description: 作用：操作student表
 * @Date 2021/2/22 18:21
 */
public interface StudentDao {

    //查询student表的所有数据
    public List<Student> selectStudents();

    //插入方法
    //参数： student，表示要插入数据库的数据
    //返回值： 表示要执行insert 操作后影响数据库的行数
    public int insertStudent(Student student);

}
