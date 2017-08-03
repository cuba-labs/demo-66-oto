package com.company.demo.web.screens;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.Map;

public class ActionsDemo extends AbstractWindow {

    @Inject
    private ComponentsFactory componentsFactory;
    @Inject
    private Button helloBtn;
    @Inject
    private HBoxLayout box;

    @Override
    public void init(Map<String, Object> params) {
        helloBtn.setAction(new BaseAction("hello")
                .withHandler(e -> showNotification("Hello", NotificationType.TRAY)));

        PickerField pickerField = componentsFactory.createComponent(PickerField.class);

        pickerField.addAction(new BaseAction("hello")
                .withCaption(null)
                .withDescription(getMessage("helloDescription"))
                .withIcon("icons/ok.png")
                .withHandler(e -> showNotification("Hello", NotificationType.TRAY)));
        
        box.add(pickerField);
    }

    public void onDialogBtnClick() {
        showOptionDialog("Dialog", "A message", MessageType.WARNING, new Action[] {
                new DialogAction(DialogAction.Type.YES).withHandler(e -> showNotification("OK!", NotificationType.TRAY)),
                new DialogAction(DialogAction.Type.NO)
        });
    }
}