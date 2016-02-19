package org.fugerit.java.core.util.format;

import java.util.Locale;

public class NumberFormatHelper {

	public String formatNumberWithSpace( Number n ) {
		String result = String.format(Locale.US, "%,d", n).replaceAll( "," , " " );
		return result;
	}
	
}
