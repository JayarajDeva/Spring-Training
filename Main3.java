import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.tx.Dao;
import com.demo.tx.Emp;

public class Main3 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		Dao dao= (Dao)ctx.getBean("daoImpl");
		
		List<Emp> empList= new ArrayList<>();
		empList.add(new Emp(107,"Ratan","Pune",30000));
		empList.add(new Emp(108,"Chetan","Pune",30000));
		empList.add(new Emp(109,"Ketan","Pune",30000));
		empList.add(new Emp(105,"Jiten","Pune",30000));
		empList.add(new Emp(111,"Kitten","Pune",30000));
		
		dao.save(empList);

		
	}

}
