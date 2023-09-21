package com.bullantus.farseeer.business.impl;

import org.springframework.stereotype.Service;

import com.bullantus.farseeer.business.IDepartmentService;
import com.bullantus.farseeer.business.base.GenericService;
import com.bullantus.farseeer.dataAccess.IDepartmentDal;
import com.bullantus.farseeer.entities.Department;

@Service
public class DepartmentService extends GenericService<Department, IDepartmentDal> implements IDepartmentService{

}
