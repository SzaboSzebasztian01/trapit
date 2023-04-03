/*
 * File:.MainPanel.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-04-03
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

 package views;

import com.github.SzaboSzebasztian1.inputlib.ButtonPanel;
import com.github.SzaboSzebasztian1.inputlib.InputPanel;
import com.github.SzaboSzebasztian1.inputlib.TitlePanel;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    TitlePanel titlePanel;
    InputPanel sideUpPanel;
    InputPanel sideDownPanel;
    InputPanel heightPanel;
    ButtonPanel buttonPanel;
    InputPanel volumePanel;
    Label aboutLabel;

    public MainPanel() {
        this.initComponent();
        this.addComponent();
        this.setMainPanel();
        this.setComponent();
    }

    private void initComponent(){
        this.titlePanel = new TitlePanel();
        this.sideUpPanel = new InputPanel();
        this.sideDownPanel = new InputPanel();
        this.heightPanel = new InputPanel();
        this.buttonPanel = new ButtonPanel();
        this.volumePanel = new InputPanel();
        this.aboutLabel = new Label();
    }

    private void setComponent(){
        this.titlePanel.setText("Trapéz terület számítás");
        this.sideUpPanel.setText("Felső oldal: ");
        this.sideDownPanel.setText("Alsó oldal: ");
        this.heightPanel.setText("Magasság: ");
        this.buttonPanel.setCalcButtonText("Számít");
        this.volumePanel.setText("Terület: ");
        this.aboutLabel.setText("Szabó Szebasztián, Szoft I-1-N, 2023-04-03");

    }
    
    private void addComponent(){
        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.sideUpPanel);
        this.getChildren().add(this.sideDownPanel);
        this.getChildren().add(this.heightPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.volumePanel);
        this.getChildren().add(this.aboutLabel);
    }

    private void setMainPanel(){
        this.setAlignment(Pos.CENTER);
    }

    public TitlePanel getTitlePanel() {
        return titlePanel;
    }

    public InputPanel getSideUpPanel() {
        return sideUpPanel;
    }

    public InputPanel getSideDownPanel() {
        return sideDownPanel;
    }

    public InputPanel getHeightPanel() {
        return heightPanel;
    }

    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }

    public InputPanel getVolumePanel() {
        return volumePanel;
    }

    
}
