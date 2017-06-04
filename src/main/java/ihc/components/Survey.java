package ihc.components;

import com.vaadin.ui.*;

public class Survey  extends VerticalLayout {
	public Survey() {
        setMargin(false);
        
        TextArea question1 = new TextArea();
        question1.setValue("Questão 1: Em qual área você pretende cursar?");
        addComponent(question1);
        RadioButtonGroup<String> answer1 = new RadioButtonGroup<String>();
        answer1.setItems("Exatas", "Humanas", "Saúde");
        addComponent(answer1);
        Button acceptQuestion1 = new Button("Enviar resposta");
        addComponent(acceptQuestion1);

        TextArea question2 = new TextArea();
        question2.setValue("Questão 2: Você já qual área profissional você irá trabalhar?");
        addComponent(question2);
        RadioButtonGroup<String> answer2 = new RadioButtonGroup<String>();
        answer2.setItems("Sim", "Não");
        addComponent(answer2);
        Button acceptQuestion2 = new Button("Enviar resposta");
        addComponent(acceptQuestion2);
    }
}
