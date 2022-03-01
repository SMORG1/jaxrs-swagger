package com.demo.jaxrs.swagger.order;

import java.util.*;

import javax.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

   private int orderId;
   private int orderCustomerId;
   private String orderNumber;
   private List<OrderItem> orderItems;
   private Date timeOrderPlaced;

}
