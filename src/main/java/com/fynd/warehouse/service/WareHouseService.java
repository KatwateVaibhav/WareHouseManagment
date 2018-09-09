package com.fynd.warehouse.service;

import java.util.List;

import com.fynd.warehouse.dto.Rack;

public interface WareHouseService {
	
	public Rack[] createRack(int rack);

	public Rack[] storeProduct(String productName, String productColor);

	public Rack[] sellProduct(int sellItemFromRack);

	public Rack[] getProductInRack();

	public List<Long> getProductWithColor(String color);

	public List<Integer> getSlotFromColor(String color);

	public List<Integer> getSlotFromProductCode(Long productName);

}
