package hibernateTest;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.xudq.test.bean.Contacts;
import com.xudq.test.bean.Customer;
import com.xudq.test.utils.HibernateUtil;

public class Test {

	private SessionFactory sessionFactory = null;
	private Session session;

	
	@org.junit.Test
	public void addContact(){
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Contacts c = new Contacts();
		c.setId(111);
		c.setName("xudingqiang");
		c.setPhone("15116462409");
		session.save(c);
		tx.commit();
		session.close();
		sessionFactory.close();
	}
	
	@org.junit.Test
	public void addCustomer() {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Customer c = new Customer();
//		c.setId(2001);
		c.setName("xudq");
		c.setAge(29);
		c.setCity("changsha");
		c.setAddr("kaihui");
		session.save(c);
		
		//   采用HQL方式
		

		tx.commit();
		session.close();
		sessionFactory.close();
	}

	@org.junit.Test
	public void updateCustomer() {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Customer c = (Customer) session.load(Customer.class, 1);
		c.setName("bella");
		c.setAddr("xingsha");
		session.update(c);
		
		tx.commit();
		session.close();
		sessionFactory.close();
	}

	@org.junit.Test
	public void deleteCustomer() {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Customer c = (Customer) session.load(Customer.class, 1);
		session.delete(c);

		tx.commit();
		session.close();
		sessionFactory.close();
	}

	@org.junit.Test
	public void queryCustomer() {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
//		List<Customer> list = session.get(Customer.class, 1);
		
		// 采用HQL
//		Query query = session.createQuery("from Customer where city = 'changsha'");
//		List<Customer> list = query.list();
//		for (Customer customer : list) {
//			System.out.println(customer.getId() + "  ::   "+customer.getName());
//		}
		
		//采用QBC查询
//		Criteria criteria = session.createCriteria(Customer.class);
//		criteria.add(Restrictions.eq("id", 2));
//		List<Customer> list = criteria.list();
//		for (Customer customer : list) {
//			System.out.println(customer.getId() + "  ::   "+customer.getName());
//		}

		tx.commit();
		session.close();
		sessionFactory.close();
	}

}
