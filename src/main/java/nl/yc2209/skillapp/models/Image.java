package nl.yc2209.skillapp.models;

import org.hibernate.annotations.Nationalized;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Image {
        @Id
        @GeneratedValue
        private Long id;

        @Nationalized
        private String imageCode;

        @OneToOne
        private Goal goal;

        public Image()
        {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getImageCode() {
            return imageCode;
        }

        public void setImageCode(String imageCode) {
            this.imageCode = imageCode;
        }
    }

