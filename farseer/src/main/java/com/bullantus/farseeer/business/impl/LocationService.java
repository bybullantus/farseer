package com.bullantus.farseeer.business.impl;

import org.springframework.stereotype.Service;

import com.bullantus.farseeer.business.ILocationService;
import com.bullantus.farseeer.business.base.GenericService;
import com.bullantus.farseeer.dataAccess.ILocationDal;
import com.bullantus.farseeer.entities.Location;

@Service
public class LocationService extends GenericService<Location, ILocationDal> implements ILocationService{

}
