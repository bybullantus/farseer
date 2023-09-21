package com.bullantus.farseeer.business.impl;

import org.springframework.stereotype.Service;

import com.bullantus.farseeer.business.IJobHistoryService;
import com.bullantus.farseeer.business.base.GenericService;
import com.bullantus.farseeer.dataAccess.IJobHistoryDal;
import com.bullantus.farseeer.entities.JobHistory;

@Service
public class JobHistoryService extends GenericService<JobHistory, IJobHistoryDal> implements IJobHistoryService{

}
