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
			//1����ȡmybatis���������ļ���һ������������
			InputStream is =  Resources.getResourceAsStream("mybatis-config.xml");
			//2��ͨ��������������SQL session factory����
			SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
			//3��ͨ��SQL session factory����������SQL session����
			SqlSession sqlsession = fac.openSession();
			List<Supplier> supplierlist = sqlsession.selectList("selAll");
			System.out.println("��һλ��Ӧ����Ϣ��");
			System.out.println("��Ӧ������"+supplierlist.get(0).getUserName());
			System.out.println("��Ӧ�̵�ַ��"+supplierlist.get(0).getAddress());
			System.out.println("��Ӧ����ϵ��ʽ��"+supplierlist.get(0).getPhone());
			System.out.println("�ڶ�λ��Ӧ����Ϣ��");
			System.out.println("��Ӧ������"+supplierlist.get(1).getUserName());
			System.out.println("��Ӧ�̵�ַ��"+supplierlist.get(1).getAddress());
			System.out.println("��Ӧ����ϵ��ʽ��"+supplierlist.get(1).getPhone());
			System.out.println("����λ��Ӧ����Ϣ��");
			System.out.println("��Ӧ������"+supplierlist.get(2).getUserName());
			System.out.println("��Ӧ�̵�ַ��"+supplierlist.get(2).getAddress());
			System.out.println("��Ӧ����ϵ��ʽ��"+supplierlist.get(2).getPhone());
			System.out.println("����λ��Ӧ����Ϣ��");
			System.out.println("��Ӧ������"+supplierlist.get(3).getUserName());
			System.out.println("��Ӧ�̵�ַ��"+supplierlist.get(3).getAddress());
			System.out.println("��Ӧ����ϵ��ʽ��"+supplierlist.get(3).getPhone());
			//5���ر�SQL session����
			sqlsession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
