/******************************************************************************************************
    1. Активировать Intellij. Сбросить скрин.
*****************************************************************************************************/

package com.nikomu.exercise1;

import com.nikomu.main_menu.Message;

public class Exercise1App {
    public static final String imagePath = "resources/IntelliJ_activation.jpg";

    public static void main(String[] args) {
        ImageViewer viewer = new ImageViewer(imagePath);
        viewer.show();
        Message.warningMessage("\n\tИзображение было открыто в программе по-умолчанию\n");
    }
}
