 
package de.hoelting.sportmanager.develop.navigation;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public class DevelopNavigation {

	@Inject
	private Logger logger;

	private final Composite parent;


	@PostConstruct
	public void buildUI() {
		logger.info(LogMessages.DevelopNavigation_initUI);
		final FillLayout layout = new FillLayout();
		parent.setLayout(layout);
	
		TreeViewer tree = new TreeViewer(parent);
		tree.setContentProvider(new DevelopNavigationTreeContentProvider());
		tree.setInput(TreeContent.createTreeContent());
	}

	
	@Inject
	public DevelopNavigation(Composite parent) {
		// the following is standard SWT Stuff
		this.parent = parent;
	}
	
	
	
	@Focus
	public void onFocus() {
		//TODO Your code here
	}
	
}