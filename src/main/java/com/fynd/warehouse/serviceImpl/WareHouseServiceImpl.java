package com.fynd.warehouse.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fynd.warehouse.dao.WareHouseDao;
import com.fynd.warehouse.dto.Rack;
import com.fynd.warehouse.service.WareHouseService;

@Service
public class WareHouseServiceImpl implements WareHouseService{
	
	@Autowired
	private WareHouseDao wareHouseDao;

	@Override
	public Rack[] createRack(int rack) {
		// TODO Auto-generated method stub
		return wareHouseDao.createWareHouse(rack);
	}

	@Override
	public Rack[] storeProduct(String product, String productColor) {
		// TODO Auto-generated method stub
		return wareHouseDao.storeProd(product,productColor);
	}


	@Override
	public Rack[] sellProduct(int sellItemFromRack) {
		// TODO Auto-generated method stub
		return wareHouseDao.sellProduct(sellItemFromRack);
	}

	@Override
	public Rack[] getProductInRack() {
		// TODO Auto-generated method stub
		return wareHouseDao.getAllProduct();
	}

	@Override
	public List<Long> getProductWithColor(String color) {
		// TODO Auto-generated method stub
		return wareHouseDao.getProductWithColor(color);
	}

	@Override
	public List<Integer> getSlotFromColor(String color) {
		// TODO Auto-generated method stub
		return wareHouseDao.getSlotFromColor(color);
	}

	@Override
	public List<Integer> getSlotFromProductCode(Long productName) {
		// TODO Auto-generated method stub
		return wareHouseDao.getSlotFromProductCode(productName);
	}

}
