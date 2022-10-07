package nl.yc2209.skillapp.service;

import ExceptionHandler.EmailAlreadyTakenExeption;
import ExceptionHandler.RecordNotFoundException;
import nl.yc2209.skillapp.models.Image;
import nl.yc2209.skillapp.models.User;
import nl.yc2209.skillapp.repository.ImageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {

    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository){
        this.imageRepository = imageRepository;
    }



    public void addNewImage(Image image) {imageRepository.save(image);}


    public List<Image>getAllImages() {return imageRepository.findAll();}


    public Optional<Image> getSingleImage(Long id) {
        boolean exists = imageRepository.existsById(id);
        if(!exists) {
            throw new RecordNotFoundException("De image is niet gevonden");
        }
        Optional<Image> image = imageRepository.findById(id);
        return image;
    }


}
