package robotapi;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record MapPointService(MapPointRepo repo) {

    public void addPoint(MapPoint mapPoint) {
        repo.save(mapPoint);
    }


    public List<MapPoint> getMapPoints() {
        return repo.findAll();
    }

    public void addMapPoints(List<MapPoint> mapPoints) {
        repo.saveAll(mapPoints);
    }
}
