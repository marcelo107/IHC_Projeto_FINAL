package ihc.components;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Set;

import com.vaadin.data.HasValue;
import com.vaadin.data.HasValue.ValueChangeEvent;
import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.Notification;

import ihc.MyUI;

/**
 * Created by falbuquerque on 01/06/17.
 */
public class PanelExacts extends HorizontalLayout{
    public PanelExacts() {
        setMargin(false);
        setWidth(30, Unit.CM);
        final ListSelect<String> coursesList = new ListSelect<String>("Cursos de exatas.");
        coursesList.setItems("Agronomia", "Engenharia de Computação", "Engenharia de Software", "Física", "Matemática", "Química");
        coursesList.setRows(10);
        addComponent(coursesList);
        setExpandRatio(coursesList, 25);
        InfoExacts infoExacts = new InfoExacts();
        addComponent(infoExacts);
        setExpandRatio(infoExacts, 55);
        Survey survey = new Survey();
        addComponent(survey);
        setExpandRatio(survey, 20);
        coursesList.addValueChangeListener(new HasValue.ValueChangeListener<Set<String>>() {

            @Override
            public void valueChange(ValueChangeEvent<Set<String>> event) {
                Set<String> options = (Set<String>) coursesList.getValue();
                for(String option : options){
                    if(option.equals("Agronomia")){
                        final InfoAgronomia newInfo = new InfoAgronomia();
                        replaceComponent(infoExacts, newInfo);
                    }
                    else {
//                        final Label newInfo = new Label("O curso ainda não possui informações.");
//                        replaceComponent(infoExacts, newInfo);
                    	Notification note = new Notification("Funcionalidade ainda não implementada!", 
                    			"Em breve essa funcionalidade estará disponível.", 
                    			Notification.Type.WARNING_MESSAGE);
                    	note.show(MyUI.getCurrent().getPage());
                    }
                    coursesList.clear();
                }
            }
        });
    }
}
