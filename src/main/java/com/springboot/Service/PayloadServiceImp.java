package com.springboot.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.CustomeException.BusinessException;
import com.springboot.CustomeException.EmptyInputFieldException;
import com.springboot.CustomeException.EmptyListException;
import com.springboot.Entity.Payload;
import com.springboot.Repository.PayloadRepository;

@Service
public class PayloadServiceImp implements PayloadService{
	
	@Autowired
	private PayloadRepository repository;
	
	//Save the pay load information
	@Override
	public Payload savePayload(Payload payload) {
		// TODO Auto-generated method stub
		if (payload.getLoadingPoint().isEmpty() || payload.getLoadingPoint().length() == 0
				|| payload.getUnloadingPoint().isEmpty() || payload.getUnloadingPoint().length() == 0
				|| payload.getProductType().isEmpty() || payload.getProductType().length() == 0
				|| payload.getTruckType().isEmpty() || payload.getTruckType().length() == 0
				|| payload.getComment().isEmpty() || payload.getComment().length() == 0) {

			throw new EmptyInputFieldException("601", "Input Field is Empty");
		}
		payload.setShipperId(UUID.randomUUID().toString());
		payload.setDate(LocalDate.now());
		return repository.save(payload);
	}

	@Override
	public Payload updatePayload(Payload payload) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePayload(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Payload> getAllPayload() {
		// TODO Auto-generated method stub
		List<Payload> getAllPayload = repository.findAll();
		if(getAllPayload.isEmpty()) {
			throw new EmptyListException("603", "No data found");
		}
		return getAllPayload;
	}
	
	@Override
	public boolean checkId(int id) {
		// TODO Auto-generated method stub
		boolean checkId = repository.existsById(id);
		return checkId;
	}

	@Override
	public Payload getPayloadById(int id) {
		// TODO Auto-generated method stub
		if(checkId(id) == false) {
			throw new BusinessException("602", "Id does not exist");
		}
		return repository.findPayloadById(id);
	}

	

}