package com.project.core.examples.zookeeper;

import org.apache.zookeeper.KeeperException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;

/**
 * ZookeeperClient
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 23, 2024</pre>
 */
@Service
public class ZookeeperClient {

    @Value("${zookeeper.connect-string}")
    private String connectString;
    private ZooKeeperUtil zooKeeperUtil;

    @PostConstruct
    public void init() throws IOException {
        zooKeeperUtil = new ZooKeeperUtil(connectString);
    }

    public void createNode(String path, byte[] data) throws InterruptedException, KeeperException {
        zooKeeperUtil.createNode(path, data);
    }

    public void getNode(String path) throws InterruptedException, KeeperException {
        zooKeeperUtil.getData(path);
    }

    public void deleteNode(String path) throws InterruptedException, KeeperException {
        zooKeeperUtil.deleteNode(path);
    }

    public void updateNode(String path, byte[] data) throws InterruptedException, KeeperException {
        zooKeeperUtil.updateNode(path,data);
    }

    public List<String> getChildNode(String path) throws InterruptedException, KeeperException {
        return zooKeeperUtil.getChildren(path);
    }


}
