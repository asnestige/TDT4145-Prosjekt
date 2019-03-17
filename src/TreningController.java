
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.text.html.HTMLDocument.RunElement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Arrays;
import java.util.List;

public class TreningController {

    public void registrerOvelse(){
    try{

        List<String> input = Arrays.asList(knapp.getText().split(","));
        String navn = input.get(0);
        String beskrivelse = input.get(1);
        AdminController.insertExercise(myConn, navn, beskrivelse);
        textArea.setText("Exercise added");
        }
        catch (RuntimeException e) {
        textArea.setText("Error: Key is already taken or you wrote unvalid data");
        }

    }

    public void registrerApperat() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {

        try {
            List<String> input = Arrays.asList(knapp.getText().split(","));
            String navn = input.get(0);
            String beskrivelse = input.get(1);
//legg til apperat
            AdminController.insertMachine(myConn, navn, beskrivelse);
            textArea.setText("Machine added");
        }

        catch (RuntimeException e){

            textArea.setText("Error: Key is already taken or you wrote unvalid data");
        }

    }

    public void registrerTreningsokt(){

        try {
            List<String> input = Arrays.asList(knapp.getText().split(","));


            List<String> dateString = Arrays.asList(input.get(0).split("-"));
            int ar = Integer.parseInt(dateString.get(0));
            int maned = Integer.parseInt(dateString.get(1));
            int dag = Integer.parseInt(dateString.get(2));
            Date dato = new Date(ar - 1900, maned - 1, dag);
            Time tid = Time.valueOf(input.get(1));


            int varighet = Integer.parseInt(input.get(2));
            int personligform = Integer.parseInt(input.get(3));
            int prestasjon = Integer.parseInt(input.get(4));
            String notat = input.get(5);
        }

        catch (RuntimeException e){
            textArea.setText("Error: Key is already taken or you wrote unvalid data");
        }


    }

    public void registrerOvelsegruppe(){
        try{
            List<Sting> input = Arrays.asList(knapp.getText().split(","));
            Sting navn = input.get(0);
            AdminController.insertExerciseGroup(myConn, navn);
            textArea.setText("ExerciseGroup added");
        }
        catch (RuntimeException e) {
            textArea.setText("Error: Key is already taken or you wrote unvalid data");
        }

        }
    }

