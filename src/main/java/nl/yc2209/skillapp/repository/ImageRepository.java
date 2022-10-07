package nl.yc2209.skillapp.repository;

import nl.yc2209.skillapp.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
