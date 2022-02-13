package io.github.kabanfriends.lessutilities.schem.utils;

public class DFText {

    public final String text;

    public DFText(String text) {
        this.text = text;
    }

    public String asJson() {
        return "{\"id\":\"txt\",\"data\":{\"name\":\"" + this.text + "\"}}";
    }

}
