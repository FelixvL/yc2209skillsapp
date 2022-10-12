package nl.yc2209.skillapp.models;


import javax.persistence.*;

@Entity
public class Image {
        @Id
        @GeneratedValue
        private Long id;

    @Column(name = "image", unique = false, nullable = false, length = 100000)
        private String imageCode;

        @OneToOne
        private Goal goal;

        public Image() {
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

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }
}

