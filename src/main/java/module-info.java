module at.ac.fhcampuswien.fhmdb {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.jfoenix;
    opens at.ac.fhcampuswien.fhmdb;
    opens at.ac.fhcampuswien.fhmdb.models;

    exports at.ac.fhcampuswien.fhmdb;
    exports at.ac.fhcampuswien.fhmdb.controller;
    opens at.ac.fhcampuswien.fhmdb.controller to javafx.fxml;
}