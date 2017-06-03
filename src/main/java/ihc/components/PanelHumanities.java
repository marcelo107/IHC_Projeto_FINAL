package ihc.components;

import com.vaadin.server.Sizeable;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;

public class PanelHumanities extends HorizontalLayout {
	public PanelHumanities() {
		setMargin(false);
        setWidth(30, Sizeable.Unit.CM);
        final ListSelect<String> coursesList = new ListSelect<String>("Cursos de humanas.");
        coursesList.setItems("Filosofia", "Geografia", "História", "Letras Inglês", "Pedagogia");
        coursesList.setRows(10);
        addComponent(coursesList);
        setExpandRatio(coursesList, 25);
        final Label label = new Label("Aqui vem o texto.");
        addComponent(label);
        setExpandRatio(label, 55);
        Survey survey = new Survey();
        addComponent(survey);
        setExpandRatio(survey, 20);
//        final TextArea courseData = new TextArea();
//        course.addComponent(courseData);
	}
}
