package ihc;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.MenuBar;

/**
 * Created by falbuquerque on 01/06/17.
 */
public class Header extends HorizontalLayout {
    public Header() {
        final Image logo = new Image();
        logo.setSource(new ThemeResource("./images/uni.png"));
        addComponent(logo);

        final MenuBar navBar = new MenuBar();
        navBar.addItem("Cursos", null, null);
        navBar.addItem("Testes Vocacionais", null, null);
        navBar.addItem("Vídeos", null, null);
        navBar.addItem("Sobre", null, null);
        navBar.addItem("FAQ", null, null);
        navBar.setWidth("100%");
        addComponent(navBar);
        setComponentAlignment(navBar, Alignment.MIDDLE_LEFT);
        setExpandRatio(logo, 1);
        setExpandRatio(navBar, 9);
    }
}
