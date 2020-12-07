package com.example.game;

/**
 * Created by jean on 12/7/20.
 */
import java.util.List;

public interface ISavable {

    List<String> write();
    void read(List<String> savedValues);

}