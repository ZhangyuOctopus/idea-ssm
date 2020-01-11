package com.ssm.test;
import com.ssm.dao.AccountDao;
import com.ssm.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.InputStream;
import java.util.List;
public class TestMybatis {
    @Test
    public void test() throws Exception {
        /*加载mybatis的配置文件*/
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        /*创建SqlSessionFactory对象*/
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        /*创建Sqlsession对象*/
        SqlSession session = sessionFactory.openSession();
        /*获取到代理对象*/
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> account = dao.findAll();
        for (Account ac: account){
            System.out.println(ac);
        }
        in.close();;
        session.close();
    }
}