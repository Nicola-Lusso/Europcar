package com.example.europcar.RestController;

import com.example.europcar.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.europcar.entity.Area;
import java.util.List;

@RestController
@RequestMapping("/api/area")
public class RestAreaController {

    @Autowired
    AreaService areaService;

    @GetMapping(value = "/{id}")
    public Area getById(@PathVariable("id") Integer id) {
        return areaService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<Area> getAll() {
        return areaService.findAll();
    }

    @PostMapping(value = "/newArea")
    public void newArea(@RequestBody Area area) {
        areaService.save(area);
    }

    @DeleteMapping(value = "/deleteArea/{id}")
    public void deleteAreaPerId(@PathVariable("id") Integer id) {
        areaService.delete(id);
    }

}
