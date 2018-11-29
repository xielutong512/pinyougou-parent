import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

public class JunitTest {

	
	@Test
	public void testMapper() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
		TbBrandMapper mapper = ac.getBean(TbBrandMapper.class);
//		UserMapper mapper = (UserMapper) ac.getBean("userMapper");
		List<TbBrand> user = mapper.selectByExample(null);
		for (TbBrand orders : user) {
			System.out.println(orders);
		}
	}
}
