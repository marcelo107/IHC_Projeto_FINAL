package ihc.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Image;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

import ihc.components.Header;
import ihc.components.HomeCenter;

/**
 * Created by falbuquerque on 01/06/17.
 */
public class HomeView extends VerticalLayout implements View {

    public HomeView() {final VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.setWidth(30, Sizeable.Unit.CM);
        addComponent(rootLayout);
        setComponentAlignment(rootLayout, Alignment.TOP_CENTER);
        
        Header header = new Header();
        rootLayout.addComponent(header);

        final HomeCenter center = new HomeCenter();
        rootLayout.addComponent(center);
    }

    @Override
    public void enter (ViewChangeListener.ViewChangeEvent event){
        Notification.show("Bem vindo à página Home.");
    }
}
