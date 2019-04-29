package com.propostaCredito.propostaCredito.app.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cadastro-proposta-credito")
public class CadastroPropostaCredito {
	
	@Resource
    private HttpServletRequest httpServletRequest;
    @Resource
    private HttpServletResponse httpServletResponse;	

    @ApiOperation(value="", notes="Método de cadastro da Proposta de Crédito")
    @ResponseBody
    @RequestMapping(value = "/cadastroProspostaCredito", method = RequestMethod.POST, produces = "application/json")
    
    public String cadastroPropostaCredito(@RequestParam(name = "nome", required = true) String nome) {
    	
    	return "michael";
    }
}
