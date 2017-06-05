package ihc.components;

import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

import java.io.BufferedReader;
import java.io.FileReader;


/**
 * Created by falbuquerque on 02/06/17.
 */
public class PanelFAQ extends HorizontalLayout {
    public PanelFAQ() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ihc/html/FAQ.html"));
            String line = null;
            StringBuilder text = new StringBuilder();


            while ((line = reader.readLine()) != null)
                text.append(line);

            Label faq = new Label(text.toString(), ContentMode.HTML);
            faq.setSizeFull();
            faq.setHeight(30, Unit.CM);
            addComponent(faq);
            setExpandRatio(faq, 80);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        setMargin(false);
        setWidth(30, Sizeable.Unit.CM);

        Survey survey = new Survey();
        addComponent(survey);
        setExpandRatio(survey, 20);
    }
}
