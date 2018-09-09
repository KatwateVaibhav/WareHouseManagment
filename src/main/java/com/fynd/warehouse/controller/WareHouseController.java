package com.fynd.warehouse.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fynd.warehouse.dto.Rack;
import com.fynd.warehouse.service.WareHouseService;

@RestController
public class WareHouseController {

	private static final Logger log = LoggerFactory.getLogger(WareHouseController.class);

	@Autowired
	private WareHouseService wareHouseService;

	@RequestMapping(value = "/createWareHouse/{racks}", method = RequestMethod.POST)
	public Rack[] createWareHouse(@PathVariable int racks) {

		return wareHouseService.createRack(racks);

	}

	@RequestMapping(value = "/storeProduct/{productName}/{productColor}", method = RequestMethod.POST)
	public Rack[] storeProductInRack(@PathVariable String productName, @PathVariable String productColor) {

		return wareHouseService.storeProduct(productName,productColor);

	}

	@RequestMapping(value = "/sellProduct/{sellItemFromRack}", method = RequestMethod.POST)
	public Rack[] sellProductInRack(@PathVariable int sellItemFromRack) {

		return wareHouseService.sellProduct(sellItemFromRack);

	}
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public Rack[] getProductInRack() {

		return wareHouseService.getProductInRack();

	}
	@RequestMapping(value = "/getProductFromColor/{color}", method = RequestMethod.GET)
	public List<Long> getProductWithColor(@PathVariable String color) {

		return wareHouseService.getProductWithColor(color);

	}
	
	@RequestMapping(value = "/getSlotFromColor/{color}", method = RequestMethod.GET)
	public List<Integer> getSlotFromColor(@PathVariable String color) {

		return wareHouseService.getSlotFromColor(color);

	}
	
	@RequestMapping(value = "/getSlotFromProductCode/{productCode}", method = RequestMethod.GET)
	public List<Integer> getSlotFromProductCode(@PathVariable Long productCode) {

		return wareHouseService.getSlotFromProductCode(productCode);

	}

}	
