package ihc.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

import ihc.components.CourseHealth;
import ihc.components.CourseHumanities;
import ihc.components.Header;

public class HealthView extends VerticalLayout implements View {
	public HealthView() {
		final VerticalLayout rootLayout = new VerticalLayout();

		rootLayout.setWidth(30, Sizeable.Unit.CM);
		addComponent(rootLayout);
		setComponentAlignment(rootLayout, Alignment.TOP_CENTER);

		Header header = new Header();
		rootLayout.addComponent(header);
		CourseHealth course = new CourseHealth();
		rootLayout.addComponent(course);

		rootLayout.setExpandRatio(header, 1);
		rootLayout.setExpandRatio(course, 9);

	}

	@Override
	public void enter (ViewChangeListener.ViewChangeEvent event){
		Notification.show("Bem vindo à página de Saúde.");
	}

}
