package ihc.components;

import java.util.Set;

import com.vaadin.data.HasValue;
import com.vaadin.data.HasValue.ValueChangeEvent;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.Notification;

import ihc.MyUI;

public class PanelHealth extends HorizontalLayout {
	public PanelHealth() {
		setMargin(false);
        setWidth(30, Sizeable.Unit.CM);
        final ListSelect<String> coursesList = new ListSelect<String>("Cursos de saúde.");
        coursesList.setItems("Enfermagem", "Farmácia", "Odontologia", "Medicina", "Psicologia", "Veterinária");
        coursesList.setRows(10);
        addComponent(coursesList);
        setExpandRatio(coursesList, 25);
        InfoHealth infoHealth = new InfoHealth();
        addComponent(infoHealth);
        setExpandRatio(infoHealth, 55);
        Survey survey = new Survey();
        addComponent(survey);
        setExpandRatio(survey, 20);
        coursesList.addValueChangeListener(new HasValue.ValueChangeListener<Set<String>>() {

            @Override
            public void valueChange(ValueChangeEvent<Set<String>> event) {
                    	Notification note = new Notification("Funcionalidade ainda não implementada!", 
                    			"Em breve essa funcionalidade estará disponível.", 
                    			Notification.Type.WARNING_MESSAGE);
                    	note.show(MyUI.getCurrent().getPage());
            }    
        });

	}
}
