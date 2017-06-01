package ihc;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;

/**
 * Created by falbuquerque on 01/06/17.
 */
public class Course extends HorizontalLayout{
    public Course() {
        setMargin(true);

        final ListSelect<String> coursesList = new ListSelect<String>("Cursos de exatas.");
        coursesList.setItems("Agronomia", "Engenharia de Computação", "Engenharia de Software", "Física", "Matemática", "Química");
        coursesList.setRows(10);
        addComponent(coursesList);

        final Label label = new Label("Aqui vem o texto.");
        addComponent(label);

//        final TextArea courseData = new TextArea();
//        course.addComponent(courseData);
    }


}
