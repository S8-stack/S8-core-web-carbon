package com.s8.stack.servers.carbon.build.pointers.folder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.s8.io.xml.annotations.XML_SetAttribute;
import com.s8.io.xml.annotations.XML_SetElement;
import com.s8.io.xml.annotations.XML_Type;
import com.s8.stack.servers.carbon.assets.WebAsset;
import com.s8.stack.servers.carbon.build.CarbonBuildContext;
import com.s8.stack.servers.carbon.build.pointers.WebAssetPointer;

@XML_Type(name = "folder")
public class Folder extends WebAssetPointer {
	
	private String pathname;
	
	@XML_SetAttribute(name = "path")
	public void setPathname(String pathname) {
		this.pathname = pathname;
	}
	
	
	private List<WebAssetPointer> builders;
	
	@XML_SetElement(tag = "builder")
	public void addBuilder(WebAssetPointer builder) {
		builders.add(builder);
	}
	
	
	public Folder() {
		super();
		builders = new ArrayList<>();
	}

	@Override
	public WebAsset build(CarbonBuildContext context) throws IOException {
		context = context.move(pathname);
		
		for(WebAssetPointer builder : builders) {
			builder.build(context);
		}
		
		return null;
	}

}
