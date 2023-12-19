
import com.ruoyi.RuoYiApplication;
import com.ruoyi.system.mapper.TeachersMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.ruoyi.common.utils.PageUtils.startPage;

@SpringBootTest(classes= RuoYiApplication.class)
class RuoYiApplicationTest {

    @Autowired
    private TeachersMapper teachersMapper;

    @Test
    void testHello(){
        startPage(1,2);
        List list = teachersMapper.selectAll();
        System.out.println(list);
    }

}
