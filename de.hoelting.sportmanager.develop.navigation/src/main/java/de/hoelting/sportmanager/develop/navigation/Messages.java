package de.hoelting.sportmanager.develop.navigation;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.hoelting.sportmanager.develop.navigation.messages"; //$NON-NLS-1$
	public static String TreeContent_breakdown;
	public static String TreeContent_defaultLabel;
	public static String TreeContent_masterData;
	public static String TreeContent_Planing;
	public static String TreeContent_report;
	public static String TreeContent_root;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
