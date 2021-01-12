package com.razer.java;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Strings;
import com.sun.jna.Structure;
import com.sun.jna.WString;

public class JAppInfoType extends Structure implements Structure.ByValue {
	public WString title = new WString(Strings.repeat("\0", 256)); //TCHAR Title[256];
	public WString description = new WString(Strings.repeat("\0", 1024)); //TCHAR Description[1024];
	public WString authorName = new WString(Strings.repeat("\0", 256)); //TCHAR Name[256];
	public WString authorContact = new WString(Strings.repeat("\0", 256)); //TCHAR Contact[256];
    public int supportedDevice; //DWORD SupportedDevice;
    public int category; //DWORD Category;
    
    private static WString setField(WString field, String val) {
    	int len = field.length();
    	if (val.length() > len) {
    		return field;
    	}
    	String result = val;
    	if (val.length() != len) {
    		result += Strings.repeat("\0", len - val.length());
    	}
    	return new WString(result);
    }
    
    public void setTitle(String val) {
    	title = setField(title, val);
    }
    public void setDescription(String val) {
    	description = setField(description, val);
    }
    public void setAuthorName(String val) {
    	authorName = setField(authorName, val);
    }
    public void setAuthorContact(String val) {
    	authorContact = setField(authorContact, val);
    }
    
    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("title", "description", "authorName", "authorContact", "supportedDevice", "category");
    }
}
