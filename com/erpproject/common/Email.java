package com.erpproject.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public class Email {
	private String from;
	private String to;
	private String cc;
	private String bcc;
	private String subject;
	private String text;
	private Map<String, Object> contextMap;
	private ArrayList<MultipartFile> inlineImages = new ArrayList<MultipartFile>();
	private List<MultipartFile> attatchments;
	private String templateUri;
	private String template;
	private int fileArraySize;
	
	public Email() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Email(String to,String cc,String bcc, String subject,String text) {
		super();
		this.to = to;
		this.cc = cc;
		this.bcc = bcc;
		this.text = text;
		this.subject = subject;
	}


	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getBcc() {
		return bcc;
	}
	public void setBcc(String bcc) {
		this.bcc = bcc;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Map<String, Object> getContextMap() {
		return contextMap;
	}
	public void setContextMap(Map<String, Object> contextMap) {
		this.contextMap = contextMap;
	}
	public List<MultipartFile> getInlineImages() {
		return inlineImages;
	}
	public void setInlineImages(ArrayList<MultipartFile> inlineImages) {
		this.inlineImages = inlineImages;
	}
	public String getTemplateUri() {
		return templateUri;
	}
	public void setTemplateUri(String templateUri) {
		this.templateUri = templateUri;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}

	public int getFileArraySize() {
		return fileArraySize;
	}

	public void setFileArraySize(int fileArraySize) {
		this.fileArraySize = fileArraySize;
	}
	public List<MultipartFile> getAttatchments() {
		return attatchments;
	}
	public void setAttatchments(List<MultipartFile> attatchments) {
		this.attatchments = attatchments;
	}
}
