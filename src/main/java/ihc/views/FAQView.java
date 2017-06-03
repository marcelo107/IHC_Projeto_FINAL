package ihc.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;
import ihc.components.Header;
import ihc.components.PanelFAQ;
import ihc.components.PanelHumanities;

public class FAQView extends VerticalLayout implements View{
	public FAQView() {
		final VerticalLayout rootLayout = new VerticalLayout();

		rootLayout.setWidth(30, Unit.CM);
		addComponent(rootLayout);
		setComponentAlignment(rootLayout, Alignment.TOP_CENTER);

		Header header = new Header();
		rootLayout.addComponent(header);
		PanelFAQ panelFAQ = new PanelFAQ();
		rootLayout.addComponent(panelFAQ);

		rootLayout.setExpandRatio(header, 1);
		rootLayout.setExpandRatio(panelFAQ, 9);

	}

	@Override
	public void enter (ViewChangeListener.ViewChangeEvent event){
		Notification.show("Bem vindo à página FAQ.");
	}
}
