package cn.wyedward;

import cn.wyedward.dao.UserMapper;
import cn.wyedward.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class ApplicationTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUser(){
        User user = userMapper.selectByPrimaryKey("wyedward");
        System.out.println(user);
    }

}
