package com.s8.stack.servers.carbon.build.pointers.bundles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.s8.io.xml.annotations.XML_SetElement;
import com.s8.io.xml.annotations.XML_Type;
import com.s8.stack.servers.carbon.assets.WebAsset;
import com.s8.stack.servers.carbon.assets.basics.JS_WebAsset;
import com.s8.stack.servers.carbon.assets.bundles.JS_BundleWebAsset;
import com.s8.stack.servers.carbon.build.CarbonBuildContext;
import com.s8.stack.servers.carbon.build.pointers.WebAssetPointer;
import com.s8.stack.servers.carbon.build.pointers.basics.JS_Builder;

@XML_Type(name = "js-bundle", sub= {})
public class JS_BundleBuilder extends WebAssetPointer {
	
	private List<JS_Builder> sources;

	private String name;
	
	@XML_SetElement(tag = "name")
	public void setName(String name) {
		this.name =name;
	}
	
	@XML_SetElement(tag = "item")
	public void appendSource(JS_Builder builder) {
		sources.add(builder);
	}
	
	public JS_BundleBuilder() {
		super();
		fragmentLength = 8192;
		this.sources = new ArrayList<>();
	}
	
	@Override
	public WebAsset build(CarbonBuildContext context) throws IOException {
		List<JS_WebAsset> assets = new ArrayList<>();
		JS_WebAsset jsAsset;
		for(JS_Builder builder : sources) {
			jsAsset = (JS_WebAsset) builder.build(context);
			context.getUpdater().appendWatched(jsAsset.getPath(), jsAsset);
			assets.add(jsAsset);
		}
		
		String webPathname = context.getWebPathname()+name;
				
		JS_BundleWebAsset bundleAsset = new JS_BundleWebAsset(context.getContainer(),
				webPathname, 
				cacheControl, 
				fragmentLength, 
				assets);
		
		context.getContainer().appendAsset(webPathname, bundleAsset);
		
		return bundleAsset;
	}
	
	
}