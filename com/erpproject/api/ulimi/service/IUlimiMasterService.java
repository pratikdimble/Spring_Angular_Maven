package com.erpproject.api.ulimi.service;

import org.omg.CORBA.portable.ApplicationException;

import com.erpproject.api.ulimi.dto.UlimiUserMasterDTO;
import com.erpproject.common.Response;
/**
 * @author Pratik
 *
 */
public interface IUlimiMasterService {
	public Response createUlimiUser(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException;
	public Response createClockInTimeTracker(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException;
	public Response createClockOutTimeTracker(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException;
	public Response getUserId(Integer vendorId) throws ApplicationException;
	public Response checkLoginDetails(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException;
}
