package ihc.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

import ihc.components.Header;
import ihc.components.PanelExacts;
import ihc.components.PanelOnlineTests;

public class VocationalTestsView extends VerticalLayout implements View {
    public VocationalTestsView() {
        final VerticalLayout rootLayout = new VerticalLayout();

        rootLayout.setWidth(30, Sizeable.Unit.CM);
        addComponent(rootLayout);
        setComponentAlignment(rootLayout, Alignment.TOP_CENTER);

        Header header = new Header();
        rootLayout.addComponent(header);

//        final TextField name = new TextField();
//
//        Button button = new Button("Click Me");
//        button.addClickListener( e -> {
//            rootLayout.addComponent(new Label("Thanks " + name.getValue()
//                    + ", it works!"));
//        });

        PanelOnlineTests onlineTests = new PanelOnlineTests();
        rootLayout.addComponent(onlineTests);

        rootLayout.setExpandRatio(header, 1);
        rootLayout.setExpandRatio(onlineTests, 9);
        
    }

    @Override
    public void enter (ViewChangeListener.ViewChangeEvent event){
        Notification.show("Bem vindo à página de Testes Vocacionais.");
    }
}
