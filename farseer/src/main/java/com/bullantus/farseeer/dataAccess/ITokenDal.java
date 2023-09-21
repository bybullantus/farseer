package com.bullantus.farseeer.dataAccess;

import java.util.List;
import java.util.Optional;

import com.bullantus.farseeer.dataAccess.base.IBaseRepository;
import com.bullantus.farseeer.entities.Token;

public interface ITokenDal extends IBaseRepository<Token> {

	  List<Token> getTokenbyUserId(Long id);

	  Optional< Token> getByToken(String token);
}
