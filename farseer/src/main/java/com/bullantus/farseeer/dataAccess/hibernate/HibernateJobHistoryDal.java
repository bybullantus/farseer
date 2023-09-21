package com.bullantus.farseeer.dataAccess.hibernate;

import org.springframework.stereotype.Repository;

import com.bullantus.farseeer.dataAccess.IJobHistoryDal;
import com.bullantus.farseeer.dataAccess.base.GenericRepository;
import com.bullantus.farseeer.entities.JobHistory;

@Repository
public class HibernateJobHistoryDal extends GenericRepository<JobHistory> implements IJobHistoryDal{

}
