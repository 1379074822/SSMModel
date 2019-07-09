import com.coffee.dao.AccountDao;
import com.coffee.domain.Account;
import com.coffee.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: SSM_01
 * @description:
 * @author: Mr.Lian
 * @create: 2019-07-09 16:27
 **/
public class Test1 {
//    @Test
//    public void servicetest(){
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        AccountService as = (AccountService) ac.getBean("accountService");
//        as.saveAccount();
//    }
//    @Test
//    public void daoTest() throws Exception {
//        InputStream rs = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(rs);
//        SqlSession session = sessionFactory.openSession();
//        AccountDao dao = session.getMapper(AccountDao.class);
//        List<Account> list = dao.findAll();
//        for (Account account : list) {
//            System.out.println(account);
//        }
//
//    }
//    @Test
//    @Rollback(false)
//    public void dao2Test() throws Exception {
//        InputStream rs = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(rs);
//        SqlSession session = sessionFactory.openSession();
//        AccountDao dao = session.getMapper(AccountDao.class);
//        Account account1 = new Account("lili", (double)3000);
//        System.out.println(account1);
//        dao.saveAccount(account1);
//        session.commit();
//    }
}
