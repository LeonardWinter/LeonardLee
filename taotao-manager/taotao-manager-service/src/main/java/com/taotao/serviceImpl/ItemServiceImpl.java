package com.taotao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.service.ItemService;
/**
 * 商品管理service
 * @author Leonard Lee
 *
 */
@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(long itemID) {
		TbItem item = itemMapper.selectByPrimaryKey(itemID);
//		TbItemExample example = new TbItemExample();
//		//添加查询条件
//		Criteria criteria = example.createCriteria();
//		criteria.andIdEqualTo(itemID);
//		List<TbItem> list = itemMapper.selectByExample(example);
//		if(list != null && list.size() > 0){
//			TbItem item2 = list.get(0);
//			return item2;
//		}
		return item;
	}
	

}
