package api.tistech.controllers;

import api.tistech.security.AccountCredentials;
import api.tistech.security.JWTLoginFilter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

@RestController
@Api
@RequestMapping("")
public class Exercise9Controller {

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna a lista"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	
	@RequestMapping(value = "/exercise9", method = RequestMethod.GET, produces="application/json")
	public Exercise9 getExercise9() {
		return new Exercise9() ;
	}
}
