package com.project.core.zookeeper;

import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.List;

/**
 * ZooKeeperUtil
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 23, 2024</pre>
 */
@Slf4j
public class ZooKeeperUtil {

    private static final int SESSION_TIMEOUT = 3000;
    private final ZooKeeper zooKeeper;

    // 1. 构造函数 2. 块 3. 整个spring容器

    public ZooKeeperUtil(String connectString) throws IOException {
        zooKeeper = new ZooKeeper(connectString, SESSION_TIMEOUT, new DefaultWatcher());
    }

    public void createNode(String path, byte[] data) throws InterruptedException, KeeperException {
        zooKeeper.create(path, data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
    }

    public byte[] getData(String path) throws InterruptedException, KeeperException {
        return zooKeeper.getData(path, false, null);
    }

    public void deleteNode(String path) throws InterruptedException, KeeperException {
        zooKeeper.delete(path, -1);
    }

    public void updateNode(String path, byte[] data) throws InterruptedException, KeeperException {
        zooKeeper.setData(path, data, -1);
    }


    public List<String> getChildren(String path) throws InterruptedException, KeeperException {
        return zooKeeper.getChildren(path, false);
    }

    public void close() throws InterruptedException {
        zooKeeper.close();
    }


    public static class DefaultWatcher implements Watcher {
        @Override
        public void process(WatchedEvent watchedEvent) {

        }
    }


}
