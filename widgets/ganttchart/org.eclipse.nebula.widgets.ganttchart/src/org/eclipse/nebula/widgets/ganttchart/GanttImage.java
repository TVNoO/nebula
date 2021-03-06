/*******************************************************************************
 * Copyright (c) Emil Crumhorn - Hexapixel.com - emil.crumhorn@gmail.com
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    emil.crumhorn@gmail.com - initial API and implementation
 *******************************************************************************/

package org.eclipse.nebula.widgets.ganttchart;

import java.util.Calendar;

import org.eclipse.swt.graphics.Image;

/**
 * Convenience class for creating an image in the chart instead of using the constructors in GanttEvent. 
 */
public class GanttImage extends GanttEvent {

	/**
	 * {@inheritDoc)
	 */
	public GanttImage(final GanttChart parent, final String name, final Calendar date, final Image picture) {
		super(parent, name, date, picture);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public GanttImage(final GanttChart parent, final Object data, final String name, final Calendar date, final Image picture) {
		super(parent, data, name, date, picture);
	}
}
