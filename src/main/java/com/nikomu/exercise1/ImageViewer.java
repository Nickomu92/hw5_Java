package com.nikomu.exercise1;

import com.nikomu.main_menu.Message;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

// Класс "Просмотрщик изображения"
public class ImageViewer {
    // Поле свойство представляющее путь к изображению относительно текущего проекта
    private String imagePath;

    // Конструктор №1 без параметров (по-умолчанию)
    public ImageViewer() {}

    // Конструктор №2
    public ImageViewer(String imagePath) {
        this.imagePath = imagePath;
    }

    // Метод для получения значения пути к изображению
    public String getImagePath() {
        return this.imagePath;
    }

    // Метод для установки (изменения) пути к изображению
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    // Метод для запуска и отображения изображения приложением по-умолчанию
    public void show() {
        File imageFile = new File(imagePath);
        Desktop desktop = Desktop.getDesktop();

        try {
            desktop.open(imageFile);
        } catch (IOException e) {
            Message.errorMessage("\n[message] " + e.getMessage() + "\n");
        }
    }
}
