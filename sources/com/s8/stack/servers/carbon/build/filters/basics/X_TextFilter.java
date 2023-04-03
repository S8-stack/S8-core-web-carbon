package com.s8.stack.servers.carbon.build.filters.basics;

import com.s8.io.xml.annotations.XML_Type;
import com.s8.stack.servers.carbon.assets.WebAsset;
import com.s8.stack.servers.carbon.assets.basics.X_TextWebAsset;
import com.s8.stack.servers.carbon.build.CarbonBuildContext;


/** svg-filter */
@XML_Type(name="x-filter")
public class X_TextFilter extends BasicWebAssetFilter {

	@Override
	public WebAsset createAsset(CarbonBuildContext ctx) {
		return new X_TextWebAsset(ctx.getContainer(), 
				ctx.getWebPathname(), 
				ctx.getLocalPath(),
				cacheControl, fragmentLength);
	}
	
	@Override
	public String[] expose(String webPathname) {
		return new String[]{ webPathname };
	}
}