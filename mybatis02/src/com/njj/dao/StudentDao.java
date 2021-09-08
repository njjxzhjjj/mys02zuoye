package com.njj.dao;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    //1.查询"01"课程比 “02”课程成绩高的学生的信息及课程分数
    List<Map> selectByScore(Map map);
    //2.查询"01"课程比"02"课程成绩低的学生的信息及课程分数
    List<Map> selectByScore02(Map map);
    //3、查询平均成绩大于等于60分的同学的学生编号和学生姓名和平均成绩
    List<Map> selectStudent(int S_score);
    //4、查询平均成绩小于60分的同学的学生编号和学生姓名和平均成绩____
    List<Map> selectStudent02(int S_score);
    //5、查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩
    List<Map> selectCount();
    //6、查询"李"姓老师的数量
    List<Map> selectByLikeName(String name);
    //7.查询学过"张三”老师授课的同学的信息
    List<Map> selectByName(String name);
    //8、查询没学过"张三"老师授课的同学的信息
    List<Map> selectBynotName(String name);

   // 9、查询学过编号为"01"并且也学过编号为"02"的课程的同学的信息
   List<Map> selectByid01or02(String name);
   //10、查询学过编号为"01"但是没有学过编号为"02"的课程的同学的信息
   List<Map> selectBynoid01or02(String name);
}
