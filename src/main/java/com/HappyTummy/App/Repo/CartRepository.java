package com.HappyTummy.App.Repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.HappyTummy.App.Model.Cart;
@Repository
public interface CartRepository extends JpaRepository <Cart,Integer>{
	//HQl 
	
	@Query(value="select * from cart r where r.customer_cus_id=0?",nativeQuery = true)
	List<Cart> findByCustomer_Cus_Id(int cus_id);
	
	String query="insert into cart(cus_name,item_name,price,qty,customer_cus_id,item_item_id)values(:cusname, :itemname, :price, :qty, :cusid, :item_id)";
	@Modifying
	@Transactional
	@Query(value=query,nativeQuery = true)
	void insertOrder( @Param("cusname")String cusname,@Param("cusid") int cusid, @Param("itemname") String itemname,@Param("qty") int qty,@Param("item_id")int item_id,@Param("price") int price);

	

}
