import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Supplier;

class Test {

	private SqlSession session;

	@org.junit.jupiter.api.Test
	void test() {
		try {
			//1、获取mybatis核心配置文件的一个输入流对象
			InputStream is =  Resources.getResourceAsStream("mybatis-config.xml");
			//2、通过输入流来创建SQL session factory对象
			SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
			//3、通过SQL session factory对象来创建SQL session对象
			SqlSession sqlsession = fac.openSession();
			List<Supplier> supplierlist = sqlsession.selectList("selAll");
			System.out.println("第一位供应商信息：");
			System.out.println("供应商名："+supplierlist.get(0).getUserName());
			System.out.println("供应商地址："+supplierlist.get(0).getAddress());
			System.out.println("供应商联系方式："+supplierlist.get(0).getPhone());
			System.out.println("第二位供应商信息：");
			System.out.println("供应商名："+supplierlist.get(1).getUserName());
			System.out.println("供应商地址："+supplierlist.get(1).getAddress());
			System.out.println("供应商联系方式："+supplierlist.get(1).getPhone());
			System.out.println("第三位供应商信息：");
			System.out.println("供应商名："+supplierlist.get(2).getUserName());
			System.out.println("供应商地址："+supplierlist.get(2).getAddress());
			System.out.println("供应商联系方式："+supplierlist.get(2).getPhone());
			System.out.println("第四位供应商信息：");
			System.out.println("供应商名："+supplierlist.get(3).getUserName());
			System.out.println("供应商地址："+supplierlist.get(3).getAddress());
			System.out.println("供应商联系方式："+supplierlist.get(3).getPhone());
			//5、关闭SQL session对象
			sqlsession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
