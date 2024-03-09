module br.com.eduardoxerxenevsy {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.eduardoxerxenevsy to javafx.fxml;
    exports br.com.eduardoxerxenevsy;
}
