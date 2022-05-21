module javaFX1 {
	requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
	requires java.sql;
        
	opens application to javafx.graphics, javafx.fxml, javafx.controls;
	opens gui to javafx.fxml;
	opens model.entities to javafx.base;
}
