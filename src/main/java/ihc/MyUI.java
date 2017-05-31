package ihc;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.ClassResource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;


/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout fullPageLayout = new VerticalLayout();

        final VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.setWidth(30, Unit.CM);
        fullPageLayout.addComponent(rootLayout);
        fullPageLayout.setComponentAlignment(rootLayout, Alignment.TOP_CENTER);

        final HorizontalLayout header = new HorizontalLayout();

        final Image logo = new Image();
        logo.setSource(new ThemeResource("./images/uni.png"));
        header.addComponent(logo);

        final MenuBar navBar = new MenuBar();
        navBar.addItem("Cursos", null, null);
        navBar.addItem("Testes Vocacionais", null, null);
        navBar.addItem("Vídeos", null, null);
        navBar.addItem("Sobre", null, null);
        navBar.addItem("FAQ", null, null);
        navBar.setWidth("100%");
        header.addComponent(navBar);
        header.setComponentAlignment(navBar, Alignment.MIDDLE_LEFT);
        header.setExpandRatio(logo, 1);
        header.setExpandRatio(navBar, 9);

//        final TextField name = new TextField();
//
//        Button button = new Button("Click Me");
//        button.addClickListener( e -> {
//            rootLayout.addComponent(new Label("Thanks " + name.getValue()
//                    + ", it works!"));
//        });

        final HorizontalLayout course = new HorizontalLayout();
        course.setMargin(true);

        final ListSelect<String> coursesList = new ListSelect<String>("Cursos de exatas.");
        coursesList.setItems("Agronomia", "Engenharia de Computação", "Engenharia de Software", "Física", "Matemática", "Química");
        coursesList.setRows(10);
        course.addComponent(coursesList);

//        final TextArea courseData = new TextArea();
//        course.addComponent(courseData);

        rootLayout.addComponents(header, course);

        rootLayout.setExpandRatio(header, 1);
        rootLayout.setExpandRatio(course, 9);

        setContent(fullPageLayout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
