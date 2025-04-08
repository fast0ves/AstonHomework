package TransportVehicle.classes;

import TransportVehicle.abstractClasses.TransportVehicle;
import TransportVehicle.interfaces.MoveCargo;
import TransportVehicle.interfaces.Propeller;
import TransportVehicle.interfaces.Wheels;
import TransportVehicle.interfaces.Wings;

public class Plane extends TransportVehicle implements Wheels, Propeller, Wings, MoveCargo {
}
