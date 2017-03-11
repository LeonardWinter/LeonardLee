package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
/**
 * 商品管理Controller
 * @author Leonard Lee
 *
 */
@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemID}")
	public TbItem getItemByID(@PathVariable Long itemID){
		TbItem item = itemService.getItemById(itemID);
		return item;
	}

}
