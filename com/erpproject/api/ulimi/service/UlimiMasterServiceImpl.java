package com.erpproject.api.ulimi.service;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erpproject.api.ulimi.dao.IUlimiMasterDAO;
import com.erpproject.api.ulimi.dto.UlimiUserMasterDTO;
import com.erpproject.common.Response;
/**
 * @author Pratik
 *
 */
@Service
@SuppressWarnings({ "rawtypes", "unchecked" })
public class UlimiMasterServiceImpl implements IUlimiMasterService {
	@Autowired
	IUlimiMasterDAO ulimiMasterDAO;
	@Override
	public Response createUlimiUser(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException {
		return ulimiMasterDAO.createUlimiUser(ulimiUserMasterDTO);
	}
	@Override
	public Response createClockInTimeTracker(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException {
		return ulimiMasterDAO.createClockInTimeTracker(ulimiUserMasterDTO);
	}
	
	@Override
	public Response createClockOutTimeTracker(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException {
		return ulimiMasterDAO.createClockOutTimeTracker(ulimiUserMasterDTO);
	}
	 @Override
	public Response getUserId(Integer vendorId) throws ApplicationException {
		return ulimiMasterDAO.getUserId(vendorId);
	}
	 @Override
	public Response checkLoginDetails(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException {
		 return ulimiMasterDAO.checkLoginDetails(ulimiUserMasterDTO);
	}
}
