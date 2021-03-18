package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satellites = new ArrayList<>();

    public void registerSatellite(Satellite satellite) {
        if (satellite == null) {
            throw new NullPointerException("Parameter must not be null!");
        }
        satellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        for (Satellite satellite : satellites) {
            if (satellite.getRegisterIdent().equals(registerIdent)) {
                return satellite;
            }
        }
        throw new IllegalArgumentException(String.format("Satellite with the given registration cannot be found!%s", registerIdent));
    }

    @Override
    public String toString() {
        return satellites.toString();
    }
}
