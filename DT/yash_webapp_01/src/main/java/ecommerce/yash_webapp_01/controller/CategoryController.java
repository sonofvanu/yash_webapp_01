package ecommerce.yash_webapp_01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ecommerce.yash_webapp_01.dao.CategoryDao;
import ecommerce.yash_webapp_01.model.CategoryModel;

@Controller
@RequestMapping("/admin")
public class CategoryController {
	@Autowired
	CategoryDao catDao;
	@Bean
	@RequestMapping(value = { "/registration/get" })
	@ResponseBody
	List<CategoryModel> view() {
		return catDao.getAll();
	}
}
