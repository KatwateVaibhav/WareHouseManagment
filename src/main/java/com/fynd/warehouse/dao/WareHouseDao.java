package com.fynd.warehouse.dao;

import java.util.List;

import com.fynd.warehouse.dto.Rack;


public interface WareHouseDao {
	public Rack[] createWareHouse(int rack);

	public Rack[] storeProd(String product, String productColor);

	public Rack[] sellProduct(int sellItemFromRack);

	public Rack[] getAllProduct();

	public List<Long> getProductWithColor(String color);

	public List<Integer> getSlotFromColor(String color);

	public List<Integer> getSlotFromProductCode(Long productCode);

}
