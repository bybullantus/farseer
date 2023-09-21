package com.bullantus.farseeer.business.impl;

import org.springframework.stereotype.Service;

import com.bullantus.farseeer.business.IEmployeService;
import com.bullantus.farseeer.business.base.GenericService;
import com.bullantus.farseeer.dataAccess.IEmployeDal;
import com.bullantus.farseeer.entities.Employe;

@Service
public class EmployeService extends GenericService<Employe, IEmployeDal> implements IEmployeService {

}
