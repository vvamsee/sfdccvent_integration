package com.appshark.beans;

public class Test {

	public static void main(String[] args) {
		String url = "https://storage.googleapis.com/gaepdffiles/SSPPDF(8).pdf";
		String recordId = "a0O11000006ph47";
		String jsonString = "{\"lstArtWorkFileWrap\": [{\"strArtWorkUrl\": \""+url+"\",\"strRecordId\": \""+recordId+"\"}]}";
		System.out.println(jsonString);
	}

}
