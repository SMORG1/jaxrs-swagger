package com.demo.jaxrs.swagger.order;

import java.util.*;

public class DefaultOrderService implements OrderService {

	public Order getOrder(int orderId) throws Exception {
		Order order = null;
		if (orderId == 1) {
			List<OrderItem> orderItems = new ArrayList<OrderItem>();
			orderItems.add(new OrderItem(1, 1, 15.44, true));
			orderItems.add(new OrderItem(2, 2, 2.39, true));
			order = new Order(1, 1, "A123", orderItems, new Date(System.currentTimeMillis()));
		} else if (orderId == 2) {
			List<OrderItem> orderItems = new ArrayList<OrderItem>();
			orderItems.add(new OrderItem(3, 3, 4.44, false));
			orderItems.add(new OrderItem(4, 1, 15.44, true));
			order = new Order(2, 2, "A124", orderItems, new Date(System.currentTimeMillis()));
		} else if (orderId == 3) {
			List<OrderItem> orderItems = new ArrayList<OrderItem>();
			orderItems.add(new OrderItem(5, 2, 2.39, true));
			orderItems.add(new OrderItem(6, 3, 4.44, false));
			order = new Order(3, 2, "A125", orderItems, new Date(System.currentTimeMillis()));
		}

		return order;
	}

	public List<Order> getAllOrders() throws Exception {
		List<Order> orders = new ArrayList<Order>();
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		orderItems.add(new OrderItem(1, 1, 15.44, true));
		orderItems.add(new OrderItem(2, 2, 2.39, true));
		orders.add(new Order(1, 1, "A123", orderItems, new Date(System.currentTimeMillis())));
		List<OrderItem> orderItems2 = new ArrayList<OrderItem>();
		orderItems2.add(new OrderItem(3, 3, 4.44, false));
		orderItems2.add(new OrderItem(4, 1, 15.44, true));
		orders.add(new Order(2, 2, "A124", orderItems2, new Date(System.currentTimeMillis())));
		List<OrderItem> orderItems3 = new ArrayList<OrderItem>();
		orderItems3.add(new OrderItem(5, 2, 2.39, true));
		orderItems3.add(new OrderItem(6, 3, 4.44, false));
		orders.add(new Order(3, 2, "A125", orderItems3, new Date(System.currentTimeMillis())));
		return orders;
	}

	public Order submitOrder(int customerId, List<OrderItem> orderItems, Date timeOrderPlaced) {
		List<OrderItem> orderItemsRet = new ArrayList<OrderItem>();
		orderItemsRet.add(new OrderItem(1, 1, 15.44, true));
		orderItemsRet.add(new OrderItem(2, 2, 2.39, true));
		return new Order(1, 1, "A123", orderItemsRet, timeOrderPlaced);
	}

}
