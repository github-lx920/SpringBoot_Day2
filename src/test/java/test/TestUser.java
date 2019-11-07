package test;

import com.baizhi.Application;
import com.baizhi.dao.UserDao;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestUser {
    @Autowired
    private UserService userService;

    @Autowired
    private UserDao userDao;

    @Test
    public void test1() {
    }
}
