package com.chryl.chrshardingspherejdbc;

import com.chryl.mapper.TbUserMapper;
import com.chryl.po.TbUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChrShardingSphereJdbcApplicationTests {
    @Autowired
    private TbUserMapper tbUserMapper;

    @Test
    public void insertTest() {
        for (int i = 0; i < 100; i++) {
            TbUser user = new TbUser();
            user.setName("test" + i);
            user.setSex("男");
            tbUserMapper.insert(user);
        }
    }


    @Test
    void contextLoads() {
    }

}
