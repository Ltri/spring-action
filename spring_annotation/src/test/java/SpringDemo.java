
import com.ltri.config.SpringConfig;
import com.ltri.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * create by com.ltri on 2019/05/25 22:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SpringDemo {
    @Autowired
    private UserService userService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test() {
        userService.findById(1L);
    }

    @Test
    public void test2() {
        jdbcTemplate.execute("insert into t_user (id,name,money,birth) values (5,'abc',3000,'1991-01-01')");
    }


}
