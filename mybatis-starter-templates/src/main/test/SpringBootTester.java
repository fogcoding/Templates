import com.fogcoding.Application;
import com.fogcoding.mapper.EmployeesMapper;
import com.fogcoding.model.Employees;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/6/10 10:32
 * @e-mail: thinfog@126.com
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class SpringBootTester {

    @Autowired
    private EmployeesMapper mapper;

    @Test
    public void test(){
        List<Employees> list = mapper.getAll();

        System.out.println( new Gson().toJson(list));


    }



}
