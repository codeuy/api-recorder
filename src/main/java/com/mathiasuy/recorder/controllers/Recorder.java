package com.mathiasuy.recorder.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mathiasuy.recorder.requests.StartRequest;
import com.mathiasuy.recorder.responses.StartResponse;
import com.mathiasuy.recorder.responses.StateResponse;
import com.mathiasuy.recorder.responses.StopResponse;
import com.mathiasuy.recorder.services.RecorderServices;

@RestController
public class Recorder {

	RecorderServices recorderServices;
	
	@PostMapping("/start")
	public StartResponse start(StartRequest startRequest) {
		return recorderServices.start(startRequest.getNameFile(), startRequest.getUrl());
	}

	@GetMapping("/stop")
	public StopResponse stop(@RequestParam Integer id) {
		return recorderServices.stop(id);
	}

	@GetMapping("/list")
	public List<StateResponse> list() {
		return new ArrayList<>(recorderServices.state().values());
	}

	@GetMapping("/state")
	public StateResponse state(Integer id) {
		Map<Integer, StateResponse> states = recorderServices.state();
		if (!states.containsKey(id)) {
			throw new RuntimeException();
		}
		return states.get(id);
	}
	
}
