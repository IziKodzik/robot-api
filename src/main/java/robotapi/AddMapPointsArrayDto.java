package robotapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AddMapPointsArrayDto {
    @JsonProperty("map-points")
    public List<MapPoint> mapPoints;
}
