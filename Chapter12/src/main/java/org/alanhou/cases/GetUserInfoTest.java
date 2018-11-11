package org.alanhou.cases;

import org.alanhou.config.TestConfig;
import org.alanhou.model.GetUserInfoCase;
import org.alanhou.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.Callable;

public class GetUserInfoTest {

    @Test(dependsOnGroups = "loginTrue", description = "获取 userId 为1的用户信息")
    public void getUserInfo() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSession();
        GetUserInfoCase getUserInfoCase = session.selectOne("getUserInfoCase",1);
        System.out.println(getUserInfoCase.toString());
        System.out.println(TestConfig.getUserInfoUrl);
    }
}
