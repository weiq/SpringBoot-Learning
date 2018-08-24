package com.lanif.lesson34;

import com.lanif.lesson34.domain.User;
import com.lanif.lesson34.domain.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Lesson34ApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
        userRepository.save(new User("AAA", 10));
        userRepository.save(new User("BBB", 20));
        userRepository.save(new User("CCC", 30));
        userRepository.save(new User("DDD", 40));
        userRepository.save(new User("EEE", 50));
        userRepository.save(new User("FFF", 60));

        Assert.assertEquals(6, userRepository.findAll().size());
    }

}
