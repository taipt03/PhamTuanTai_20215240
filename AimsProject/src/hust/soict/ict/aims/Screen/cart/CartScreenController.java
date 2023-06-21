package hust.soict.ict.aims.Screen.cart;
import javax.swing.event.ChangeListener;

import hust.soict.ict.aims.Cart.Cart;
import hust.soict.ict.aims.Media.Playable;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

public class CartScreenController {

    private Cart cart;
    @FXML
    private TableColumn<?, ?> colMediaCost;

    @FXML
    private TableColumn<?, ?> colMediaTitle;

    @FXML
    private TableColumn<?, ?> colMediacategory;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private TableView<?> tblMedia;

        @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;


    public CartScreenController(Cart cart){
        super();
        this.cart=cart;
    }
    private void initialize(){
        colMediaTitle.setCellValueFactory(
            new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(
            new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(
            new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getItemsOrdered());
    btnPlay.setVisible(false);
    btnRemove.setVisible(false);

    tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    
                    @Override
                    public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                        if (newValue != null) {
                            updateButtonBar(newValue);
                        }
                    }
                }
        );
    }
    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        if (media instanceof Playable) {
            btnPlay.setVisible(true);
        }
        else {
            btnPlay.setVisible(false);
        }
    }
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
    }
}

