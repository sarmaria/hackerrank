package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
   private Furniture f;
	private HashMap<Furniture, Integer> orders;
	
	

	public FurnitureOrder() {
		orders = new HashMap<>();
	}

	public void addFurniture(Furniture f, int count) {
		
		if(orders.get(f)==null)
			orders.put(f,count);
		else {
			orders.put(f, orders.get(f)+count);
		}
			
		
	}

	public HashMap<Furniture, Integer> getOrderedFurniture() {
		
		return orders;
	}

	public int getTypeCount(Furniture f) {
		
		return orders.get(f);
	}

	public float getTypeCost(Furniture f) {
		Integer n = orders.get(f);
		if(n!=null) {
			return n*f.cost();
		}
		return 0;
	}

	public float getTotalOrderCost() {
		int totalCost = 0;
		Set<Entry<Furniture, Integer>> orderSet = orders.entrySet();
		for(Entry<Furniture, Integer> e : orderSet ) {
			totalCost += e.getKey().cost() * e.getValue();
		}
		
		return totalCost;
	}

	public int getTotalOderQuantity() {
		int totalCount = 0;
		Set<Entry<Furniture, Integer>> orderSet = orders.entrySet();
		for(Entry<Furniture, Integer> e : orderSet ) {
			totalCount += e.getValue();
		}
		return totalCount;
	}
	
	
}
