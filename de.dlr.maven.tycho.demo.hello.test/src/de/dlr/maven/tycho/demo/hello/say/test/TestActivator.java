/**
 * Copyright (c) 2008-2018 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.dlr.maven.tycho.demo.hello.say.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Activator of test Fragment as central info hub, even though
 * Fragments do not have an OSGI/Equinox Activator such as a plugin
 */
public class TestActivator {

	/**
	 * Hidden construcotr of activator class
	 */
	private TestActivator() {
	}
	
	public static final String FRAGMENT_ID = "de.dlr.maven.tycho.demo.test";

	/**
	 * Method to access the fragments contents from the resource folder and to hand it back as string
	 * @param resourcePath the path to the resource starting with "resource/"
	 * @return the content of the resource as string
	 * @throws IOException throws
	 */
	public static InputStream getResourceContentAsString(String resourcePath) throws IOException {
		URL url;
		url = new URL("platform:/plugin/" + FRAGMENT_ID + resourcePath);
		InputStream inputStream = url.openConnection().getInputStream();

		return inputStream;
	}
}