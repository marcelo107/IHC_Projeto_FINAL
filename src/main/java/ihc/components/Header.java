package ihc.components;

import com.vaadin.event.MouseEvents;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Notification;
import com.vaadin.ui.MenuBar.MenuItem;

import ihc.MyUI;
import ihc.views.ExactView;
import ihc.views.HealthView;
import ihc.views.HumanitiesView;
import ihc.views.VocationalTestsView;

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
				MyUI.getCurrent().getNavigator().removeView("Exact");
				MyUI.getCurrent().getNavigator().addView("Exact", new ExactView());
				MyUI.getCurrent().getNavigator().navigateTo("Exact");
			}
		});
        cursos.addItem("Humanas", new MenuBar.Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {
				MyUI.getCurrent().getNavigator().removeView("Humanities");
				MyUI.getCurrent().getNavigator().addView("Humanities", new HumanitiesView());
				MyUI.getCurrent().getNavigator().navigateTo("Humanities");
			}
		});
        cursos.addItem("Saúde", new MenuBar.Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {
				MyUI.getCurrent().getNavigator().removeView("Health");
				MyUI.getCurrent().getNavigator().addView("Health", new HealthView());
				MyUI.getCurrent().getNavigator().navigateTo("Health"); 
			}
		});
        
        MenuItem vocationalTests = navBar.addItem("Testes Vocacionais", null, null); 
        vocationalTests.addItem("Testes Online", new MenuBar.Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				MyUI.getCurrent().getNavigator().removeView("OnlineTests");
				MyUI.getCurrent().getNavigator().addView("OnlineTests", new VocationalTestsView());
				MyUI.getCurrent().getNavigator().navigateTo("OnlineTests");
			}
		});
        vocationalTests.addItem("Marcar Online", new MenuBar.Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {
				Notification note = new Notification("Funcionalidade ainda não implementada!", 
            			"Em breve essa funcionalidade estará disponível.", 
            			Notification.Type.WARNING_MESSAGE);
            	note.show(MyUI.getCurrent().getPage());
			}
		});
        vocationalTests.addItem("Resultados", new MenuBar.Command() {        	        
			@Override
			public void menuSelected(MenuItem selectedItem) {
				Notification note = new Notification("Funcionalidade ainda não implementada!", 
            			"Em breve essa funcionalidade estará disponível.", 
            			Notification.Type.WARNING_MESSAGE);
            	note.show(MyUI.getCurrent().getPage());
			}
		});
        navBar.addItem("Vídeos", null, new MenuBar.Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				Notification note = new Notification("Funcionalidade ainda não implementada!", 
            			"Em breve essa funcionalidade estará disponível.", 
            			Notification.Type.WARNING_MESSAGE);
            	note.show(MyUI.getCurrent().getPage());
			}
		});
        navBar.addItem("Sobre", null, new MenuBar.Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				Notification note = new Notification("Funcionalidade ainda não implementada!", 
            			"Em breve essa funcionalidade estará disponível.", 
            			Notification.Type.WARNING_MESSAGE);
            	note.show(MyUI.getCurrent().getPage());
			}
		});
        navBar.addItem("FAQ", null, new MenuBar.Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
            	MyUI.getCurrent().getNavigator().navigateTo("FAQ"); 
            	}
        });
        navBar.setWidth("100%");
        addComponent(navBar);
        setComponentAlignment(navBar, Alignment.MIDDLE_LEFT);
        setExpandRatio(logo, 1);
        setExpandRatio(navBar, 9);
    }
}
