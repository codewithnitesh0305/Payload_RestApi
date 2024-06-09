package com.springboot.Service;

import java.util.List;

import com.springboot.Entity.Payload;

public interface PayloadService {

	public Payload savePayload(Payload payload);
	public Payload updatePayload(Payload payload);
	public void deletePayload(int id);
	public List<Payload> getAllPayload();
	public Payload getPayloadById(int id);
	public boolean checkId(int id);
	public Payload getPayloadByShipperId(String shipperId);
}
