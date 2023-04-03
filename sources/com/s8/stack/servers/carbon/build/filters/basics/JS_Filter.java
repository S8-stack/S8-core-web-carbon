package com.s8.stack.servers.carbon.build.filters.basics;

import com.s8.io.xml.annotations.XML_Type;
import com.s8.stack.servers.carbon.assets.WebAsset;
import com.s8.stack.servers.carbon.assets.basics.JS_WebAsset;
import com.s8.stack.servers.carbon.build.CarbonBuildContext;


@XML_Type(name="js-filter")	
public class JS_Filter extends BasicWebAssetFilter {


	@Override
	public WebAsset createAsset(CarbonBuildContext ctx) {
		return new JS_WebAsset(ctx.getContainer(), ctx.getWebPathname(), ctx.getLocalPath(), 
				cacheControl, fragmentLength);
	}
	
	
	@Override
	public String[] expose(String webPathname) {
		// String abbreviated = webPathname.substring(0, webPathname.length()-3);
		//return new String[]{ webPathname, abbreviated};
		
		return new String[]{ webPathname };
	}
	
}