package com.erpproject.common;

public class MailInfo
	{
		private boolean isMail;
		private String mailId;
		
		public MailInfo(){
			
		}
		public MailInfo(boolean isMail, String mailId)
			{
				super();
				this.isMail = isMail;
				this.mailId = mailId;
			}

		public boolean isMail()
			{
				return isMail;
			}
		public void setMail(boolean isMail)
			{
				this.isMail = isMail;
			}
		public String getMailId()
			{
				return mailId;
			}
		public void setMailId(String mailId)
			{
				this.mailId = mailId;
			}
	}
