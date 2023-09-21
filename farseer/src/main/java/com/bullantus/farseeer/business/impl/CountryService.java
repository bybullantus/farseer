package com.bullantus.farseeer.business.impl;

import org.springframework.stereotype.Service;

import com.bullantus.farseeer.business.ICountryService;
import com.bullantus.farseeer.business.base.GenericService;
import com.bullantus.farseeer.dataAccess.ICountryDal;
import com.bullantus.farseeer.entities.Country;

@Service
public class CountryService extends GenericService<Country, ICountryDal> implements ICountryService {

}
