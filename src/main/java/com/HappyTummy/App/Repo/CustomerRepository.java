package com.HappyTummy.App.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.HappyTummy.App.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer,Integer> {
	public static final String email_psw = "select * from customer c where c.cus_email=?1 and c.cus_psw=?2";
	@Query(value=email_psw,nativeQuery = true)
	public Customer findByEmailAndPassword(String user_email,String user_psw);
}
