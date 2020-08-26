package com.hello.springboot;

import com.hello.springboot.dao.DataSourceMapper;
import com.hello.springboot.dao.StrategyMapper;
import com.hello.springboot.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSQL {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    ApplicationContext appContext;

    @Autowired
    DataSourceMapper dataSourceMapper;

    @Autowired
    StrategyMapper strategyMapper;

    @Autowired
    User user;

    @Test
    public void printTet() throws ParseException {
        System.out.println(sdf.parse("2020-03-16 17:59:28"));
    }
    @Test
    public void scrapDataSourceTest() throws ParseException {
        DataSource dataSource = new DataSource(2L, sdf.parse("2020-03-16 17:59:28"), sdf.parse("2020-05-27 06:22:18"), "location socket",
                "{\"host\":\"127.0.0.1\",\"port\":\"9000\"}", "socket", "", "", "1");
        dataSourceMapper.insert(dataSource);
    }

    @Test
    public void strategyTest() throws ParseException {
//        StrategyExample strategyExample = new StrategyExample();
//        strategyExample.createCriteria().andSourceIdEqualTo(11);
//        List<Strategy> strategyList = strategyMapper.selectByExample(strategyExample);
        DataSourceExample dataSourceExample = new DataSourceExample();
        dataSourceExample.createCriteria().andIdBetween(101L, 107L);
        dataSourceMapper.deleteByExample(dataSourceExample);
    }

    @Test
    public void getAllBeansName() {
        String[] beans = appContext.getBeanDefinitionNames();
//        String[] beans = appContext.getBeanNamesForAnnotation(Component.class);
        Arrays.sort(beans);
        for (String bean : beans) {
            System.out.println(bean);
        }
    }

    @Test
    public void ifGetUserComponent() {
        System.out.println(user);
    }
}
