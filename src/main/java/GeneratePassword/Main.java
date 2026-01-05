package GeneratePassword;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.w3c.dom.Text;
import GeneratePassword.Password;
import javafx.scene.layout.VBox;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label labelSizePassword = new Label("Tamanho da senha : ");
        TextField textFieldSizePassword = new TextField("8");
        Button buttonGeneratePassword = new Button("Gerar senha");

        Label labelPassword = new Label("Senha gerada : ");
        TextField textFieldPassword = new TextField();
        textFieldPassword.setEditable(false);

        buttonGeneratePassword.setOnAction(e -> {
            int sizePassword = Integer.parseInt(textFieldSizePassword.getText());
            String password = Password.generatePassword(sizePassword);
            textFieldPassword.setText(password);
        });

        VBox vbox = new VBox(labelSizePassword, textFieldSizePassword, buttonGeneratePassword, labelPassword, textFieldPassword);
        vbox.setSpacing(20);
        vbox.setPadding(new Insets(20));

        Scene scene = new Scene(vbox, 250, 250);
        stage.setTitle("Minha App JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
