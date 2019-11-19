package cards.playing;

public class FaceValue {

    private Integer value;

    public FaceValue(Integer value) {
        this.value = value;
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
