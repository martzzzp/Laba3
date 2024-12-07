package skyObjects;

import exceptions.ObservationException;

public class Sky implements ObservableObject {
    private boolean visibility;

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }
    @Override
    public SkyObservationObjects observe() throws ObservationException {
        if (visibility) {
            return new SkyObservationObjects("Moon", "Rocket");
        } else {
            throw new ObservationException("no visibility.");
        }
    }
}