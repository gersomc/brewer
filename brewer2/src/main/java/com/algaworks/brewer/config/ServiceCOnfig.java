package com.algaworks.brewer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import service.CadastroCervejaService;
import storage.FotoStorage;
import storage.local.FotoStorageLocal;

@Configuration
@ComponentScan(basePackageClasses = CadastroCervejaService.class)
public class ServiceCOnfig {

	@Bean 
	public FotoStorage fotoStorage() {
		return new FotoStorageLocal();
	}
}
