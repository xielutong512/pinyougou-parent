import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


public class MybatisMapperTest {


//	查询订单表order的所有数据
	@Test
	public void testOrderList() throws Exception {
		/*//加载核心配置文件
		String resource = "mybatis/SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
		
		List<TbBrand> ordersList = mapper.selectByExample(null);
		for (TbBrand orders : ordersList) {
			System.out.println(orders);
		}*/
	}

}
