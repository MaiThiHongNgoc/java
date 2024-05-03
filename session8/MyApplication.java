package session8;

import session8.view.LoginconsoleUI;

import java.io.IOException;

public class MyApplication {
    public static void main(String[] args) throws IOException {
        LoginconsoleUI loginconsoleUI = new LoginconsoleUI();
        loginconsoleUI.start();
    }
}
