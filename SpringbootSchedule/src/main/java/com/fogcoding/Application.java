package com.fogcoding;

import com.fogcoding.mybatis.dao.batchMapper;
import com.fogcoding.mybatis.dao.test_envMapper;
import com.fogcoding.mybatis.dao.usersMapper;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/6/23 16:15
 * @e-mail: thinfog@126.com
 */

@EnableScheduling
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.fogcoding.mybatis.dao")
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(Application.class,args);

        mybatisService service = application.getBean(mybatisService.class);
        service.m1();

//        List<String> warnings = new ArrayList<String>();
//        boolean overwrite = true;
//        File configFile = new File("D:\\workspace\\Templates\\SpringbootSchedule\\src\\main\\resources\\generatorConfig.xml");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = null;
//        try {
//
//            config = cp.parseConfiguration(configFile);
//            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//            myBatisGenerator.generate(new ProgressCallback() {
//                public void introspectionStarted(int i) {
//
//                }
//
//                public void generationStarted(int i) {
//
//                }
//
//                public void saveStarted(int i) {
//
//                }
//
//                public void startTask(String s) {
//
//                }
//
//                public void done() {
//
//                }
//
//                public void checkCancel() throws InterruptedException {
//
//                }
//            });
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (XMLParserException e) {
//            e.printStackTrace();
//        } catch (InvalidConfigurationException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }



    }

}
