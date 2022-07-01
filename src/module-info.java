module TheJavaGraph {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires com.jfoenix;
	requires javafx.base;
	requires org.controlsfx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
