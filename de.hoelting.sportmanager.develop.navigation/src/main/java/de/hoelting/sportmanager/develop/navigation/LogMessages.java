package de.hoelting.sportmanager.develop.navigation;

import org.eclipse.osgi.util.NLS;

public class LogMessages extends NLS {
	private static final String BUNDLE_NAME = "de.hoelting.sportmanager.develop.navigation.log_messages"; //$NON-NLS-1$
	public static String DevelopNavigation_initUI;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, LogMessages.class);
	}

	private LogMessages() {
	}
}
