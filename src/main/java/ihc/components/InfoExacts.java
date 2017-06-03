package ihc.components;

import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by falbuquerque on 03/06/17.
 */
public class InfoExacts extends VerticalLayout {
    public InfoExacts() {
        //addStyleName("infoStyle");
        setHeight(500, Unit.PIXELS);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ihc/html/Exacts.html"));
            String line = null;
            StringBuilder text = new StringBuilder();


            while ((line = reader.readLine()) != null)
                text.append(line);

            Label info = new Label(text.toString(), ContentMode.HTML);
            info.setWidth(500, Unit.PIXELS);
            addComponent(info);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
