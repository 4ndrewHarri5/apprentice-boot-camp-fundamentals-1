package cards.challenge;

import cards.ValueService;

public class FaceValue implements ValueService {

    private Integer value;

    public FaceValue(Integer value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.convertValueToString();
    }

    private String convertValueToString() {
        String faceValue = value.toString();
        switch (value) {
            case 1: faceValue = "ace"; break;
            case 10: faceValue = "jack"; break;
            case 11: faceValue = "queen"; break;
            case 12: faceValue = "king"; break;
        }
        return faceValue;
    }

    @Override
    public String toString() {
        return convertValueToString();
    }
}
