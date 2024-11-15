package claurendeau.hackqc.algo.Backend.mapper;

import claurendeau.hackqc.algo.Backend.dto.LocationDTO;
import claurendeau.hackqc.algo.Backend.modeles.Location;

public class LocationMapper {
    public static LocationDTO toDTO(Location location) {
        return new LocationDTO(location.getId(), location.getLatitude(), location.getLongitude());
    }
    public static Location toEntity(LocationDTO locationDTO) {
        return new Location(locationDTO.latitude(), locationDTO.longitude());
    }
}
