package com.lanif.lesson21;

import com.lanif.lesson21.service.BlogProperties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Lesson21ApplicationTests {
    private static final Log log = LogFactory.getLog(Lesson21ApplicationTests.class);

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void contextLoads() {
        Assert.assertEquals("weiq", blogProperties.getName());
        Assert.assertEquals("Spring Boot教程", blogProperties.getTitle());

        log.info("随机字符串:" + blogProperties.getValue());
        log.info("随机int:" + blogProperties.getNumber());
        log.info("随机long:" + blogProperties.getBignumber());
        log.info("随机10以下:" + blogProperties.getTest1());
        log.info("随机10-20:" + blogProperties.getTest2());
    }

}
