package ihc.components;

import com.vaadin.event.MouseEvents;
import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by falbuquerque on 02/06/17.
 */
public class InfoAgronomia extends VerticalLayout {
    public InfoAgronomia() {
        //addStyleName("infoStyle");
        setHeight(500, Unit.PIXELS);
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ihc/html/Agronomia.html"));
            String line = null;
            StringBuilder text = new StringBuilder();

            while ((line = reader.readLine()) != null)
                text.append(line);

            Label info = new Label(text.toString(), ContentMode.HTML);
            info.setWidth(500, Unit.PIXELS);
            addComponent(info);
            setExpandRatio(info, 60);

            Embedded video = new Embedded(null, new ExternalResource("https://www.youtube.com/watch?v=2qMhb0WDVyQ"));
            video.setMimeType("application/x-shockwave-flash");
            video.setParameter("allowFullScreen", "true");

            addComponent(video);
            setComponentAlignment(video, Alignment.MIDDLE_CENTER);
            setExpandRatio(video, 40);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
