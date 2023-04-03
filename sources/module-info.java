/**
 * 
 */
/**
 * @author pierreconvert
 *
 */
module com.s8.web.carbon {


	/* <carbon> */
	exports com.s8.web.carbon.assets;
	
	exports com.s8.web.carbon.build;

	exports com.s8.web.carbon.build.pointers;
	exports com.s8.web.carbon.build.pointers.basics;
	exports com.s8.web.carbon.build.pointers.bundles;
	exports com.s8.web.carbon.build.pointers.folder;
		
	exports com.s8.web.carbon.build.filters;
	exports com.s8.web.carbon.build.filters.basics;
	
	exports com.s8.web.carbon.build.sources;

	exports com.s8.web.carbon.web;
	/* </carbon> */

	
	
	requires transitive com.s8.io.bytes;
	requires transitive com.s8.io.xml;
	requires transitive com.s8.io.csv;
	
	requires transitive com.s8.arch.silicon;
	requires transitive com.s8.web.helium;
	requires transitive com.s8.arch.magnesium;
	
}