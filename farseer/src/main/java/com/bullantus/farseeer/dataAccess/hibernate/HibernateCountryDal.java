package com.bullantus.farseeer.dataAccess.hibernate;

import org.springframework.stereotype.Repository;

import com.bullantus.farseeer.dataAccess.ICountryDal;
import com.bullantus.farseeer.dataAccess.base.GenericRepository;
import com.bullantus.farseeer.entities.Country;

@Repository
public class HibernateCountryDal  extends GenericRepository<Country> implements ICountryDal{

}
