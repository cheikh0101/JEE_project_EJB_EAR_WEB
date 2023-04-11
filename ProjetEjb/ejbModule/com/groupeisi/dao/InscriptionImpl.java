package com.groupeisi.dao;

import javax.ejb.Stateless;

import com.groupeisi.entities.Inscription;
import com.groupeisi.interfaces.IInscription;

@Stateless
public class InscriptionImpl extends RepositoryImpl<Inscription> implements IInscription {

}
