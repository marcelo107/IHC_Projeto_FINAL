package ihc.components;

import java.io.BufferedReader;
import java.io.FileReader;

import com.vaadin.server.Sizeable.Unit;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class InfoProfessionalAptitude extends VerticalLayout {
	public InfoProfessionalAptitude() {
        //addStyleName("infoStyle");
        setHeight(500, Unit.PIXELS);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ihc/html/ProfessionalAptitude.html"));
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
