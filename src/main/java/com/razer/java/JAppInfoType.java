package com.razer.java;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

public class JAppInfoType extends Structure implements Structure.ByReference {
	public char[] title = new char[256]; //TCHAR Title[256];
	public char[] description = new char[1024]; //TCHAR Description[1024];
	public char[] authorName = new char[256]; //TCHAR Name[256];
	public char[] authorContact = new char[256]; //TCHAR Contact[256];
    public int supportedDevice; //DWORD SupportedDevice;
    public int category; //DWORD Category;
    
    private static void setField(char[] field, String val) {
    	if (val.length() > field.length) {
    		return;
    	}    	
    	for (int i = 0; i < val.length(); ++i) {
    		field[i] = val.charAt(i);
    	}
    	for (int i = val.length(); i < field.length; ++i) {
    		field[i] = 0;
    	}
    }
    
    public void setTitle(String val) {
    	setField(title, val);
    }
    public void setDescription(String val) {
    	setField(description, val);
    }
    public void setAuthorName(String val) {
    	setField(authorName, val);
    }
    public void setAuthorContact(String val) {
    	setField(authorContact, val);
    }
    
    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("title", "description", "authorName", "authorContact", "supportedDevice", "category");
    }
}
