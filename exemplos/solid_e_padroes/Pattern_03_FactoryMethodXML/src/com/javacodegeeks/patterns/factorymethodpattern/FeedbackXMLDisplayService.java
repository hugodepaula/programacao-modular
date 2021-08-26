package com.javacodegeeks.patterns.factorymethodpattern;

public class FeedbackXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new FeedbackXML();
	}

}