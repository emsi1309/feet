package fleetmsv2.fleet.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

import fleetmsv2.parameters.models.CommonObject;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class VehicleModel extends CommonObject {

}
