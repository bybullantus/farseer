package com.bullantus.farseeer.business;

import java.io.IOException;

import com.bullantus.farseeer.business.base.IBaseService;
import com.bullantus.farseeer.entities.User;
import com.bullantus.farseeer.entities.dto.AuthRequest;
import com.bullantus.farseeer.entities.dto.AuthResponse;
import com.bullantus.farseeer.entities.dto.RegisterRequest;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public interface IAuthenticationService extends IBaseService<User> {

	public AuthResponse register(RegisterRequest request) ;
	
	public AuthResponse authenticate(AuthRequest request);
	public void refreshToken(
	          HttpServletRequest request,
	          HttpServletResponse response
	  ) throws IOException;
}
