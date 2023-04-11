package com.groupeisi.dao;

import javax.ejb.Stateless;

import com.groupeisi.entities.Cours;
import com.groupeisi.interfaces.ICours;

@Stateless
public class CoursImpl extends RepositoryImpl<Cours> implements ICours {

}
