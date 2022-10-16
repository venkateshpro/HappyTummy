package com.HappyTummy.App.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HappyTummy.App.Model.Item;

public interface Itemrepository  extends JpaRepository <Item,Integer>  {

}
