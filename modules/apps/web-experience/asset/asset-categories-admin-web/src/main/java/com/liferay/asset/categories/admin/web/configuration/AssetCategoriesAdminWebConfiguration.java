/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.asset.categories.admin.web.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

/**
 * @author Pavel Savinov
 */
@ExtendedObjectClassDefinition(category = "web-experience")
@Meta.OCD(
	id = "com.liferay.asset.categories.admin.web.configuration.AssetCategoriesAdminWebConfiguration",
	localization = "content/Language",
	name = "asset.categories.admin.web.configuration.name"
)
public interface AssetCategoriesAdminWebConfiguration {

	/**
	 * Set this to <code>true</code> to enable the asset categories tree to
	 * display as a flattened tree.
	 *
	 * @return <code>true</code> if the asset categories tree is displayed as a
	 * flattened tree; <code>false</code> otherwise
	 */
	@Meta.AD(
		deflt = "false",
		description = "flattened.navigation.allowed.description",
		required = false
	)
	public boolean flattenedNavigationAllowed();

}