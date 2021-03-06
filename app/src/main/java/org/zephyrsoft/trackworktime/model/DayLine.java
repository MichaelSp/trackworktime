/*
 * This file is part of TrackWorkTime (TWT).
 * 
 * TWT is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * TWT is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with TWT. If not, see <http://www.gnu.org/licenses/>.
 */
package org.zephyrsoft.trackworktime.model;

import hirondelle.date4j.DateTime;

import org.zephyrsoft.trackworktime.timer.TimeCalculator;

/**
 * One day's worth of interpreted events.
 * 
 * @see TimeCalculator
 * @author Mathis Dirksen-Thedens
 */
public class DayLine {

	private DateTime timeIn = null;
	private DateTime timeOut = null;
	private TimeSum timeWorked = new TimeSum();
	private TimeSum timeFlexi = new TimeSum();

	public DateTime getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(DateTime timeIn) {
		this.timeIn = timeIn;
	}

	public DateTime getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(DateTime timeOut) {
		this.timeOut = timeOut;
	}

	public TimeSum getTimeWorked() {
		return timeWorked;
	}

	public void setTimeWorked(TimeSum timeWorked) {
		this.timeWorked = timeWorked;
	}

	public TimeSum getTimeFlexi() {
		return timeFlexi;
	}

	public void setTimeFlexi(TimeSum timeFlexi) {
		this.timeFlexi = timeFlexi;
	}

}
