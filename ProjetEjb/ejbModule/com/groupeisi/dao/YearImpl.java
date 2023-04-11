package com.groupeisi.dao;

import javax.ejb.Stateless;

import com.groupeisi.entities.Year;
import com.groupeisi.interfaces.IYear;

@Stateless
public class YearImpl extends RepositoryImpl<Year> implements IYear {

}
