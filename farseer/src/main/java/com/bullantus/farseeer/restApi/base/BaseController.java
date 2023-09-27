package com.bullantus.farseeer.restApi.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.bullantus.farseeer.business.base.IBaseService;
import com.bullantus.farseeer.entities.base.BaseEntity;

public abstract class BaseController<T extends IBaseService> {

	@Autowired
	protected T service;
}
