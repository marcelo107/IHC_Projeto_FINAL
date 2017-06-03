package ihc.components;

import java.util.Set;

import com.vaadin.data.HasValue;
import com.vaadin.data.HasValue.ValueChangeEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.Notification;

import ihc.MyUI;

public class PanelOnlineTests extends HorizontalLayout {
    public PanelOnlineTests() {
        setMargin(false);
        setWidth(30, Unit.CM);
        final ListSelect<String> onlineTests = new ListSelect<String>("Testes online.");
        onlineTests.setItems("Aptidão profissional", "Seu curso ideal", "Análise psicológica", "Sua carreira ideal",
        		"Qual o seu perfil?", "Outros");
        onlineTests.setRows(10);
        addComponent(onlineTests);
        setExpandRatio(onlineTests, 25);
        InfoOnlineTests infoOnlineTests = new InfoOnlineTests();
        addComponent(infoOnlineTests);
        setExpandRatio(infoOnlineTests, 55);
        Survey survey = new Survey();
        addComponent(survey);
        setExpandRatio(survey, 20);
        final InfoProfessionalAptitude newInfo = new InfoProfessionalAptitude();
        onlineTests.addValueChangeListener(new HasValue.ValueChangeListener<Set<String>>() {

            @Override
            public void valueChange(ValueChangeEvent<Set<String>> event) {
                Set<String> options = (Set<String>) onlineTests.getValue();
                for(String option : options){
                    if(option.equals("Aptidão profissional")){
                    	if(!components.contains(newInfo)){
                    		replaceComponent(infoOnlineTests, newInfo);
                    	}
                    }
                    else {
                    	Notification note = new Notification("Funcionalidade ainda não implementada!", 
                    			"Em breve essa funcionalidade estará disponível.", 
                    			Notification.Type.WARNING_MESSAGE);
                    	note.show(MyUI.getCurrent().getPage());
                    }
                    onlineTests.clear();
                }
            }
        });
    }
}
