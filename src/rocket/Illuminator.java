package rocket;

import exceptions.ObservationException;
import skyObjects.ObservableObject;
import skyObjects.SkyObservationObjects;

public class Illuminator implements ObservableObject {
    private String view;

    public Illuminator(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public SkyObservationObjects observe() throws exceptions.ObservationException {
        if (view == null || view.isEmpty()) {
            throw new ObservationException("Ничего не видно");
        }
        return new SkyObservationObjects(view, ""); // Только Луна, Ракета пустая
    }
}
