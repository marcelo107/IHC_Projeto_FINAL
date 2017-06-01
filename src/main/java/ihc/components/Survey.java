package ihc.components;

import com.vaadin.ui.CheckBox;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;

public class Survey  extends VerticalLayout {
	public Survey() {
        setMargin(false);
        
        TextArea question1 = new TextArea();
        question1.setValue("Questão 1: Em qual área você pretende cursar?");
        addComponent(question1);
        
        CheckBox check1Question1 = new CheckBox();
        check1Question1.setCaption("Exatas");
        CheckBox check2Question1 = new CheckBox();
        check2Question1.setCaption("Humanas");
        CheckBox check3Question1 = new CheckBox();
        check3Question1.setCaption("Saúde");
        addComponents(check1Question1, check2Question1, check3Question1);
        
        TextArea question2 = new TextArea();
        question2.setValue("Questão 2: Você já qual área profissional você irá trabalhar?");
        CheckBox check1Question2 = new CheckBox();
        check1Question2.setCaption("Sim");
        CheckBox check2Question2 = new CheckBox();
        check2Question2.setCaption("Não");
        
        addComponent(question2);
        addComponents(check1Question2, check2Question2);
	}
}
