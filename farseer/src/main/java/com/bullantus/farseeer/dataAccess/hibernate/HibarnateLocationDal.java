package com.bullantus.farseeer.dataAccess.hibernate;

import org.springframework.stereotype.Repository;

import com.bullantus.farseeer.dataAccess.ILocationDal;
import com.bullantus.farseeer.dataAccess.base.GenericRepository;
import com.bullantus.farseeer.entities.Location;

@Repository
public class HibarnateLocationDal extends GenericRepository<Location> implements ILocationDal {

}
