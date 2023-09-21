package com.bullantus.farseeer.business.impl;

import org.springframework.stereotype.Service;

import com.bullantus.farseeer.business.IRegionService;
import com.bullantus.farseeer.business.base.GenericService;
import com.bullantus.farseeer.dataAccess.IRegionDal;
import com.bullantus.farseeer.entities.Region;

@Service
public class RegionService extends GenericService<Region, IRegionDal> implements IRegionService {

}
