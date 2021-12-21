package robotapi;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static robotapi.MapPointController.mainPath;

@CrossOrigin
@RestController
@Slf4j
@RequestMapping(mainPath)
@RequiredArgsConstructor
public class MapPointController {

    public static final String mainPath = "/map-points";
    private final MapPointService mapPointService;

    @PostMapping
    public ResponseEntity<?> addPoints(@RequestBody
                                                   AddMapPointsArrayDto mapPoints){
        mapPointService.addMapPoints(mapPoints.mapPoints);
        return ResponseEntity.ok("posted");
    }
    @GetMapping
    public ResponseEntity<?> getPoints(){
        return ResponseEntity.ok(mapPointService.getMapPoints());
    }

}
