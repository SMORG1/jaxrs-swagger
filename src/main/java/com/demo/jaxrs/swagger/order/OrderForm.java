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
public class OrderForm {

   private int customerId;
   private List<OrderItem> orderItems;

}
