package ihc.components;

import com.vaadin.event.MouseEvents;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;

import ihc.MyUI;

import com.vaadin.ui.UI;

/**
 * Created by falbuquerque on 01/06/17.
 */
public class Header extends HorizontalLayout {
    public Header() {
        final Image logo = new Image();
        logo.setSource(new ThemeResource("./images/uni.png"));
        logo.addClickListener(new MouseEvents.ClickListener() {
			
			@Override
			public void click(ClickEvent event) {
				MyUI.getCurrent().getNavigator().navigateTo("");				
			}
		});
        addComponent(logo);

        final MenuBar navBar = new MenuBar();
        MenuItem cursos = navBar.addItem("Cursos",null, null);
        cursos.addItem("Exatas", new MenuBar.Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {
				MyUI.getCurrent().getNavigator().navigateTo("Exact");
			}
		});
        cursos.addItem("Humanas", new MenuBar.Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {
				MyUI.getCurrent().getNavigator().navigateTo("Humanities");
			}
		});
        cursos.addItem("Saúde", new MenuBar.Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {MyUI.getCurrent().getNavigator().navigateTo("Health"); }
		});
        
        navBar.addItem("Testes Vocacionais", null, null);
        navBar.addItem("Vídeos", null, null);
        navBar.addItem("Sobre", null, null);
        navBar.addItem("FAQ", null, new MenuBar.Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {MyUI.getCurrent().getNavigator().navigateTo("FAQ"); }
        });
        navBar.setWidth("100%");
        addComponent(navBar);
        setComponentAlignment(navBar, Alignment.MIDDLE_LEFT);
        setExpandRatio(logo, 1);
        setExpandRatio(navBar, 9);
    }
}
