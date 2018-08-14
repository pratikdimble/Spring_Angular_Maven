package com.erpproject.api.ulimi.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.dozer.DozerBeanMapper;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.erpproject.api.ulimi.dto.DueDateSchedularDTO;
import com.erpproject.api.ulimi.dto.UlimiUserMasterDTO;
import com.erpproject.api.ulimi.model.UlimiUser;
import com.erpproject.api.ulimi.model.UlimiUserMaster;
import com.erpproject.common.ICommonConstants;
import com.erpproject.common.IError;
import com.erpproject.common.Response;


/**
 * @author Pratik
 *
 */
@Repository
@Transactional
@SuppressWarnings({ "rawtypes", "unchecked" })
public class UlimiMasterDAOImpl implements IUlimiMasterDAO, ICommonConstants, IError {
	@Autowired
	private SessionFactory session;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@Override
	public Response createUlimiUser(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException {
		try {
			UlimiUser ulimiUser  = mapper.map(ulimiUserMasterDTO, UlimiUser.class, "ulimiUserDTO_to_ulimiUser");
			if(ulimiUser!=null) {
				Long ulimiUserIdCount = (Long) session.openSession().createCriteria(UlimiUser.class, "ulimi")
						.add(Restrictions.eq("ulimi.userName", ulimiUserMasterDTO.getUserName()))
						.setProjection(Projections.rowCount()).uniqueResult();
				if(ulimiUserIdCount ==0) {
					ulimiUser.setIsActive(ACTIVE);
					ulimiUser.setCreatedDate(new Date().getTime());
					session.getCurrentSession().save(ulimiUser);
					return new Response(SUCCESS, SUCCESS_200,USER_CREATE_SUCCESS, null, null);
				}else {
					return new Response(ERROR, ERR_500,USER_NAME_EXITS1, null, null);
				}
			}
			else {
				return new Response(ERROR, ERR_500, USER_NAME_EXITS1, null, null);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return new Response(ERROR, ERR_500, ERR_500_MESSAGE, null, null);
		}
	}
	@Override
	public Response createClockInTimeTracker(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException {
		try {
			UlimiUserMaster ulimiUserMaster = mapper.map(ulimiUserMasterDTO, UlimiUserMaster.class, "ulimiUserMasterDTO_to_ulimiUserMaster");
			if(ulimiUserMaster!=null) {
				ulimiUserMaster.setIsDeleted(NO);
					session.getCurrentSession().save(ulimiUserMaster);
						return new Response(SUCCESS, SUCCESS_200,"Clock In Time Created...", null, null);
					}
				else {
				return new Response(ERROR, ERR_500, COMMON_ERROR, null, null);
				}
			} catch (Exception e) {
				e.printStackTrace();
				return new Response(ERROR, ERR_500, ERR_500_MESSAGE, null, null);
				}
		}

	@Override
	public Response createClockOutTimeTracker(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException {
		try {
			UlimiUserMaster ulimiUserMaster = mapper.map(ulimiUserMasterDTO, UlimiUserMaster.class, "ulimiUserMasterDTO_to_ulimiUserMaster");
			if(ulimiUserMaster!=null) {
				Long ulimiUserIdCount = (Long) session.openSession().createCriteria(UlimiUserMaster.class, "ulimi")
						.add(Restrictions.eq("ulimi.ulimiUserMasterId",ulimiUserMaster.getUlimiUserMasterId()))
						.setProjection(Projections.rowCount()).uniqueResult();
				if(ulimiUserIdCount ==1) {
						session.getCurrentSession().update(ulimiUserMaster);
						
						Date date1=new Date(ulimiUserMaster.getClockIn());
							SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							String dateStart = format1.format(date1);
				        Date date2=new Date(ulimiUserMaster.getClockOut());
							SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							String dateStop = format2.format(date2);

							long diff = date2.getTime() - date1.getTime();
							long diffMinutes = diff / (60 * 1000) % 60;
							long diffHours = diff / (60 * 60 * 1000);
						System.out.print("Today You Worked-> "+diffHours+"."+diffMinutes+" Hours...");
					return new Response(SUCCESS, SUCCESS_200,"Today You Worked-> "+diffHours+"."+diffMinutes+" Hours...", null, null);
				}else {
					return new Response(ERROR, ERR_500,COMMON_ERROR, null, null);
				}
			}
			else {
				return new Response(ERROR, ERR_500, ERR_500_MESSAGE, null, null);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return new Response(ERROR, ERR_500, ERR_500_MESSAGE, null, null);
		}
	}
	
	@Override
	public Response checkLoginDetails(UlimiUserMasterDTO ulimiUserMasterDTO) throws ApplicationException {
		try {
			UlimiUser ulimiUser  = mapper.map(ulimiUserMasterDTO, UlimiUser.class, "ulimiUserDTO_to_ulimiUser");
			Long ulimiUserIdCount;
			Long ulimiNameCount;
			Long ulimiPasswordCount;
			if(ulimiUser!=null) {
				ulimiUserIdCount = (Long) session.openSession().createCriteria(UlimiUser.class, "ulimi")
						.add(Restrictions.and(Restrictions.eq("ulimi.userName", ulimiUser.getUserName()),
								Restrictions.eq("ulimi.password", ulimiUser.getPassword())))
						.setProjection(Projections.rowCount()).uniqueResult();
				
				ulimiNameCount = (Long) session.openSession().createCriteria(UlimiUser.class, "ulimi")
						.add(Restrictions.and(Restrictions.eq("ulimi.userName", ulimiUser.getUserName()),
								Restrictions.ne("ulimi.password", ulimiUser.getPassword())))
						.setProjection(Projections.rowCount()).uniqueResult();
				ulimiPasswordCount = (Long) session.openSession().createCriteria(UlimiUser.class, "ulimi")
						.add(Restrictions.and(Restrictions.ne("ulimi.userName", ulimiUser.getUserName()),
								Restrictions.eq("ulimi.password", ulimiUser.getPassword())))
						.setProjection(Projections.rowCount()).uniqueResult();
				
				System.out.println(ulimiNameCount);
				System.out.println(ulimiPasswordCount);
				
//				return new Response(SUCCESS, SUCCESS_200,LOGIN_SUCCESS, null, null);
				/*if(ulimiUserIdCount ==1) {
					ulimiUserMasterDTO = (UlimiUserMasterDTO) session.getCurrentSession()
							.getNamedQuery("GET_USER_DETAILS")
							.setString("userName", ulimiUser.getUserName())
							.setString("password", ulimiUser.getPassword())
							.setCharacter("isActive",ACTIVE)
							.setResultTransformer(Transformers.aliasToBean(UlimiUserMasterDTO.class))
							.uniqueResult();
					return new Response(SUCCESS, SUCCESS_200,LOGIN_SUCCESS, null, ulimiUserMasterDTO);
				}else {
					return new Response(ERROR, ERR_500,LOGIN_USERNAME_ERROR, null, null);
				}*/
			}
			else {
				return new Response(ERROR, ERR_500, LOGIN_FAIL, null, null);
			}
			
			if(ulimiUserIdCount==1){
				ulimiUserMasterDTO = (UlimiUserMasterDTO) session.getCurrentSession()
						.getNamedQuery("GET_USER_DETAILS")
						.setString("userName", ulimiUser.getUserName())
						.setString("password", ulimiUser.getPassword())
						.setCharacter("isActive",ACTIVE)
						.setResultTransformer(Transformers.aliasToBean(UlimiUserMasterDTO.class))
						.uniqueResult();
				return new Response(SUCCESS, SUCCESS_200,LOGIN_SUCCESS, null, ulimiUserMasterDTO);
			}else if(ulimiNameCount==1){
				return new Response(ERROR, ERR_500,LOGIN_PASSWORD_ERROR, null, null);
			}
			else if(ulimiNameCount==0){
				System.out.println("Password  Incorrect");
				return new Response(ERROR, ERR_500,LOGIN_USERNAME_ERROR, null, null);
			}
			else{
				return new Response(ERROR, ERR_500, LOGIN_FAIL, null, null);
			}
	
		} catch (Exception e) {
			e.printStackTrace();
			return new Response(ERROR, ERR_500, LOGIN_FAIL, null, null);
		}
	}
	
	@Override
	public Response getUserId(Integer vendorId) throws ApplicationException {
		try {
			
				List<DueDateSchedularDTO> list = session
						.getCurrentSession()
						.getNamedQuery("GET_USER_ID_BY_SCHEDULE_DATE")
						.setInteger("vendorId", vendorId)
						.setResultTransformer(Transformers.aliasToBean(DueDateSchedularDTO.class)).list();

						List<String> mailAddressTo= new ArrayList<String>();
							for (DueDateSchedularDTO temp : list) {
									mailAddressTo.add(temp.getEmailId());
							}
							
							String smtpHostServer = "smtp.example.com";
						    String emailID = "email_me@example.com";
						    final String username = "email.demoeracal@gmail.com"; // Admin Email
							final String password = "email5678"; // Admin Password

							InternetAddress[] mailAddress_TO = new InternetAddress[mailAddressTo.size()];
						
							for (int i = 0; i < mailAddressTo.size(); i++) {
								mailAddress_TO[i] = new InternetAddress(mailAddressTo.get(i));
							}
							Properties props = new Properties();
							props.put("mail.smtp.auth", "true");
							props.put("mail.smtp.starttls.enable", "true");
							props.put("mail.smtp.host", "smtp.gmail.com"); // for smtp credinshital
							props.put("mail.smtp.port", "587"); // for smtp credinshital
							Session session = Session.getInstance(props,
									  new javax.mail.Authenticator() {
										protected PasswordAuthentication getPasswordAuthentication() {
											return new PasswordAuthentication(username, password);
										}
									  });
							
							String newline =System.getProperty("line.separator"); 
							String message=" Dear Ma’am/Sir,"+newline+""
										+ " A very good day to you!"+newline+""
										+ " Did you forget to keep sufficient balance in your bank? "
							 			+ "These days, with so much going on, it is easy to let something slip. "
							 			+ "We are yet to receive your current/previous month’s installment. "
							 			+ "So, please clear your payment today to avoid penal charges. "
							 			+ "And, if it is already on its way to us."	+newline+""
							 			+ " kindly accept our sincere thanks."; 
							
							 MimeMessage msg = new MimeMessage(session);
						      //set message headers
						      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
						      msg.addHeader("format", "flowed");
						      msg.addHeader("Content-Transfer-Encoding", "8bit");
						      msg.setFrom(new InternetAddress("email.demoeracal@gmail.com", "NoReply"));
						      msg.setReplyTo(InternetAddress.parse("no_reply@eracal.com", false));
						      msg.setSubject("We’re waiting for your FINAL PAYMENT ", "UTF-8");
						      msg.setText(message, "UTF-8");

						      	msg.setSentDate(new Date());
						        msg.setRecipients(Message.RecipientType.TO,mailAddress_TO);
						      Transport.send(msg);  
						    System.out.println("Mail Has Been Sent to "+mailAddressTo.size()+" Recipients...");
						    return new Response(SUCCESS, SUCCESS_200, "SUCCESS", list, null);

		} catch (Exception e) {
			e.printStackTrace();
			return new Response(ERROR, ERR_500, ERR_500_MESSAGE, null, null);
		}
	}
}
