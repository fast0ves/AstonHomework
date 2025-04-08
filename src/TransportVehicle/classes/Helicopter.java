package TransportVehicle.classes;

import TransportVehicle.abstractClasses.TransportVehicle;
import TransportVehicle.interfaces.MoveCargo;
import TransportVehicle.interfaces.Propeller;
import TransportVehicle.interfaces.Wheels;

public class Helicopter extends TransportVehicle implements Wheels, Propeller, MoveCargo {
}
