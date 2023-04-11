package com.groupeisi.dao;

import javax.ejb.Stateless;

import com.groupeisi.entities.Student;
import com.groupeisi.interfaces.IStudent;

@Stateless
public class StudentImpl extends RepositoryImpl<Student> implements IStudent {

}
