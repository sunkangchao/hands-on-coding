package com.project.core.zookeeper.base;

import com.project.core.HandsOnCodingApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author huaqiang
 * @version 1.0
 * @date：2020-12-14
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = {HandsOnCodingApplication.class})
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public abstract class BaseTest {

}
