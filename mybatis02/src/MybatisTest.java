import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {
    private SqlSession sqlSession;//请讲一下mybatis的执行流程
    private SqlSessionFactory sqlSessionFactory;
    @Before

    public void before() throws Exception {
        //加载并读取xml
        String path = "SqlMapConfig.xml";
        InputStream is = Resources.getResourceAsStream(path);
        //sql 链接的工厂 类
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
        System.out.println("sqlSession = " + sqlSession);//.sqlsession. = . org. apache . ibatis. session. defaul ts . Defaul tSq lSession@71423665
        //sqlSession.close();
     }
    @Test
    public void test01() throws IOException {
        Map map = new HashMap();
        map.put("c_id01", "01");
        map.put("c_id02", "02");
        List<Map> lists = sqlSession.selectList("com.njj.dao.StudentDao.selectByScore", map);
        for (Map list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }
    @Test
    public void test02() throws IOException {
        Map map = new HashMap();
        map.put("c_id01", "01");
        map.put("c_id02", "02");
        List<Map> lists = sqlSession.selectList("com.njj.dao.StudentDao.selectByScore02", map);
        for (Map list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }
    @Test
    public void test03() throws IOException {
        Map map = new HashMap();
        map.put("c_id01", "01");
        map.put("c_id02", "02");
        List<Map> lists = sqlSession.selectList("com.njj.dao.StudentDao.selectStudent", map);
        for (Map list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }
    @Test
    public void test04() throws IOException {
        Map map = new HashMap();
        map.put("c_id01", "01");
        map.put("c_id02", "02");
        List<Map> lists = sqlSession.selectList("com.njj.dao.StudentDao.selectStudent02", map);
        for (Map list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }
    @Test
    public void test05() throws IOException {
        Map map = new HashMap();
        map.put("c_id01", "01");
        map.put("c_id02", "02");
        List<Map> lists = sqlSession.selectList("com.njj.dao.StudentDao.selectCount", map);
        for (Map list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }
    @Test
    public void test06() throws IOException {
        Map map = new HashMap();
        map.put("c_id01", "01");
        map.put("c_id02", "02");
        List<Map> lists = sqlSession.selectList("com.njj.dao.StudentDao.selectByLikeName", "李");
        for (Map list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }
    @Test
    public void test07() throws IOException {
        Map map = new HashMap();
        map.put("c_id01", "01");
        map.put("c_id02", "02");
        List<Map> lists = sqlSession.selectList("com.njj.dao.StudentDao.selectByName", "张三");
        for (Map list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }
    @Test
    public void test08() throws IOException {
        Map map = new HashMap();
        map.put("c_id01", "01");
        map.put("c_id02", "02");
        List<Map> lists = sqlSession.selectList("com.njj.dao.StudentDao.selectBynotName", "张三");
        for (Map list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }

    @Test
    public void test09() throws IOException {
        Map map = new HashMap();
        map.put("c_id01", "01");
        map.put("c_id02", "02");
        List<Map> lists = sqlSession.selectList("com.njj.dao.StudentDao.selectByid01or02", map);
        for (Map list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }

    @Test
    public void test10() throws IOException {
        Map map = new HashMap();
        map.put("c_id01", "01");
        map.put("c_id02", "02");
        List<Map> lists = sqlSession.selectList("com.njj.dao.StudentDao.selectBynoid01or02", map);
        for (Map list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }
}
