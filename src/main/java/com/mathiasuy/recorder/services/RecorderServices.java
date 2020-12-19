package com.mathiasuy.recorder.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.mathiasuy.recorder.model.RecorderData;
import com.mathiasuy.recorder.responses.StartResponse;
import com.mathiasuy.recorder.responses.StateResponse;
import com.mathiasuy.recorder.responses.StopResponse;

@Service
public class RecorderServices {

	Map<Integer, RecorderData> recordersData = new HashMap<Integer, RecorderData>();
	
	public StartResponse start(String nameFile, String url) {
		RecorderData recorderData = new RecorderData();
		recorderData.setNameFile(nameFile);
		recorderData.setUrl(url);
		recordersData.put(recorderData.getId(), recorderData);
		StartResponse startResponse = new StartResponse();
		startResponse.setId(recorderData.getId());
		startResponse.setMessage(recorderData.getMessage());
		recorderData.record();
		System.out.println(recorderData.getMessage());
		return startResponse;
	}

	public StopResponse stop(Integer id) {
		
		if (!recordersData.containsKey(id)) {
			throw new RuntimeException();
		}
		
		RecorderData recorderData = recordersData.get(id);
		recorderData.stop();
		
		System.out.println(recorderData.getMessage());

		StopResponse stopResponse = new StopResponse();
		stopResponse.setNameFile(recorderData.getNameFile());
		stopResponse.setMessage(recorderData.getMessage());
		return null;
		
	}	

	public Map<Integer, StateResponse> state() {		
		Map<Integer, StateResponse> statesResponses = new HashMap<>();
		for (Entry<Integer, RecorderData> item : recordersData.entrySet()) {
			statesResponses.put(item.getKey(), item.getValue().getState());
			System.out.println(item.getValue().toString());
		}
		return statesResponses;
	}
	
}
