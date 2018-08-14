package com.erpproject.api.ulimi.dao;

import org.omg.CORBA.portable.ApplicationException;

import com.erpproject.api.ulimi.dto.UlimiUserMasterDTO;
import com.erpproject.common.Response;

@SuppressWarnings("rawtypes")
public interface IUlimiMasterDAO {
	public Response createUlimiUser(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException;
	public Response createClockInTimeTracker(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException;
	public Response createClockOutTimeTracker(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException;
	public Response getUserId(Integer vendorId) throws ApplicationException;
	public Response checkLoginDetails(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException;
}
	