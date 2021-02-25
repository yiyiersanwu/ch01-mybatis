package com.yiyiersanwu;

import com.yiyiersanwu.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 何心想
 * @Description: 作用：测试mybatis 读取student数据
 * @Date 2021/2/22 20:38
 */
public class MyApp {

    public static void main(String[] args) throws IOException {
        //1.定义主配置文件名称，从类路径根开始(target/classes)
        String config="mybatis.xml";
        //2.读取这个config表示的文件
        InputStream in = Resources.getResourceAsStream(config);
        //3.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //4.创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);
        //5.(!!!!!!重要)获取  SqlSession从SqlSessionFactory中获取
        SqlSession sqlSession = factory.openSession();
        //6.（！！重要）指定要执行sql语句的标识 sql映射文件中的namespace+”.“+标签的id值
        String sqlId="com.yiyiersanwu.dao.StudentDao"+"."+"selectStudents";
        //7. 执行sql语句 通过sqlid找到语句
        List<Student> studentList = sqlSession.selectList(sqlId);
        //8. 输出结果
        studentList.forEach(stu-> System.out.println(stu));
        //9.关闭sqlsession对象
        sqlSession.close();

    }
}
