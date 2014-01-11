/*
 * This file is part of LinkJVM.
 *
 * Java Framework for the KIPR Link
 * Copyright (C) 2013 Markus Klein<m@mklein.co.at>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package linkjvm.high.sensors.buttons;

import linkjvm.low.buttons.ExtraButtons;

public class ButtonController {	
	/**
	 * 
	 */
	public static void showExtraButtons(){
		ExtraButtons.show();
	}
	
	/**
	 * 
	 */
	public static void hideExtraButtons(){
		ExtraButtons.hide();
	}
	
	/**
	 * 
	 * @return
	 */
	public static boolean getExtraButtonsShown(){
		return ExtraButtons.isShown();
	}
	
	/**
	 * @param shown
	 */
	public static void setExtraButtonsDhown(boolean shown){
		ExtraButtons.setShown(shown);
	}
	
}
