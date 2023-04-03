package com.s8.stack.servers.carbon.build.pointers.basics;

import java.io.IOException;
import java.nio.file.Path;

import com.s8.io.xml.annotations.XML_SetValue;
import com.s8.io.xml.annotations.XML_Type;
import com.s8.stack.servers.carbon.assets.CachePolicy;
import com.s8.stack.servers.carbon.assets.WebAsset;
import com.s8.stack.servers.carbon.build.CarbonBuildContext;
import com.s8.stack.servers.carbon.build.pointers.WebAssetPointer;
import com.s8.stack.servers.carbon.web.AssetContainerModule;

@XML_Type(name = "basic", sub= {
		HTML_Pointer.class,
		CSS_Pointer.class,
		JS_Builder.class,
		JSON_Builder.class,
		PNG_Builder.class,
		JPG_Pointer.class,
		SVG_Builder.class
})
public abstract class BasicWebAssetPointer extends WebAssetPointer {


	protected String relativePathname;

	@XML_SetValue
	public void setPathname(String pathname) {
		this.relativePathname = pathname;
	}
	
	@Override
	public WebAsset build(CarbonBuildContext context) throws IOException {
		
		// path
		String webPathname = context.getWebPathname().concat(relativePathname);
		Path path = context.getLocalPath().resolve(relativePathname);
		
		WebAsset asset = createAsset(context.getContainer(), webPathname, path, cacheControl, fragmentLength);
		
		context.getContainer().appendAsset(webPathname, asset);
		
		return asset;
	}
	
	
	/**
	 * 
	 * @param module
	 * @param webPathname
	 * @param path
	 * @param policy
	 * @param fragmentLength
	 * @return
	 */
	public abstract WebAsset createAsset(AssetContainerModule container, String webPathname, Path path, 
			CachePolicy policy, int fragmentLength);

}