package ihc;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

import javax.servlet.annotation.WebServlet;


@Theme("mytheme")
public class Exact extends VerticalLayout implements View {
    public Exact() {
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

        Course course = new Course();
        rootLayout.addComponent(course);

        rootLayout.setExpandRatio(header, 1);
        rootLayout.setExpandRatio(course, 9);
    }

    @Override
    public void enter (ViewChangeListener.ViewChangeEvent event){
        Notification.show("Bem vindo à página de Exatas.");
    }
}

