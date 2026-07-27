package com.algaworks.brewer.controller.page;

import org.springframework.data.domain.Page;

public class PageWrapper<T> {

	private Page<T> page;

	public PageWrapper(Page<T> page) {
		this.page = page;
	}
}
