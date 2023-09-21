package com.bullantus.farseeer.dataAccess;

import java.util.Optional;

import com.bullantus.farseeer.dataAccess.base.IBaseRepository;
import com.bullantus.farseeer.entities.User;

public interface IUserDal extends IBaseRepository<User> {

	public Optional<User> getByEmail(String email);
}
