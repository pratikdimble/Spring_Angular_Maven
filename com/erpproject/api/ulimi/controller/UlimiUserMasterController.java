
package com.erpproject.api.ulimi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.erpproject.api.ulimi.dto.DueDateSchedularDTO;
import com.erpproject.api.ulimi.dto.UlimiUserMasterDTO;
import com.erpproject.api.ulimi.service.IUlimiMasterService;
import com.erpproject.common.ICommonConstants;
import com.erpproject.common.IError;
import com.erpproject.common.Response;


/**
 * @author Pratik
 *
 */

@RestController
@SuppressWarnings({ "rawtypes", "unchecked" })
@RequestMapping(value = "/ulimi")
@Configuration
@EnableScheduling
public class UlimiUserMasterController implements ICommonConstants, IError {
	
	@Autowired
	IUlimiMasterService ulimiService;
	
	/*@Autowired
	AsynchronousService asynchronousService;*/
	
	@RequestMapping(value = "/createUlimiUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response createUlimiUser(
			@RequestBody UlimiUserMasterDTO ulimiUserMasterDTO) {
		Response<UlimiUserMasterDTO, Integer> response = null;
		try
		{
			response=ulimiService.createUlimiUser(ulimiUserMasterDTO);
			return response;
		}
	catch (Exception e)
		{
			e.printStackTrace();
			return new Response(ERROR, ERR_500, ERR_500_MESSAGE, null, null);
		}
	}	///*************createClockOutTimeTracker close
	
	
	@RequestMapping(value = "/checkLoginDetails", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response checkLoginDetails(
			@RequestBody UlimiUserMasterDTO ulimiUserMasterDTO) {
		Response<UlimiUserMasterDTO, Integer> response = null;
		try
		{
			response=ulimiService.checkLoginDetails(ulimiUserMasterDTO);
			return response;
		}
	catch (Exception e)
		{
			e.printStackTrace();
			return new Response(ERROR, ERR_500, ERR_500_MESSAGE, null, null);
		}
	}	///*************checkLoginDetails close
	
	
	@RequestMapping(value = "/createClockInTimeTracker", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response createClockInTimeTracker(
			@RequestBody UlimiUserMasterDTO ulimiUserMasterDTO) {
		Response<UlimiUserMasterDTO, Integer> response = null;
		try
		{

			response=ulimiService.createClockInTimeTracker(ulimiUserMasterDTO);
			return response;
		}
	catch (Exception e)
		{
			e.printStackTrace();
			return new Response(ERROR, ERR_500, ERR_500_MESSAGE, null, null);
		}
	}	///*************createClockInTimeTracker close
	
	@RequestMapping(value = "/createClockOutTimeTracker", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response createClockOutTimeTracker(
			@RequestBody UlimiUserMasterDTO ulimiUserMasterDTO) {
		Response<UlimiUserMasterDTO, Integer> response = null;
		try
		{
//			scheduleTaskUsingCronExpression();
			response=ulimiService.createClockOutTimeTracker(ulimiUserMasterDTO);
			return response;
		}
	catch (Exception e)
		{
			e.printStackTrace();
			return new Response(ERROR, ERR_500, ERR_500_MESSAGE, null, null);
		}
	}	///*************createClockOutTimeTracker close
	

/*	@Scheduled(cron = "0 50 11 * * ?")
    public void scheduleTaskUsingCronExpression() {
        System.out.println("Run Job " + new Date());
        System.out.println("P is running");
        ulimiService.getUserId(39);
    }*/

@RequestMapping(value = "/getUserId/{vendorId}", method = RequestMethod.GET)
	public @ResponseBody Response getUserId(
			@PathVariable (value = "vendorId") Integer vendorId) {
		Response<DueDateSchedularDTO, Integer> response = null;
		try
		{
//			scheduleTaskUsingCronExpression();
			response=ulimiService.getUserId(vendorId);
			return response;
		}
	catch (Exception e)
		{
			e.printStackTrace();
			return new Response(ERROR, ERR_500, ERR_500_MESSAGE, null, null);
		}
	}	///*************createClockInTimeTracker close



}//controller close
