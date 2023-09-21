package com.bullantus.farseeer.business.impl;

import org.springframework.stereotype.Service;

import com.bullantus.farseeer.business.IJobService;
import com.bullantus.farseeer.business.base.GenericService;
import com.bullantus.farseeer.dataAccess.IJobDal;
import com.bullantus.farseeer.entities.Job;

@Service
public class JobService extends GenericService<Job, IJobDal> implements IJobService {

}
