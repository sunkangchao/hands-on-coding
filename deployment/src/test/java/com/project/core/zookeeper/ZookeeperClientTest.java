package com.project.core.zookeeper;

import com.project.core.zookeeper.base.BaseTest;
import com.project.core.examples.zookeeper.ZookeeperClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.KeeperException;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
class ZookeeperClientTest extends BaseTest {

    @Autowired
    private ZookeeperClient zookeeperClient;

    @Before
    void setUp() {

    }

    @Test
    void test() throws InterruptedException, KeeperException {
        String path = "/test";
        byte[] data = "hello zookeeper1111".getBytes();
        zookeeperClient.createNode(path, data);
        log.info("ZookeeperClientTest#createNode success, path: {}, data: {}", path, new String(data));
    }
}