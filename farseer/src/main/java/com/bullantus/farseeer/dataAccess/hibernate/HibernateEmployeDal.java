package com.bullantus.farseeer.dataAccess.hibernate;

import org.springframework.stereotype.Repository;

import com.bullantus.farseeer.dataAccess.IEmployeDal;
import com.bullantus.farseeer.dataAccess.base.GenericRepository;
import com.bullantus.farseeer.entities.Employe;

@Repository
public class HibernateEmployeDal extends GenericRepository<Employe> implements IEmployeDal {

}
