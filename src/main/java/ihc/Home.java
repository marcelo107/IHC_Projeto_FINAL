package ihc;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.*;
import org.vaadin.virkki.carousel.HorizontalCarousel;
import org.vaadin.virkki.carousel.client.widget.gwt.ArrowKeysMode;
import org.vaadin.virkki.carousel.client.widget.gwt.CarouselLoadMode;


/**
 * Created by falbuquerque on 01/06/17.
 */
public class Home extends VerticalLayout implements View {

    public Home() {final VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.setWidth(30, Sizeable.Unit.CM);
        addComponent(rootLayout);
        setComponentAlignment(rootLayout, Alignment.TOP_CENTER);

        Header header = new Header();
        rootLayout.addComponent(header);

        final HorizontalCarousel carousel = new HorizontalCarousel();
        // Only react to arrow keys when focused
        carousel.setArrowKeysMode(ArrowKeysMode.FOCUS);
        // Fetch children lazily
        carousel.setLoadMode(CarouselLoadMode.LAZY);
        // Transition animations between the children run 500 milliseconds
        carousel.setTransitionDuration(500);

        // Add the child Components
        carousel.addComponent(new Button("First child"));
        carousel.addComponent(new Label("Second child"));
        carousel.addComponent(new TextField("Third child"));
        rootLayout.addComponent(carousel);


    }

    @Override
    public void enter (ViewChangeListener.ViewChangeEvent event){
        Notification.show("Bem vindo à página Home.");
    }
}
