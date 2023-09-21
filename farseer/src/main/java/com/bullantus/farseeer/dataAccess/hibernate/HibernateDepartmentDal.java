package com.bullantus.farseeer.dataAccess.hibernate;

import org.springframework.stereotype.Repository;

import com.bullantus.farseeer.dataAccess.IDepartmentDal;
import com.bullantus.farseeer.dataAccess.base.GenericRepository;
import com.bullantus.farseeer.entities.Department;

@Repository
public class HibernateDepartmentDal extends GenericRepository<Department> implements IDepartmentDal{

}
