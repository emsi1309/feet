package fleetmsv2.parameters.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fleetmsv2.parameters.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
