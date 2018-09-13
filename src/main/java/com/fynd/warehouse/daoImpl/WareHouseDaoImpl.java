package com.fynd.warehouse.daoImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.fynd.warehouse.dao.WareHouseDao;
import com.fynd.warehouse.dto.Rack;
import com.fynd.warehouse.exception.RackFullException;
import com.fynd.warehouse.main.WareHouseHelper;

@Repository
public class WareHouseDaoImpl implements WareHouseDao {
	public static Rack[] arrRacks;;

	@Override
	public Rack[] createWareHouse(int count) {
		return readNumsFromCommandLine(count);
	}

	public static Rack[] readNumsFromCommandLine(int rackNumbers) {

		arrRacks = new Rack[rackNumbers];
		System.out.println("Created a warehouse with " + arrRacks.length + " slots");
		System.out.println("Racks created " + arrRacks.toString());
		return arrRacks;
	}

	@Override
	public Rack[] storeProd(String product,String productColor) {
		// TODO Auto-generated method stub
		boolean isRackEmpty= false;
		for (int i = 0; i < arrRacks.length; i++) {
			if (arrRacks[i] == null) {
				System.out.println("The value at " + i + " is empty");
				arrRacks[i] = new Rack(i, WareHouseHelper.getNext(), product, productColor);
				isRackEmpty =true;
				break;
			}
		}
		if (!isRackEmpty){
			throw new RackFullException("Rack is full !!");
		}
		return arrRacks;
	}

	
	@Override
	public Rack[] sellProduct(int sellItemFromRack) {
		
		System.out.println("Slot no "+ sellItemFromRack + "free");
		 arrRacks[sellItemFromRack] = null;
		 return arrRacks;
	}

	@Override
	public Rack[] getAllProduct() {
		// TODO Auto-generated method stub
		System.out.println("Get all elements in Rack" + arrRacks);
		return arrRacks;
	}

	@Override
	public List<Long> getProductWithColor(String color) {
		
		List<Rack> arrayToList = Arrays.asList(arrRacks);
		List<Rack> result = arrayToList.stream().filter(x -> x!=null).collect(Collectors.toList());
		//List<Rack> rackList =result.stream().filter(c -> c.getProductColor().equals(color)).collect(Collectors.toList());
		List<Long> listProductCode = result.stream().filter(c -> c.getProductColor().equals(color)).map(d -> d.getProductCode()).collect(Collectors.toList());
		return listProductCode;
	}

	@Override
	public List<Integer> getSlotFromColor(String color) {
		List<Rack> arrayToList = Arrays.asList(arrRacks);
		List<Rack> result = arrayToList.stream().filter(x -> x!=null).collect(Collectors.toList());
		List<Integer> listSlotNo = result.stream().filter(c -> c.getProductColor().equals(color)).map(d -> d.getSlotNo()).collect(Collectors.toList());
		return listSlotNo;
	}

	@Override
	public List<Integer> getSlotFromProductCode(Long productCode) {
		List<Rack> arrayToList = Arrays.asList(arrRacks);
		List<Rack> result = arrayToList.stream().filter(x -> x!=null).collect(Collectors.toList());
		List<Integer> SlotNo = result.stream().filter(c -> c.getProductCode() == productCode).map(d -> d.getSlotNo()).collect(Collectors.toList());
		return SlotNo;
	}
}
