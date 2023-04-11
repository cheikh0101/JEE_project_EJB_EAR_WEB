package com.groupeisi.interfaces;

import javax.ejb.Local;

import com.groupeisi.entities.Student;

@Local
public interface IStudent extends IRepository<Student> {

}
