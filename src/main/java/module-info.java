module by.miapr.algorithm {
    requires javafx.controls;
    requires javafx.fxml;
    opens by.miapr.scenes.controllers to javafx.fxml;

    exports by.miapr;
    exports by.miapr.algorithm;
}