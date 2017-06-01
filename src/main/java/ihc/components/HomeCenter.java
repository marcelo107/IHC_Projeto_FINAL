package ihc.components;

import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;

public class HomeCenter extends HorizontalLayout{
	public HomeCenter(){
		final Image carousel = new Image();
		setWidth(30, Sizeable.Unit.CM);
        carousel.setSource(new ThemeResource("./images/ImageTest.jpg"));
        addComponent(carousel);
        setExpandRatio(carousel, 80);
        setComponentAlignment(carousel, Alignment.MIDDLE_LEFT);
        Survey survey = new Survey();
        addComponent(survey);
        setExpandRatio(survey, 20);
	}
}
