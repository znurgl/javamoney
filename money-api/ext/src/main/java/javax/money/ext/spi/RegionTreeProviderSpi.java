/*
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE
 * CONDITION THAT YOU ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT.
 * PLEASE READ THE TERMS AND CONDITIONS OF THIS AGREEMENT CAREFULLY. BY
 * DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF THE
 * AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE"
 * BUTTON AT THE BOTTOM OF THIS PAGE. Specification: JSR-354 Money and Currency
 * API ("Specification") Copyright (c) 2012-2013, Credit Suisse All rights
 * reserved.
 */
package javax.money.ext.spi;

import java.util.Map;

import javax.money.ext.Region;
import javax.money.ext.RegionNode;

/**
 * Implementation of this interface define the regions supported in the system.
 * Each provider may hereby serve several region types.
 * 
 * @author Anatole Tresch
 */
public interface RegionTreeProviderSpi {

	/**
	 * Get the id of the forest provided by this provider.
	 * 
	 * @return
	 */
	public String getTreeId();

	/**
	 * Initialize the {@link RegionTreeProviderSpi} provider.
	 * 
	 * @param regionProviders
	 *            the region providers loaded, to be used for accessing
	 *            {@link Region} entries.
	 */
	public void init(Map<Class, RegionProviderSpi> regionProviders);

	/**
	 * Access a set of Region instances that are defined to be graph root
	 * regions, which are identifiable entry points into the region graph.
	 * 
	 * @return the root graph {@link Region}s defined by this spi, not null.
	 */
	public RegionNode getRegionTree();

}
