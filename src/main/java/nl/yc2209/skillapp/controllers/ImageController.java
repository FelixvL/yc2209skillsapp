package nl.yc2209.skillapp.controllers;

import nl.yc2209.skillapp.models.Image;
import nl.yc2209.skillapp.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "image")
public class ImageController{

    private final ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {this.imageService = imageService;}

    @GetMapping
    public List<Image> getAllImages() {return imageService.getAllImages();}

    @GetMapping(value = "{id}")
    public Image getSingleImage(@PathVariable("id") Long id) {return imageService.getSingleImage(id).get();}

    @PostMapping
    public void createImage(@RequestBody Image image) { imageService.addNewImage(image);}

}
