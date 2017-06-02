package ihc.components;

import java.util.Set;

import com.vaadin.data.HasValue;
import com.vaadin.data.HasValue.ValueChangeEvent;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;

/**
 * Created by falbuquerque on 01/06/17.
 */
public class CourseExacts extends HorizontalLayout{
    public CourseExacts() {
        setMargin(false);
        setWidth(30, Sizeable.Unit.CM);
        final ListSelect<String> coursesList = new ListSelect<String>("Cursos de exatas.");
        coursesList.setItems("Agronomia", "Engenharia de Computação", "Engenharia de Software", "Física", "Matemática", "Química");
        coursesList.setRows(10);
        addComponent(coursesList);
        setExpandRatio(coursesList, 25);
        final Label label = new Label("Aqui vem o texto.");
        addComponent(label);
        setExpandRatio(label, 55);
        Survey survey = new Survey();
        addComponent(survey);
        setExpandRatio(survey, 20);
        coursesList.addValueChangeListener(new HasValue.ValueChangeListener<Set<String>>() {
			
			@Override
			public void valueChange(ValueChangeEvent<Set<String>> event) {
				final Set<String> options = (Set<String>) coursesList.getValue();
				for(String option : options){
					if(option.equals("Agronomia")){
						final Label newLabel = new Label("O curso de Agronomia...");
						replaceComponent(label, newLabel);
					}
				}
				
			}
		});
//        final TextArea courseData = new TextArea();
//        course.addComponent(courseData);
    }


}
