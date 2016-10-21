package ecommerce.yash_webapp_01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ecommerce.yash_webapp_01.dao.ProductDao;

import ecommerce.yash_webapp_01.model.*;

public class ProductController {
	@Autowired
	ProductDao proDao;
@Bean
	@RequestMapping(value = { "/product/get" })
	@ResponseBody
	List<ProductModel> view() {
		return proDao.getAll();
	}

}