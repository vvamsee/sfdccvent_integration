package com.appshark.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.appshark.beans.ServiceResponse;

@Controller
@RequestMapping("/cvent")
public class CventDataSyncController {
	
	/**
	 * uploadFilesToCloudDataStore method
	 * @param gMultiPartData
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/datasync", method = RequestMethod.POST,produces="application/json")
	@ResponseBody
	public ServiceResponse uploadFilesToCloudDataStore() {
		ServiceResponse serviceResponse = new ServiceResponse();
		serviceResponse.setStatusCode("200");
		serviceResponse.setStatusMessage("SUCCESS");
		return serviceResponse;
	}
}
