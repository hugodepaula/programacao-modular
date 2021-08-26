package com.javacodegeeks.patterns.factorymethodpattern;

public class ErrorXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new ErrorXMLParser();
	}

}
