package com.satya.request;

import lombok.Data;

@Data
public class updateCartItemRequest 
{
	private Long cartItemId;
	private int quantity;
}
